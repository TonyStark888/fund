package com.hy.playhard.fund.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author huangying1
 */
public class BaseInfo implements Serializable {

    private String FTYPE;

    private String RLEVEL_CX;

    private double DWJZ;

    private double ESTDIFF;

    private Date FEGMRQ;

    private double DWDT_Y;

    private String JJGS;

    private String BENCH_CORR;

    private String PERIODNAME;

    private double BESTDT_TRY;

    private double YDDT_TWY;

    private double SYL_LN;

    private Date ISSBDATE;

    private String BENCHCODE;

    private String LISTTEXCHMARK;

    private Date ESTABDATE;

    private String NEWINDEXTEXCH;

    /**
     * 基金名称
     */
    private String SHORTNAME;

    private double MBDT_FY;

    private double BESTDT_TWY;

    private double MBDT_TRY;

    private double DWDT_FY;

    private double PTDT_Y;

    private double BESTDT_Y;

    private double PTDT_TWY;

    private String BTYPE;

    private String LINKZSB;

    private double MBDT_TWY;

    private String FEATURE;

    private int MINRG;

    private double DWDT_TWY;

    private double SYL_Z;

    private String INDEXNAME;

    private String JJGSID;

    private double ENDNAV;

    private Date ISSEDATE;

    private String SOURCERATE;

    private String RATE;

    private String YMATCHCODEA;

    private double YDDT_Y;

    private String FCODE;

    private String TTYPE;

    private double BESTDT_FY;

    private double YDDT_FY;

    private String TTYPENAME;

    private double PTDT_TRY;

    private String BESTDT_STRATEGY;

    private String BENCH;

    private String FUNDEXCHG;

    private double MBDT_Y;

    private String TSRQ;

    private double SYL_1N;

    private double DWDT_TRY;

    private String INDEXCODE;

    private String RISKLEVEL;

    private String BENCHRATIO;

    private String BUY;

    private String BFUNDTYPE;

    private String TRKERROR;

    /**
     * 昨天的涨跌幅
     */
    private BigDecimal RZDF;

    /**
     * 昨天的日期
     */
    private Date FSRQ;

    private double LJJZ;

    private double PTDT_FY;

    private double YDDT_TRY;

    private String TJDIN;

    private String NEWTEXCH;

    private String BAGTYPE;

    private String RLEVEL_SZ;

    public String getFTYPE() {
        return FTYPE;
    }

    public void setFTYPE(String FTYPE) {
        this.FTYPE = FTYPE;
    }

    public String getRLEVEL_CX() {
        return RLEVEL_CX;
    }

    public void setRLEVEL_CX(String RLEVEL_CX) {
        this.RLEVEL_CX = RLEVEL_CX;
    }

    public double getDWJZ() {
        return DWJZ;
    }

    public void setDWJZ(double DWJZ) {
        this.DWJZ = DWJZ;
    }

    public double getESTDIFF() {
        return ESTDIFF;
    }

    public void setESTDIFF(double ESTDIFF) {
        this.ESTDIFF = ESTDIFF;
    }

    public Date getFEGMRQ() {
        return FEGMRQ;
    }

    public void setFEGMRQ(Date FEGMRQ) {
        this.FEGMRQ = FEGMRQ;
    }

    public double getDWDT_Y() {
        return DWDT_Y;
    }

    public void setDWDT_Y(double DWDT_Y) {
        this.DWDT_Y = DWDT_Y;
    }

    public String getJJGS() {
        return JJGS;
    }

    public void setJJGS(String JJGS) {
        this.JJGS = JJGS;
    }

    public String getBENCH_CORR() {
        return BENCH_CORR;
    }

    public void setBENCH_CORR(String BENCH_CORR) {
        this.BENCH_CORR = BENCH_CORR;
    }

    public String getPERIODNAME() {
        return PERIODNAME;
    }

    public void setPERIODNAME(String PERIODNAME) {
        this.PERIODNAME = PERIODNAME;
    }

    public double getBESTDT_TRY() {
        return BESTDT_TRY;
    }

    public void setBESTDT_TRY(double BESTDT_TRY) {
        this.BESTDT_TRY = BESTDT_TRY;
    }

    public double getYDDT_TWY() {
        return YDDT_TWY;
    }

    public void setYDDT_TWY(double YDDT_TWY) {
        this.YDDT_TWY = YDDT_TWY;
    }

    public double getSYL_LN() {
        return SYL_LN;
    }

    public void setSYL_LN(double SYL_LN) {
        this.SYL_LN = SYL_LN;
    }

    public Date getISSBDATE() {
        return ISSBDATE;
    }

    public void setISSBDATE(Date ISSBDATE) {
        this.ISSBDATE = ISSBDATE;
    }

    public String getBENCHCODE() {
        return BENCHCODE;
    }

    public void setBENCHCODE(String BENCHCODE) {
        this.BENCHCODE = BENCHCODE;
    }

    public String getLISTTEXCHMARK() {
        return LISTTEXCHMARK;
    }

