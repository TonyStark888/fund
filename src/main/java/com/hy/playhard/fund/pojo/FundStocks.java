package com.hy.playhard.fund.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author huangying1
 */
public class FundStocks implements Serializable {
    /**
     * 股票代码
     */
    private String GPDM;

    private String GPJC;

    /**
     * 持仓比例
     */
    private BigDecimal JZBL;

    private String ISINVISBL;

    private String PCTNVCHGTYPE;

    private String PCTNVCHG;

    /**
     * 市场板块类型：1 主板
     */
    private String NEWTEXCH;

    private String INDEXCODE;

    private String INDEXNAME;

    private String HOLDCOUNT;

    public void setGPDM(String GPDM) {
        this.GPDM = GPDM;
    }

    public String getGPDM() {
        return this.GPDM;
    }

    public void setGPJC(String GPJC) {
        this.GPJC = GPJC;
    }

    public String getGPJC() {
        return this.GPJC;
    }

    public void setJZBL(BigDecimal JZBL) {
        this.JZBL = JZBL;
    }

    public BigDecimal getJZBL() {
        return this.JZBL;
    }

    public void setISINVISBL(String ISINVISBL) {
        this.ISINVISBL = ISINVISBL;
    }

    public String getISINVISBL() {
        return this.ISINVISBL;
    }

    public void setPCTNVCHGTYPE(String PCTNVCHGTYPE) {
        this.PCTNVCHGTYPE = PCTNVCHGTYPE;
    }

    public String getPCTNVCHGTYPE() {
        return this.PCTNVCHGTYPE;
    }

    public void setPCTNVCHG(String PCTNVCHG) {
        this.PCTNVCHG = PCTNVCHG;
    }

    public String getPCTNVCHG() {
        return this.PCTNVCHG;
    }

    public void setNEWTEXCH(String NEWTEXCH) {
        this.NEWTEXCH = NEWTEXCH;
    }

    public String getNEWTEXCH() {
        return this.NEWTEXCH;
    }

    public void setINDEXCODE(String INDEXCODE) {
        this.INDEXCODE = INDEXCODE;
    }

    public String getINDEXCODE() {
        return this.INDEXCODE;
    }

    public void setINDEXNAME(String INDEXNAME) {
        this.INDEXNAME = INDEXNAME;
    }

    public String getINDEXNAME() {
        return this.INDEXNAME;
    }

    public void setHOLDCOUNT(String HOLDCOUNT) {
        this.HOLDCOUNT = HOLDCOUNT;
    }

    public String getHOLDCOUNT() {
        return this.HOLDCOUNT;
    }
}
