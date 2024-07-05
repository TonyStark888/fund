package com.hy.playhard.fund.biz;

import com.hy.playhard.fund.pojo.SimpleBaseInfo;
import com.hy.playhard.fund.service.FundHoldingService;
import com.hy.playhard.fund.service.FundService;
import com.hy.playhard.fund.service.impl.FundHoldingServiceImpl;
import com.hy.playhard.fund.service.impl.FundServiceImpl;
import com.hy.playhard.fund.vo.FundCodeInfo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 查看基金前一日的涨跌情况
 * @author huangying1
 */
public class FundDailyReport {

    public static void main(String[] args) {
        // 初始化基金信息，可以从外部文件读取，也可以直接使用对象指定
        FundHoldingService fundHoldingService = new FundHoldingServiceImpl();
        List<FundCodeInfo> fundList = fundHoldingService.initFundFromFile("D://fund code list.txt");

        Map<String, String> result = new TreeMap<>();

        FundService fundService = new FundServiceImpl();
        for (FundCodeInfo fundCodeInfo: fundList) {
            String code = fundCodeInfo.getFundCode();
            SimpleBaseInfo simpleBaseInfo = fundService.fundSimpleBaseInfo(code);
            result.put(code, simpleBaseInfo.getRZDF());
        }

        System.out.println("***************** result ********************");

        Iterator<Map.Entry<String, String>> ite = result.entrySet().iterator();
        while(ite.hasNext()) {
            Map.Entry<String, String> next = ite.next();
            System.out.println("\'" + next.getKey() + "\t" +  next.getValue());
        }
    }
}
