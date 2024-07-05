package com.hy.playhard.fund.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class FundBoods implements Serializable {

    /**
     * 债券代码
     */
    private String ZQDM;

    private String ZQMC;

    /**
     * 债券持仓占比
     */
    private BigDecimal ZJZBL;

    private String ISBROKEN;

    /**
     * 债券市场板块：0 深交所， 1 上交所
     */
    private String NEWTEXCH;

    private String PCTNVCHG;

    private String PCTNVCHGTYPE;

    private String INDEXNAME;

    public void setZQDM(String ZQDM) {
        this.ZQDM = ZQDM;
    }

    public String getZQDM() {
        return this.ZQDM;
    }

    public void setZQMC(String ZQMC) {
        this.ZQMC = ZQMC;
    }

    public String getZQMC() {
        return this.ZQMC;
    }

    public void setZJZBL(BigDecimal ZJZBL) {
        this.ZJZBL = ZJZBL;
    }

    public BigDecimal getZJZBL() {
        return this.ZJZBL;
    }

    public void setISBROKEN(String ISBROKEN) {
        this.ISBROKEN = ISBROKEN;
    }

    public String getISBROKEN() {
        return this.ISBROKEN;
    }

    public void setNEWTEXCH(String NEWTEXCH) {
        this.NEWTEXCH = NEWTEXCH;
    }

    public String getNEWTEXCH() {
        return this.NEWTEXCH;
    }

    public void setPCTNVCHG(String PCTNVCHG) {
        this.PCTNVCHG = PCTNVCHG;
    }

    public String getPCTNVCHG() {
        return this.PCTNVCHG;
    }

    public void setPCTNVCHGTYPE(String PCTNVCHGTYPE) {
        this.PCTNVCHGTYPE = PCTNVCHGTYPE;
    }

    public String getPCTNVCHGTYPE() {
        return this.PCTNVCHGTYPE;
    }

    public void setINDEXNAME(String INDEXNAME) {
        this.INDEXNAME = INDEXNAME;
    }

    public String getINDEXNAME() {
        return this.INDEXNAME;
    }
}
