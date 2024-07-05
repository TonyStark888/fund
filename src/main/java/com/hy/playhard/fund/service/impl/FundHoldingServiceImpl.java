package com.hy.playhard.fund.service.impl;

import com.hy.playhard.fund.constant.FundType;
import com.hy.playhard.fund.service.FundHoldingService;
import com.hy.playhard.fund.vo.FundCodeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 初始化目标基金
 *
 * @author huangying1
 */
public class FundHoldingServiceImpl implements FundHoldingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FundHoldingServiceImpl.class);

    @Override
    public List<FundCodeInfo> initFund() {
        List<FundCodeInfo> fundList = new ArrayList<>();

        // 支付宝
        fundList.add(new FundCodeInfo("支付宝", "166802", FundType.INDEX_FUND));
        return fundList;
    }

    @Override
    public List<FundCodeInfo> initFundFromFile(String filePath) {
        List<FundCodeInfo> fundList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));

            String s = "";
            FundCodeInfo fundCodeInfo = null;
            while ((s = br.readLine()) != null) {
                String[] split = s.split("-");
                fundCodeInfo = new FundCodeInfo();
                fundCodeInfo.setAccount(split[0]);
                fundCodeInfo.setFundCode(split[1]);
                fundCodeInfo.setFundType(Integer.parseInt(split[2]));

                fundList.add(fundCodeInfo);
            }

            LOGGER.info("初始化完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fundList;
    }
}
