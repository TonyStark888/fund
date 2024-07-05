package com.hy.playhard.fund.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * ETF、指数基金估算涨幅
 *
 * @author huangying1
 */
public class FundEstimateResp implements Serializable {

    private String data;

    private int errorCode;

    private String firstError;

    private boolean success;

    private String hasWrongToken;

    private int totalCount;

    private Date expansion;

    private String jf;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setFirstError(String firstError) {
        this.firstError = firstError;
    }

    public String getFirstError() {
        return this.firstError;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setHasWrongToken(String hasWrongToken) {
        this.hasWrongToken = hasWrongToken;
    }

    public String getHasWrongToken() {
        return this.hasWrongToken;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setExpansion(Date expansion) {
        this.expansion = expansion;
    }

    public Date getExpansion() {
        return this.expansion;
    }

    public void setJf(String jf) {
        this.jf = jf;
    }

    public String getJf() {
        return this.jf;
    }

    public boolean isSuccess() {
        return success;
    }
}
