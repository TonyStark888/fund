package com.hy.playhard.fund.pojo;

import java.io.Serializable;
import java.util.List;

public class SimpleFundInfoResp implements Serializable {

    private List<SimpleBaseInfo> data;

    private int errorCode;

    private String firstError;

    private boolean success;

    private String hasWrongToken;

    private int totalCount;

    private String expansion;

    private String jf;

    public List<SimpleBaseInfo> getData() {
        return data;
    }

    public void setData(List<SimpleBaseInfo> data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getFirstError() {
        return firstError;
    }

    public void setFirstError(String firstError) {
        this.firstError = firstError;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getHasWrongToken() {
        return hasWrongToken;
    }

    public void setHasWrongToken(String hasWrongToken) {
        this.hasWrongToken = hasWrongToken;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getJf() {
        return jf;
    }

    public void setJf(String jf) {
        this.jf = jf;
    }
}
