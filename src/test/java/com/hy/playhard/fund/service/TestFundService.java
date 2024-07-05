package com.hy.playhard.fund.service;

import com.hy.playhard.fund.pojo.BaseInfo;
import com.hy.playhard.fund.pojo.SimpleBaseInfo;
import com.hy.playhard.fund.service.impl.FundServiceImpl;
import org.junit.Test;

import java.text.SimpleDateFormat;

public class TestFundService {

    FundService fundService = new FundServiceImpl();

    @Test
    public void testFundBaseInfo() {
        String code = "011103";

        SimpleBaseInfo simpleBaseInfo = fundService.fundSimpleBaseInfo(code);

        BaseInfo baseInfo = fundService.fundBaseInfo(code);

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        System.out.println(simpleBaseInfo.getSHORTNAME() + " " + simpleBaseInfo.getRZDF() + " " + sdf.format(simpleBaseInfo.getFSRQ()));
        System.out.println(baseInfo.getSHORTNAME() + " " + baseInfo.getRZDF() + " " + sdf.format(baseInfo.getFSRQ()));
    }

}
