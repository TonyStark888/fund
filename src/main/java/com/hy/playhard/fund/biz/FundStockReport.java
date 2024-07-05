package com.hy.playhard.fund.biz;

import com.hy.playhard.fund.pojo.Diff;
import com.hy.playhard.fund.pojo.FundStockResp;
import com.hy.playhard.fund.pojo.StockPriceFluResp;
import com.hy.playhard.fund.service.FundHoldingService;
import com.hy.playhard.fund.service.FundService;
import com.hy.playhard.fund.service.impl.FundHoldingServiceImpl;
import com.hy.playhard.fund.service.impl.FundServiceImpl;
import com.hy.playhard.fund.vo.FundCodeInfo;
import com.hy.playhard.fund.vo.FundStockVo;

import java.math.BigDecimal;
import java.util.*;

/**
 * 查询基金的持仓股比例
 * @author huangying1
 */
public class FundStockReport {

    public static void main(String[] args) {
        String date = "2024-03-31";

        // 初始化基金信息，可以从外部文件读取，也可以直接使用对象指定
        FundHoldingService fundHoldingService = new FundHoldingServiceImpl();
        List<FundCodeInfo> fundList = fundHoldingService.initFundFromFile("D://fund code list.txt");

        Map<String, FundStockVo> result = new TreeMap<>();

        for (FundCodeInfo fundCodeInfo : fundList) {
            List<FundStockVo> list = getFundStockList(fundCodeInfo.getFundCode(), date);

            for (FundStockVo stockVo: list) {
                String stockCode = stockVo.getStockCode();
                if(result.containsKey(stockCode)) {
                    // 持仓比例累加
                    BigDecimal ratioSum = result.get(stockCode).getStockRatio().add(stockVo.getStockRatio());

                    FundStockVo vo = new FundStockVo();
                    vo.setStockCode(stockCode);
                    vo.setStockName(stockVo.getStockName());
                    vo.setStockRatio(ratioSum);
                    vo.setType(stockVo.getType());
                    result.put(stockCode, vo);
                } else {
                    result.put(stockCode, stockVo);
                }
            }
        }

        System.out.println("***************** result ********************");

        StringBuffer voStr = new StringBuffer();
        // 表头行
        voStr.append("个股名称" + "\t");
        voStr.append("个股代码" + "\t");
        voStr.append("类型：股票1/债券2" + "\t");
        voStr.append("总持仓比例(%)" + "\n");

        Iterator<Map.Entry<String, FundStockVo>> ite = result.entrySet().iterator();
        while (ite.hasNext()) {
            Map.Entry<String, FundStockVo> next = ite.next();
            FundStockVo vo = next.getValue();
            voStr.append(vo.getStockName() + "\t");
            voStr.append("\'" + vo.getStockCode() + "\t");
            voStr.append(vo.getType() + "\t");
            voStr.append(vo.getStockRatio() + "\t\n");
        }
        System.out.println(voStr);
    }

    /**
     * 获取基金实时预估涨跌幅度
     *
     * @param code
     * @param date
     * @return
     */
    public static List<FundStockVo> getFundStockList(String code, String date) {
        List<FundStockVo> fundStockVoList = new ArrayList<>();
        FundService fundService = new FundServiceImpl();
        FundStockResp fundStockInfo = fundService.getFundStockInfo(code, date);
        String stockIds = fundService.buildStocksIds(fundStockInfo);
        String bondIds = fundService.buildBondIds(fundStockInfo);

        Map<String, BigDecimal> stockRatio = fundService.getStockRatio(fundStockInfo);
        Map<String, BigDecimal> bondRatio = fundService.getBondRatio(fundStockInfo);

        StockPriceFluResp stockPriceList = fundService.getStockPriceList(stockIds);
        StockPriceFluResp bondPriceList = fundService.getStockPriceList(bondIds);

        FundStockVo fundStockVo = null;
        if(null != stockPriceList.getData()) {
            List<Diff> stockDiffList = stockPriceList.getData().getDiff();
            for (Diff diff: stockDiffList) {
                fundStockVo = new FundStockVo();
                fundStockVo.setStockCode(diff.getF12());
                fundStockVo.setStockName(diff.getF14());
                fundStockVo.setStockRatio(stockRatio.get(diff.getF12()));
                fundStockVo.setType(1);
                fundStockVoList.add(fundStockVo);
            }
        }
        if(null != bondPriceList.getData()) {
            List<Diff> bondDiffList = bondPriceList.getData().getDiff();
            for (Diff diff: bondDiffList) {
                fundStockVo = new FundStockVo();
                fundStockVo.setStockCode(diff.getF12());
                fundStockVo.setStockName(diff.getF14());
                fundStockVo.setStockRatio(bondRatio.get(diff.getF12()));
                fundStockVo.setType(2);
                fundStockVoList.add(fundStockVo);
            }
        }

        return fundStockVoList;
    }
}
