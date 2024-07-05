package com.hy.playhard.fund.pojo;

/**
 * 股票涨跌幅
 * @author huangying1
 */
public class StockPriceFluResp {
    private int rc;

    private int rt;

    private long svr;

    private int lt;

    private int full;

    private String dlmkts;

    private StockPriceFluData data;

    public void setRc(int rc){
        this.rc = rc;
    }
    public int getRc(){
        return this.rc;
    }
    public void setRt(int rt){
        this.rt = rt;
    }
    public int getRt(){
        return this.rt;
    }
    public void setSvr(long svr){
        this.svr = svr;
    }
    public long getSvr(){
        return this.svr;
    }
    public void setLt(int lt){
        this.lt = lt;
    }
    public int getLt(){
        return this.lt;
    }
    public void setFull(int full){
        this.full = full;
    }
    public int getFull(){
        return this.full;
    }
    public void setDlmkts(String dlmkts){
        this.dlmkts = dlmkts;
    }
    public String getDlmkts(){
        return this.dlmkts;
    }
    public void setData(StockPriceFluData data){
        this.data = data;
    }
    public StockPriceFluData getData(){
        return this.data;
    }
}
