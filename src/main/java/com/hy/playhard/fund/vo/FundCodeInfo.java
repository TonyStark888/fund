package com.hy.playhard.fund.vo;

import java.io.Serializable;

/**
 * 待查询的基金信息
 *
 * @author huangying1
 */
public class FundCodeInfo implements Serializable {

    /**
     * 归属账号-平台
     */
    private String account;
    /**
     * 基金代码
     */
    private String fundCode;
    /**
     * 基金类型
     * 1 普通主动管理基金
     * 2 ETF联接基金，指数基金
     */
    private Integer fundType;

    public FundCodeInfo() {
    }

    public FundCodeInfo(String account, String fundCode, Integer fundType) {
        this.account = account;
        this.fundCode = fundCode;
        this.fundType = fundType;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public Integer getFundType() {
        return fundType;
    }

    public void setFundType(Integer fundType) {
        this.fundType = fundType;
    }
}
