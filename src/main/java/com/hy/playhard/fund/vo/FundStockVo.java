package com.hy.playhard.fund.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author huangying1
 */
public class FundStockVo implements Serializable {

    /**
     * 持仓个股编码
     */
    private String stockCode;
    /**
     * 持仓个股名称
     */
    private String stockName;
    /**
     * 个股在某基金下的持仓比例
     */
    private BigDecimal stockRatio;

    /**
     * 1 股票，2 债券
     */
    private Integer type;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public BigDecimal getStockRatio() {
        return stockRatio;
    }

    public void setStockRatio(BigDecimal stockRatio) {
        this.stockRatio = stockRatio;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FundStockVo)) return false;
        FundStockVo stockVo = (FundStockVo) o;
        return stockCode.equals(stockVo.stockCode) && stockName.equals(stockVo.stockName) && stockRatio.equals(stockVo.stockRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockCode, stockName, stockRatio);
    }
}
