package com.hy.playhard.fund.service;

import com.hy.playhard.fund.pojo.*;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 基金信息获取接口
 *
 * @author huangying1
 */
public interface FundService {

    /**
     * 获取基金基本信息
     * 包含基金名称、昨日的实际涨跌幅度
     * @param fundCode
     * @return
     */
    SimpleBaseInfo fundSimpleBaseInfo(String fundCode);

    /**
     * 获取基金基本信息
     * 包含基金名称、昨日的实际涨跌幅度
     * @param fundCode
     * @return
     */
    BaseInfo fundBaseInfo(String fundCode);

    /**
     * 获取基金持仓信息，包含股票和债券
     *
     * @param fundCode
     * @param date
     * @return
     */
    FundStockResp getFundStockInfo(String fundCode, String date);

    /**
     * 获取基金的估算涨幅
     * 部分ETF联接基金，指数基金提供此值
     *
     * @param fundCode
     * @return
     */
    FundEstimateData getFundEstimatedIncrease(String fundCode);

    /**
     * 构建股票持仓的查询参数
     * @param fundStockResp
     * @return
     */
    String buildStocksIds(FundStockResp fundStockResp);

    /**
     * 构建债券持仓的查询参数
     * @param fundStockResp
     * @return
     */
    String buildBondIds(FundStockResp fundStockResp);

    /**
     * 获取股票的持仓占比
     * @param fundStockResp
     * @return
     */
    Map<String, BigDecimal> getStockRatio(FundStockResp fundStockResp);

    /**
     * 获取债券的持仓占比
     * @param fundStockResp
     * @return
     */
    Map<String, BigDecimal> getBondRatio(FundStockResp fundStockResp);
    /**
     * 根据股票编码，获取当日涨跌幅度
     * 包含股票和债券
     * @param stocksIds 股票参数
     * @return
     */
    StockPriceFluResp getStockPriceList(String stocksIds);

    /**
     * 计算涨跌幅度，单位%
     */
    BigDecimal calcFluctuation(StockPriceFluResp stockPriceFluResp, Map<String, BigDecimal> stockMap);
}
