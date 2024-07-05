package com.hy.playhard.fund.pojo;

/**
 * @author huangying1
 */
public class Diff {
    private int f1;

    private String f2;

    /**
     * 股票实时涨跌幅度，单位百分比制：%
     * 有债券的值为"-"，要先用String转换
     */
    private String f3;
    /**
     * 股票实时涨跌幅度，单位人民币：元
     */
    private String f4;

    /**
     * 股票代码
     */
    private String f12;

    private int f13;

    /**
     * 股票名称
     */
    private String f14;

    private int f292;

    public void setF1(int f1) {
        this.f1 = f1;
    }

    public int getF1() {
        return this.f1;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    public String getF2() {
        return this.f2;
    }

    public void setF3(String f3) {
        this.f3 = f3;
    }

    public String getF3() {
        return this.f3;
    }

    public void setF4(String f4) {
        this.f4 = f4;
    }

    public String getF4() {
        return this.f4;
    }

    public void setF12(String f12) {
        this.f12 = f12;
    }

    public String getF12() {
        return this.f12;
    }

    public void setF13(int f13) {
        this.f13 = f13;
    }

    public int getF13() {
        return this.f13;
    }

    public void setF14(String f14) {
        this.f14 = f14;
    }

    public String getF14() {
        return this.f14;
    }

    public void setF292(int f292) {
        this.f292 = f292;
    }

    public int getF292() {
        return this.f292;
    }
}
