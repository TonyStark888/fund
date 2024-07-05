package com.hy.playhard.fund.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 精简信息，只包含BaseInfo
 *
 * @author huangying1
 */
public class SimpleBaseInfo implements Serializable {

    private String FTYPE;

    private double DWJZ;

    private Date ISSEDATE;

    private String BACKCODE;

    private String SOURCERATE;

    private String ESTDIFF;

    private String PTYPE;

    private String RATE;

    private String FCODE;

    private String BENCH;

    private String QDCODE;

    private String MINSBSG;

    private double SYL_LN;

    private String ISBUY;

    private Date ISSBDATE;

    private String TSRQ;

    private String MINSG;

    private double SYL_1N;

    private String MINDT;

    private Date ESTABDATE;

    /**
     * 基金名称
     */
    private String SHORTNAME;

    private String SYL;

    private String SGZT;

    private String SHZT;

    private String BFUNDTYPE;

    private String DTZT;

    /**
     * 昨天的涨跌幅
     */
    private String RZDF;

    private double LJJZ;

    /**
     * 昨天的日期
     */
    private Date FSRQ;

    private String SYSDATE;

    private String QDTCODE;

    private String BAGTYPE;

    private String BTYPE;

    private String REALSGCODE;

    private String FEATURE;

    private String MINRG;

    private double SYL_Z;

    private String ISSALES;

    private String ISEXCHG;

    private String FUNDTYPE;

    private String SELLSTATE;

    private String ISNEW;

    public String getFTYPE() {
        return FTYPE;
    }

    public void setFTYPE(String FTYPE) {
        this.FTYPE = FTYPE;
    }

    public double getDWJZ() {
        return DWJZ;
    }

    public void setDWJZ(double DWJZ) {
        this.DWJZ = DWJZ;
    }

    public Date getISSEDATE() {
        return ISSEDATE;
    }

    public void setISSEDATE(Date ISSEDATE) {
        this.ISSEDATE = ISSEDATE;
    }

    public String getBACKCODE() {
        return BACKCODE;
    }

    public void setBACKCODE(String BACKCODE) {
        this.BACKCODE = BACKCODE;
    }

    public String getSOURCERATE() {
        return SOURCERATE;
    }

    public void setSOURCERATE(String SOURCERATE) {
        this.SOURCERATE = SOURCERATE;
    }

    public String getESTDIFF() {
        return ESTDIFF;
    }

    public void setESTDIFF(String ESTDIFF) {
        this.ESTDIFF = ESTDIFF;
    }

    public String getPTYPE() {
        return PTYPE;
    }

    public void setPTYPE(String PTYPE) {
        this.PTYPE = PTYPE;
    }

    public String getRATE() {
        return RATE;
    }

    public void setRATE(String RATE) {
        this.RATE = RATE;
    }

    public String getFCODE() {
        return FCODE;
    }

    public void setFCODE(String FCODE) {
        this.FCODE = FCODE;
    }

    public String getBENCH() {
        return BENCH;
    }

    public void setBENCH(String BENCH) {
        this.BENCH = BENCH;
    }

    public String getQDCODE() {
        return QDCODE;
    }

    public void setQDCODE(String QDCODE) {
        this.QDCODE = QDCODE;
    }

    public String getMINSBSG() {
        return MINSBSG;
    }

    public void setMINSBSG(String MINSBSG) {
        this.MINSBSG = MINSBSG;
    }

    public double getSYL_LN() {
        return SYL_LN;
    }

    public void setSYL_LN(double SYL_LN) {
        this.SYL_LN = SYL_LN;
    }

    public String getISBUY() {
        return ISBUY;
    }

    public void setISBUY(String ISBUY) {
        this.ISBUY = ISBUY;
    }

    public Date getISSBDATE() {
        return ISSBDATE;
    }

    public void setISSBDATE(Date ISSBDATE) {
        this.ISSBDATE = ISSBDATE;
    }

    public String getTSRQ() {
        return TSRQ;
    }

    public void setTSRQ(String TSRQ) {
        this.TSRQ = TSRQ;
    }

    public String getMINSG() {
        return MINSG;
    }

    public void setMINSG(String MINSG) {
        this.MINSG = MINSG;
    }