    public void setLISTTEXCHMARK(String LISTTEXCHMARK) {
        this.LISTTEXCHMARK = LISTTEXCHMARK;
    }

    public Date getESTABDATE() {
        return ESTABDATE;
    }

    public void setESTABDATE(Date ESTABDATE) {
        this.ESTABDATE = ESTABDATE;
    }

    public String getNEWINDEXTEXCH() {
        return NEWINDEXTEXCH;
    }

    public void setNEWINDEXTEXCH(String NEWINDEXTEXCH) {
        this.NEWINDEXTEXCH = NEWINDEXTEXCH;
    }

    public String getSHORTNAME() {
        return SHORTNAME;
    }

    public void setSHORTNAME(String SHORTNAME) {
        this.SHORTNAME = SHORTNAME;
    }

    public double getMBDT_FY() {
        return MBDT_FY;
    }

    public void setMBDT_FY(double MBDT_FY) {
        this.MBDT_FY = MBDT_FY;
    }

    public double getBESTDT_TWY() {
        return BESTDT_TWY;
    }

    public void setBESTDT_TWY(double BESTDT_TWY) {
        this.BESTDT_TWY = BESTDT_TWY;
    }

    public double getMBDT_TRY() {
        return MBDT_TRY;
    }

    public void setMBDT_TRY(double MBDT_TRY) {
        this.MBDT_TRY = MBDT_TRY;
    }

    public double getDWDT_FY() {
        return DWDT_FY;
    }

    public void setDWDT_FY(double DWDT_FY) {
        this.DWDT_FY = DWDT_FY;
    }

    public double getPTDT_Y() {
        return PTDT_Y;
    }

    public void setPTDT_Y(double PTDT_Y) {
        this.PTDT_Y = PTDT_Y;
    }

    public double getBESTDT_Y() {
        return BESTDT_Y;
    }

    public void setBESTDT_Y(double BESTDT_Y) {
        this.BESTDT_Y = BESTDT_Y;
    }

    public double getPTDT_TWY() {
        return PTDT_TWY;
    }

    public void setPTDT_TWY(double PTDT_TWY) {
        this.PTDT_TWY = PTDT_TWY;
    }

    public String getBTYPE() {
        return BTYPE;
    }

    public void setBTYPE(String BTYPE) {
        this.BTYPE = BTYPE;
    }

    public String getLINKZSB() {
        return LINKZSB;
    }

    public void setLINKZSB(String LINKZSB) {
        this.LINKZSB = LINKZSB;
    }

    public double getMBDT_TWY() {
        return MBDT_TWY;
    }

    public void setMBDT_TWY(double MBDT_TWY) {
        this.MBDT_TWY = MBDT_TWY;
    }

    public String getFEATURE() {
        return FEATURE;
    }

    public void setFEATURE(String FEATURE) {
        this.FEATURE = FEATURE;
    }

    public int getMINRG() {
        return MINRG;
    }

    public void setMINRG(int MINRG) {
        this.MINRG = MINRG;
    }

    public double getDWDT_TWY() {
        return DWDT_TWY;
    }

    public void setDWDT_TWY(double DWDT_TWY) {
        this.DWDT_TWY = DWDT_TWY;
    }

    public double getSYL_Z() {
        return SYL_Z;
    }

    public void setSYL_Z(double SYL_Z) {
        this.SYL_Z = SYL_Z;
    }

    public String getINDEXNAME() {
        return INDEXNAME;
    }

    public void setINDEXNAME(String INDEXNAME) {
        this.INDEXNAME = INDEXNAME;
    }

    public String getJJGSID() {
        return JJGSID;
    }

    public void setJJGSID(String JJGSID) {
        this.JJGSID = JJGSID;
    }

    public double getENDNAV() {
        return ENDNAV;
    }

    public void setENDNAV(double ENDNAV) {
        this.ENDNAV = ENDNAV;
    }

    public Date getISSEDATE() {
        return ISSEDATE;
    }

    public void setISSEDATE(Date ISSEDATE) {
        this.ISSEDATE = ISSEDATE;
    }

    public String getSOURCERATE() {
        return SOURCERATE;
    }

    public void setSOURCERATE(String SOURCERATE) {
        this.SOURCERATE = SOURCERATE;
    }

    public String getRATE() {
        return RATE;
    }

    public void setRATE(String RATE) {
        this.RATE = RATE;
    }

    public String getYMATCHCODEA() {
        return YMATCHCODEA;
    }

    public void setYMATCHCODEA(String YMATCHCODEA) {
        this.YMATCHCODEA = YMATCHCODEA;
    }

    public double getYDDT_Y() {
        return YDDT_Y;
    }

    public void setYDDT_Y(double YDDT_Y) {
        this.YDDT_Y = YDDT_Y;
    }

    public String getFCODE() {
        return FCODE;
    }

    public void setFCODE(String FCODE) {
        this.FCODE = FCODE;
    }

    public String getTTYPE() {
        return TTYPE;
    }

