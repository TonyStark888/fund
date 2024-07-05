package com.hy.playhard.fund.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class FundVo implements Serializable {

    /**
     * 基金账户
     */
    private String account;

    /**
     * 基金编码
     */
    private String fundCode;

    /**
     * 基金名称
     */
    private String fundName;

    /**
     * 基金股票持仓比例总和
     */
    private BigDecimal stockRatioTotal;

    /**
     * 基金债券持仓比例总和
     */
    private BigDecimal bondRatioTotal;

    /**
     * 已知股票、债券的总持仓比例
     */
    private BigDecimal ratioTotal;
    /**
     * 基金当时涨跌幅度
     */
    private BigDecimal fluctuation;
    /**
     * 基金当时涨跌幅度
     */
    private BigDecimal yesterdayFluctuation;

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

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public BigDecimal getStockRatioTotal() {
        return stockRatioTotal;
    }

    public void setStockRatioTotal(BigDecimal stockRatioTotal) {
        this.stockRatioTotal = stockRatioTotal;
    }

    public BigDecimal getBondRatioTotal() {
        return bondRatioTotal;
    }

    public void setBondRatioTotal(BigDecimal bondRatioTotal) {
        this.bondRatioTotal = bondRatioTotal;
    }

    public BigDecimal getRatioTotal() {
        return ratioTotal;
    }

    public void setRatioTotal(BigDecimal ratioTotal) {
        this.ratioTotal = ratioTotal;
    }

    public BigDecimal getFluctuation() {
        return fluctuation;
    }

    public void setFluctuation(BigDecimal fluctuation) {
        this.fluctuation = fluctuation;
    }

    public BigDecimal getYesterdayFluctuation() {
        return yesterdayFluctuation;
    }

    public void setYesterdayFluctuation(BigDecimal yesterdayFluctuation) {
        this.yesterdayFluctuation = yesterdayFluctuation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FundVo)) return false;
        FundVo fundVo = (FundVo) o;
        return Objects.equals(fundCode, fundVo.fundCode) && Objects.equals(fundName, fundVo.fundName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundCode, fundName);
    }

    @Override
    public String toString() {
        return "FundVo{" +
                "fundCode='" + fundCode + '\'' +
                ", fundName='" + fundName + '\'' +
                ", stockRatioTotal=" + stockRatioTotal +
                ", bondRatioTotal=" + bondRatioTotal +
                ", fluctuation=" + fluctuation +
                '}';
    }
}
