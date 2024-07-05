package com.hy.playhard.fund.pojo;


import java.io.Serializable;
import java.util.List;

public class FundEstimateData implements Serializable {

    private List<String> datas;

    private FundEstimateExpansion expansion;

    public List<String> getDatas() {
        return datas;
    }

    public void setDatas(List<String> datas) {
        this.datas = datas;
    }

    public FundEstimateExpansion getExpansion() {
        return expansion;
    }

    public void setExpansion(FundEstimateExpansion expansion) {
        this.expansion = expansion;
    }
}
