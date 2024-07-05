package com.hy.playhard.fund.service;

import com.hy.playhard.fund.vo.FundCodeInfo;

import java.util.List;

/**
 * 初始化目标基金的信息
 */
public interface FundHoldingService {

    /**
     * 初始化基金信息，从代码中获取
     * @return
     */
    List<FundCodeInfo> initFund();

    /**
     * 初始化基金信息，从外部文件中获取
     * 文件行格式：账号-基金代码-基金类型
     * 示例：
     * 指数类型基金：支付宝-166802-3
     * @return
     */
    List<FundCodeInfo> initFundFromFile(String filePath);
}
