package com.hy.playhard.fund.pojo;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author huangying1
 */
public class FundEstimateExpansion implements Serializable {

    private String FCODE;
    private String SHORTNAME;
    /**
     * 估算涨跌幅
     */
    private BigDecimal GSZZL;

    public String getFCODE() {
        return FCODE;
    }

    public void setFCODE(String FCODE) {
        this.FCODE = FCODE;
    }

    public String getSHORTNAME() {
        return SHORTNAME;
    }

    public void setSHORTNAME(String SHORTNAME) {
        this.SHORTNAME = SHORTNAME;
    }

    public BigDecimal getGSZZL() {
        return GSZZL;
    }

    public void setGSZZL(BigDecimal GSZZL) {
        this.GSZZL = GSZZL;
    }
}
