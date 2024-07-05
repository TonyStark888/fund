package com.hy.playhard.fund.biz;

import com.hy.playhard.fund.constant.FundType;
import com.hy.playhard.fund.pojo.*;
import com.hy.playhard.fund.service.FundHoldingService;
import com.hy.playhard.fund.service.FundService;
import com.hy.playhard.fund.service.impl.FundHoldingServiceImpl;
import com.hy.playhard.fund.service.impl.FundServiceImpl;
import com.hy.playhard.fund.vo.FundCodeInfo;
import com.hy.playhard.fund.vo.FundVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * 实时估算基金涨跌
 *
 * @author huangying1
 */
public class FundReport {

    public static void main(String[] args) {
        String date = "2024-03-31";

        // 初始化基金信息，可以从外部文件读取，也可以直接使用对象指定
        FundHoldingService fundHoldingService = new FundHoldingServiceImpl();
        List<FundCodeInfo> fundList = fundHoldingService.initFundFromFile("D://fund code list.txt");

        Map<String, FundVo> result = new TreeMap<>();
        for (FundCodeInfo info : fundList) {
            FundVo fundVo = null;

            // 目前只有两个处理方法，主动型和的非主动型的
            if (FundType.ACTIVELY_MANAGED_FUNDS.equals(info.getFundType())) {
                fundVo = getFundFluctuation(info.getFundCode(), date);
            } else {
                fundVo = getFundEstimate(info.getFundCode());
            }
            // 设置账户
            fundVo.setAccount(info.getAccount());
            result.put(info.getFundCode(), fundVo);
        }

        System.out.println("***************** result ********************");

        StringBuffer voStr = new StringBuffer();
        // 表头行
        voStr.append("基金账号" + "\t");
        voStr.append("基金名称" + "\t");
        voStr.append("基金代码" + "\t");
        voStr.append("权重股票持仓比例(%)" + "\t");
        voStr.append("债券持仓比例(%)" + "\t");
        voStr.append("总持仓比例(%)" + "\t");
        voStr.append("上一日涨跌(%)" + "\t");
        voStr.append("当日涨跌(%)" + "\t");
        voStr.append("两日累计涨跌(%)" + "\t\n");

        // 对结果排序，按收益率倒序排序
        // 将 Map 转换为 List<Entry<String, Dto>>
        List<Map.Entry<String, FundVo>> entryList = new ArrayList<>(result.entrySet());
        // 对 List 进行排序
        entryList.sort(Comparator.comparing(e -> e.getValue().getFluctuation()));
        // 将排序后的 List 转换回 LinkedHashMap
        Map<String, FundVo> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, FundVo> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        Iterator<Map.Entry<String, FundVo>> ite = sortedMap.entrySet().iterator();
        while (ite.hasNext()) {
            Map.Entry<String, FundVo> next = ite.next();
            FundVo vo = next.getValue();
            voStr.append(vo.getAccount() + "\t");
            voStr.append(vo.getFundName() + "\t");
            voStr.append("\'" + vo.getFundCode() + "\t");
            if (BigDecimal.ZERO.equals(vo.getStockRatioTotal())) {
                voStr.append("-" + "\t");
            } else {
                voStr.append(vo.getStockRatioTotal() + "\t");
            }
            if (BigDecimal.ZERO.equals(vo.getBondRatioTotal())) {
                voStr.append("-" + "\t");
            } else {
                voStr.append(vo.getBondRatioTotal() + "\t");
            }
            if (BigDecimal.ZERO.equals(vo.getRatioTotal())) {
                voStr.append("-" + "\t");
            } else {
                voStr.append(vo.getRatioTotal() + "\t");
            }

            voStr.append(vo.getYesterdayFluctuation() + "\t");
            voStr.append(vo.getFluctuation() + "\t");
            voStr.append(vo.getYesterdayFluctuation().add(vo.getFluctuation()) + "\t\n");
        }
        System.out.println(voStr);
    }

    /**
     * 获取基金实时预估涨跌幅度
     * 自行根据持仓计算的
     *
     * @param code
     * @param date
     * @return
     */
    public static FundVo getFundFluctuation(String code, String date) {
        FundService fundService = new FundServiceImpl();
        FundStockResp fundStockInfo = fundService.getFundStockInfo(code, date);
        String stockIds = fundService.buildStocksIds(fundStockInfo);
        String bondIds = fundService.buildBondIds(fundStockInfo);

        Map<String, BigDecimal> stockRatio = fundService.getStockRatio(fundStockInfo);
        Map<String, BigDecimal> bondRatio = fundService.getBondRatio(fundStockInfo);

        StockPriceFluResp stockPriceList = fundService.getStockPriceList(stockIds);
        StockPriceFluResp bondPriceList = fundService.getStockPriceList(bondIds);

        BigDecimal stockFlu = fundService.calcFluctuation(stockPriceList, stockRatio);
        BigDecimal bondFlu = fundService.calcFluctuation(bondPriceList, bondRatio);

        // 获取基金名字
        SimpleBaseInfo baseInfo = fundService.fundSimpleBaseInfo(code);

        // 组装响应
        FundVo fundVo = new FundVo();
        fundVo.setFundCode(code);
        fundVo.setFundName(baseInfo.getSHORTNAME());
        fundVo.setStockRatioTotal(stockRatio.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add));
        fundVo.setBondRatioTotal(bondRatio.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add));
        fundVo.setRatioTotal(fundVo.getStockRatioTotal().add(fundVo.getBondRatioTotal()));
        fundVo.setFluctuation(stockFlu.add(bondFlu).setScale(2, RoundingMode.HALF_UP));
        fundVo.setYesterdayFluctuation(new BigDecimal(baseInfo.getRZDF()));

        return fundVo;
    }

    /**
     * 获取基金实时预估涨跌幅度
     * 直接从平台里获取的
     *
     * @param code
     * @return
     */
    public static FundVo getFundEstimate(String code) {
        FundVo fundVo = new FundVo();
        fundVo.setFundCode(code);


        FundService fundService = new FundServiceImpl();
        // 获取昨天的涨跌幅
        SimpleBaseInfo baseInfo = fundService.fundSimpleBaseInfo(code);
        FundEstimateData fundStockInfo = fundService.getFundEstimatedIncrease(code);
        FundEstimateExpansion expansion = fundStockInfo.getExpansion();
        if (null != expansion) {
            // 组装响应
            fundVo.setFundName(expansion.getSHORTNAME());
            fundVo.setStockRatioTotal(BigDecimal.ZERO);
            fundVo.setBondRatioTotal(BigDecimal.ZERO);
            fundVo.setRatioTotal(BigDecimal.ZERO);
            fundVo.setFluctuation(expansion.getGSZZL());
            fundVo.setYesterdayFluctuation(new BigDecimal(baseInfo.getRZDF()));
        }

        return fundVo;
    }
}
