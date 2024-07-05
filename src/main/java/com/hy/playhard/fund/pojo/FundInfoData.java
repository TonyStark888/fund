package com.hy.playhard.fund.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author huangying1
 */
public class FundInfoData implements Serializable {
    /**
     * 暂时只取baseInfo信息使用，其他的暂时忽略
     */
    private List<BaseInfo> baseInfo;

//    private FundXTChangeInfo FundXTChangeInfo;
//
//    private String riskInfo;
//
//    private String fundBonusPoints;
//
//    private List<FundPeriodIncrease> FundPeriodIncrease;
//
//    private RateInfo rateInfo;
//
//    private String fundRelateTheme;
//
//    private List<String> cfhFInfo;
//
//    private List<IndexDetail> indexDetail;
//
//    private String FundACRateInfoV2;
//
//    private FundManagerInformation FundManagerInformation;
//
//    private List<UniqueInfo> uniqueInfo;
//
//    private String indexBenchDetail;
//
//    private FundPeriodIncreaseExpansion FundPeriodIncreaseExpansion;
//
//    private FundACRateInfoV2Expansion FundACRateInfoV2Expansion;


    public List<BaseInfo> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(List<BaseInfo> baseInfo) {
        this.baseInfo = baseInfo;
    }
}
