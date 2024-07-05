package com.hy.playhard.fund.service;

import com.hy.playhard.fund.service.impl.FundHoldingServiceImpl;
import com.hy.playhard.fund.vo.FundCodeInfo;
import org.junit.Test;

import java.util.List;

public class TestFundHoldingService {

    FundHoldingService fundHoldingService = new FundHoldingServiceImpl();

    @Test
    public void testInit() {
        // 将集合类型的数据，转换成文本型的内容
        List<FundCodeInfo> fundList = fundHoldingService.initFund();

        StringBuffer fundTxt = new StringBuffer();
        for (FundCodeInfo info: fundList) {
            fundTxt.append(info.getAccount());
            fundTxt.append("-");
            fundTxt.append(info.getFundCode());
            fundTxt.append("-");
            fundTxt.append(info.getFundType());
            fundTxt.append("\n");
        }

        System.out.println(fundTxt.toString());
    }

}
