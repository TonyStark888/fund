package com.hy.playhard.fund.pojo;


import java.io.Serializable;
import java.util.List;

public class FundStockData implements Serializable {

    private List<FundStocks> fundStocks;

    private List<FundBoods> fundboods;

    private String fundfofs;

    private String ETFCODE;

    private String ETFSHORTNAME;

    public void setFundStocks(List<FundStocks> fundStocks) {
        this.fundStocks = fundStocks;
    }

    public List<FundStocks> getFundStocks() {
        return this.fundStocks;
    }

    public void setFundboods(List<FundBoods> fundboods) {
        this.fundboods = fundboods;
    }

    public List<FundBoods> getFundboods() {
        return this.fundboods;
    }

    public void setFundfofs(String fundfofs) {
        this.fundfofs = fundfofs;
    }

    public String getFundfofs() {
        return this.fundfofs;
    }

    public void setETFCODE(String ETFCODE) {
        this.ETFCODE = ETFCODE;
    }

    public String getETFCODE() {
        return this.ETFCODE;
    }

    public void setETFSHORTNAME(String ETFSHORTNAME) {
        this.ETFSHORTNAME = ETFSHORTNAME;
    }

    public String getETFSHORTNAME() {
        return this.ETFSHORTNAME;
    }
}