    public double getSYL_1N() {
        return SYL_1N;
    }

    public void setSYL_1N(double SYL_1N) {
        this.SYL_1N = SYL_1N;
    }

    public String getMINDT() {
        return MINDT;
    }

    public void setMINDT(String MINDT) {
        this.MINDT = MINDT;
    }

    public Date getESTABDATE() {
        return ESTABDATE;
    }

    public void setESTABDATE(Date ESTABDATE) {
        this.ESTABDATE = ESTABDATE;
    }

    public String getSHORTNAME() {
        return SHORTNAME;
    }

    public void setSHORTNAME(String SHORTNAME) {
        this.SHORTNAME = SHORTNAME;
    }

    public String getSYL() {
        return SYL;
    }

    public void setSYL(String SYL) {
        this.SYL = SYL;
    }

    public String getSGZT() {
        return SGZT;
    }

    public void setSGZT(String SGZT) {
        this.SGZT = SGZT;
    }

    public String getSHZT() {
        return SHZT;
    }

    public void setSHZT(String SHZT) {
        this.SHZT = SHZT;
    }

    public String getBFUNDTYPE() {
        return BFUNDTYPE;
    }

    public void setBFUNDTYPE(String BFUNDTYPE) {
        this.BFUNDTYPE = BFUNDTYPE;
    }

    public String getDTZT() {
        return DTZT;
    }

    public void setDTZT(String DTZT) {
        this.DTZT = DTZT;
    }

    public String getRZDF() {
        return RZDF;
    }

    public void setRZDF(String RZDF) {
        this.RZDF = RZDF;
    }

    public double getLJJZ() {
        return LJJZ;
    }

    public void setLJJZ(double LJJZ) {
        this.LJJZ = LJJZ;
    }

    public Date getFSRQ() {
        return FSRQ;
    }

    public void setFSRQ(Date FSRQ) {
        this.FSRQ = FSRQ;
    }

    public String getSYSDATE() {
        return SYSDATE;
    }

    public void setSYSDATE(String SYSDATE) {
        this.SYSDATE = SYSDATE;
    }

    public String getQDTCODE() {
        return QDTCODE;
    }

    public void setQDTCODE(String QDTCODE) {
        this.QDTCODE = QDTCODE;
    }

    public String getBAGTYPE() {
        return BAGTYPE;
    }

    public void setBAGTYPE(String BAGTYPE) {
        this.BAGTYPE = BAGTYPE;
    }

    public String getBTYPE() {
        return BTYPE;
    }

    public void setBTYPE(String BTYPE) {
        this.BTYPE = BTYPE;
    }

    public String getREALSGCODE() {
        return REALSGCODE;
    }

    public void setREALSGCODE(String REALSGCODE) {
        this.REALSGCODE = REALSGCODE;
    }

    public String getFEATURE() {
        return FEATURE;
    }

    public void setFEATURE(String FEATURE) {
        this.FEATURE = FEATURE;
    }

    public String getMINRG() {
        return MINRG;
    }

    public void setMINRG(String MINRG) {
        this.MINRG = MINRG;
    }

    public double getSYL_Z() {
        return SYL_Z;
    }

    public void setSYL_Z(double SYL_Z) {
        this.SYL_Z = SYL_Z;
    }

    public String getISSALES() {
        return ISSALES;
    }

    public void setISSALES(String ISSALES) {
        this.ISSALES = ISSALES;
    }

    public String getISEXCHG() {
        return ISEXCHG;
    }

    public void setISEXCHG(String ISEXCHG) {
        this.ISEXCHG = ISEXCHG;
    }

    public String getFUNDTYPE() {
        return FUNDTYPE;
    }

    public void setFUNDTYPE(String FUNDTYPE) {
        this.FUNDTYPE = FUNDTYPE;
    }

    public String getSELLSTATE() {
        return SELLSTATE;
    }

    public void setSELLSTATE(String SELLSTATE) {
        this.SELLSTATE = SELLSTATE;
    }

    public String getISNEW() {
        return ISNEW;
    }

    public void setISNEW(String ISNEW) {
        this.ISNEW = ISNEW;
    }
}