    public void setTTYPE(String TTYPE) {
        this.TTYPE = TTYPE;
    }

    public double getBESTDT_FY() {
        return BESTDT_FY;
    }

    public void setBESTDT_FY(double BESTDT_FY) {
        this.BESTDT_FY = BESTDT_FY;
    }

    public double getYDDT_FY() {
        return YDDT_FY;
    }

    public void setYDDT_FY(double YDDT_FY) {
        this.YDDT_FY = YDDT_FY;
    }

    public String getTTYPENAME() {
        return TTYPENAME;
    }

    public void setTTYPENAME(String TTYPENAME) {
        this.TTYPENAME = TTYPENAME;
    }

    public double getPTDT_TRY() {
        return PTDT_TRY;
    }

    public void setPTDT_TRY(double PTDT_TRY) {
        this.PTDT_TRY = PTDT_TRY;
    }

    public String getBESTDT_STRATEGY() {
        return BESTDT_STRATEGY;
    }

    public void setBESTDT_STRATEGY(String BESTDT_STRATEGY) {
        this.BESTDT_STRATEGY = BESTDT_STRATEGY;
    }

    public String getBENCH() {
        return BENCH;
    }

    public void setBENCH(String BENCH) {
        this.BENCH = BENCH;
    }

    public String getFUNDEXCHG() {
        return FUNDEXCHG;
    }

    public void setFUNDEXCHG(String FUNDEXCHG) {
        this.FUNDEXCHG = FUNDEXCHG;
    }

    public double getMBDT_Y() {
        return MBDT_Y;
    }

    public void setMBDT_Y(double MBDT_Y) {
        this.MBDT_Y = MBDT_Y;
    }

    public String getTSRQ() {
        return TSRQ;
    }

    public void setTSRQ(String TSRQ) {
        this.TSRQ = TSRQ;
    }

    public double getSYL_1N() {
        return SYL_1N;
    }

    public void setSYL_1N(double SYL_1N) {
        this.SYL_1N = SYL_1N;
    }

    public double getDWDT_TRY() {
        return DWDT_TRY;
    }

    public void setDWDT_TRY(double DWDT_TRY) {
        this.DWDT_TRY = DWDT_TRY;
    }

    public String getINDEXCODE() {
        return INDEXCODE;
    }

    public void setINDEXCODE(String INDEXCODE) {
        this.INDEXCODE = INDEXCODE;
    }

    public String getRISKLEVEL() {
        return RISKLEVEL;
    }

    public void setRISKLEVEL(String RISKLEVEL) {
        this.RISKLEVEL = RISKLEVEL;
    }

    public String getBENCHRATIO() {
        return BENCHRATIO;
    }

    public void setBENCHRATIO(String BENCHRATIO) {
        this.BENCHRATIO = BENCHRATIO;
    }

    public String getBUY() {
        return BUY;
    }

    public void setBUY(String BUY) {
        this.BUY = BUY;
    }

    public String getBFUNDTYPE() {
        return BFUNDTYPE;
    }

    public void setBFUNDTYPE(String BFUNDTYPE) {
        this.BFUNDTYPE = BFUNDTYPE;
    }

    public String getTRKERROR() {
        return TRKERROR;
    }

    public void setTRKERROR(String TRKERROR) {
        this.TRKERROR = TRKERROR;
    }

    public BigDecimal getRZDF() {
        return RZDF;
    }

    public void setRZDF(BigDecimal RZDF) {
        this.RZDF = RZDF;
    }

    public Date getFSRQ() {
        return FSRQ;
    }

    public void setFSRQ(Date FSRQ) {
        this.FSRQ = FSRQ;
    }

    public double getLJJZ() {
        return LJJZ;
    }

    public void setLJJZ(double LJJZ) {
        this.LJJZ = LJJZ;
    }

    public double getPTDT_FY() {
        return PTDT_FY;
    }

    public void setPTDT_FY(double PTDT_FY) {
        this.PTDT_FY = PTDT_FY;
    }

    public double getYDDT_TRY() {
        return YDDT_TRY;
    }

    public void setYDDT_TRY(double YDDT_TRY) {
        this.YDDT_TRY = YDDT_TRY;
    }

    public String getTJDIN() {
        return TJDIN;
    }

    public void setTJDIN(String TJDIN) {
        this.TJDIN = TJDIN;
    }

    public String getNEWTEXCH() {
        return NEWTEXCH;
    }

    public void setNEWTEXCH(String NEWTEXCH) {
        this.NEWTEXCH = NEWTEXCH;
    }

    public String getBAGTYPE() {
        return BAGTYPE;
    }

    public void setBAGTYPE(String BAGTYPE) {
        this.BAGTYPE = BAGTYPE;
    }

    public String getRLEVEL_SZ() {
        return RLEVEL_SZ;
    }

    public void setRLEVEL_SZ(String RLEVEL_SZ) {
        this.RLEVEL_SZ = RLEVEL_SZ;
    }
}
