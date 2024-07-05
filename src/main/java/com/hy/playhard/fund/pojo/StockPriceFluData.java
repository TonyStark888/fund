package com.hy.playhard.fund.pojo;

import java.util.List;

/**
 * @author huangying1
 */
public class StockPriceFluData {
    private int total;

    private List<Diff> diff;

    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }
    public void setDiff(List<Diff> diff){
        this.diff = diff;
    }
    public List<Diff> getDiff(){
        return this.diff;
    }
}
