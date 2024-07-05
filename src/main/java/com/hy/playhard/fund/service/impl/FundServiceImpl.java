package com.hy.playhard.fund.service.impl;

import com.alibaba.fastjson.JSON;
import com.hy.playhard.fund.pojo.*;
import com.hy.playhard.fund.service.FundService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FundServiceImpl implements FundService {

    /**
     * 成功响应的状态码
     */
    private static final int HTTP_CODE_OK = 200;

    @Override
    public SimpleBaseInfo fundSimpleBaseInfo(String fundCode) {
        // 创建 HttpClient 实例
        HttpClient httpClient = HttpClients.createDefault();

        // 创建 POST 请求
        HttpPost httpPost = new HttpPost("https://fundcomapi.tiantianfunds.com/mm/newCore/FundCoreDiyNew");
        try {
            // 设置请求头信息
            // 只留下必需的信息
            httpPost.addHeader(new BasicHeader("validmark", "qP5reLr8juKdw5njsCtS/RmKWzo2abOY+8EcCVILvFVu2XkKE7wPZYLfsvf68AogmYyTM80E8+Y5bADKWK0KvX5xIFCi2wd8VLsiXwYYFRE="));
            httpPost.addHeader(new BasicHeader("Content-Type", "application/x-www-form-urlencoded"));

            // 设置 POST 请求的参数，使用 x-www-form-urlencoded 格式
            // 只留下必需的参数
            List<NameValuePair> formParams = new ArrayList<>();
//            formParams.add(new BasicNameValuePair("cfhFundFInfo_fields", "INVESTMENTIDEAR,INVESTMENTIDEARIMG"));
//            formParams.add(new BasicNameValuePair("fundUniqueInfo_fIELDS", "FCODE,STDDEV1,STDDEV_1NRANK,STDDEV_1NFSC,STDDEV3,STDDEV_3NRANK,STDDEV_3NFSC,STDDEV5,STDDEV_5NRANK,STDDEV_5NFSC,SHARP1,SHARP_1NRANK,SHARP_1NFSC,SHARP3,SHARP_3NRANK,SHARP_3NFSC,SHARP5,SHARP_5NRANK,SHARP_5NFSC,MAXRETRA1,MAXRETRA_1NRANK,MAXRETRA_1NFSC,MAXRETRA3,MAXRETRA_3NRANK,MAXRETRA_3NFSC,MAXRETRA5,MAXRETRA_5NRANK,MAXRETRA_5NFSC,TRKERROR1,TRKERROR_1NRANK,TRKERROR_1NFSC,TRKERROR3,TRKERROR_3NRANK,TRKERROR_3NFSC,TRKERROR5,TRKERROR_5NRANK,TRKERROR_5NFSC"));
//            formParams.add(new BasicNameValuePair("indexfields", "_id,INDEXCODE,BKID,INDEXNAME,INDEXVALUA,NEWINDEXTEXCH,PEP100"));
//            formParams.add(new BasicNameValuePair("fundUniqueInfo_fLFIELDS", "FCODE,BUSINESSTYPE,BUSINESSTEXT,BUSINESSCODE,BUSINESSSUBTYPE,MARK"));
//            formParams.add(new BasicNameValuePair("ISRG", "0"));

            formParams.add(new BasicNameValuePair("product", "EFund"));
            formParams.add(new BasicNameValuePair("FIELDS", "SHORTNAME,RZDF,DWJZ,LJJZ,SYL_1N,SYL_LN,FSRQ,ISBUY,DTZT,FTYPE,FCODE,ISSALES,ISSBDATE,ISSEDATE,TSRQ,BACKCODE,MINSG,MINSBSG,SHZT,SGZT,SOURCERATE,RATE,REALSGCODE,FEATURE,SYL,MINRG,SYL_Z,BFUNDTYPE,QDTCODE,MINDT,BAGTYPE,FUNDTYPE,BENCH,ESTABDATE,,SELLSTATE,ESTDIFF,SYSDATE,PTYPE,FUNDTYPE,ISEXCHG,ISNEW,BTYPE"));
            formParams.add(new BasicNameValuePair("FCODES", fundCode));

            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(formParams);

            // 设置请求参数实体
            httpPost.setEntity(formEntity);

            // 执行 POST 请求
            HttpResponse response = httpClient.execute(httpPost);

            // 检查响应状态
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HTTP_CODE_OK) {
                // 从响应中获取响应体数据
                HttpEntity responseEntity = response.getEntity();
                String responseBody = EntityUtils.toString(responseEntity);

                // 将JSON转换为对象
                SimpleFundInfoResp fundInfoResp = JSON.parseObject(responseBody, SimpleFundInfoResp.class);
                // 提取昨天的涨跌幅数据
                SimpleBaseInfo baseInfo = fundInfoResp.getData().get(0);
                return baseInfo;
            } else {
                System.out.println("HTTP POST 请求失败，状态码: " + statusCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            httpPost.releaseConnection();
        }

        return null;
    }

    @Override
    public BaseInfo fundBaseInfo(String fundCode) {
        // 创建 HttpClient 实例
        HttpClient httpClient = HttpClients.createDefault();

        // 创建 POST 请求
        HttpPost httpPost = new HttpPost("https://dgs.95021.com/merge/m/api/jjxqy1_2"); // 你需要替换为要请求的 URL
        try {
            // 设置请求头信息
            // 只留下必需的信息
            httpPost.addHeader(new BasicHeader("validmark", "Buk+Vx3NIl1VsKT2koONG7s6cdmoFcE33x1tq0ltY04hIi0m6sQQmE6WMBNjxUDEEHL4Q6NfFxwCAkPvIsMvA9wyYgBCs0Bahux8wFJ/4n0="));
            httpPost.addHeader(new BasicHeader("Content-Type", "application/x-www-form-urlencoded"));

            // 设置 POST 请求的参数，使用 x-www-form-urlencoded 格式
            // 只留下必需的参数
            List<NameValuePair> formParams = new ArrayList<>();
            formParams.add(new BasicNameValuePair("cfhFundFInfo_fields", "INVESTMENTIDEAR,INVESTMENTIDEARIMG"));
            formParams.add(new BasicNameValuePair("fundUniqueInfo_fIELDS", "FCODE,STDDEV1,STDDEV_1NRANK,STDDEV_1NFSC,STDDEV3,STDDEV_3NRANK,STDDEV_3NFSC,STDDEV5,STDDEV_5NRANK,STDDEV_5NFSC,SHARP1,SHARP_1NRANK,SHARP_1NFSC,SHARP3,SHARP_3NRANK,SHARP_3NFSC,SHARP5,SHARP_5NRANK,SHARP_5NFSC,MAXRETRA1,MAXRETRA_1NRANK,MAXRETRA_1NFSC,MAXRETRA3,MAXRETRA_3NRANK,MAXRETRA_3NFSC,MAXRETRA5,MAXRETRA_5NRANK,MAXRETRA_5NFSC,TRKERROR1,TRKERROR_1NRANK,TRKERROR_1NFSC,TRKERROR3,TRKERROR_3NRANK,TRKERROR_3NFSC,TRKERROR5,TRKERROR_5NRANK,TRKERROR_5NFSC"));
            formParams.add(new BasicNameValuePair("indexfields", "_id,INDEXCODE,BKID,INDEXNAME,INDEXVALUA,NEWINDEXTEXCH,PEP100"));
            formParams.add(new BasicNameValuePair("fundUniqueInfo_fLFIELDS", "FCODE,BUSINESSTYPE,BUSINESSTEXT,BUSINESSCODE,BUSINESSSUBTYPE,MARK"));
            formParams.add(new BasicNameValuePair("fields", "BENCH,ESTDIFF,INDEXNAME,LINKZSB,INDEXCODE,NEWTEXCH,FTYPE,FCODE,BAGTYPE,RISKLEVEL,TTYPENAME,PTDT_FY,PTDT_TRY,PTDT_TWY,PTDT_Y,DWDT_FY,DWDT_TRY,DWDT_TWY,DWDT_Y,MBDT_FY,MBDT_TRY,MBDT_TWY,MBDT_Y,YDDT_FY,YDDT_TRY,YDDT_TWY,YDDT_Y,BFUNDTYPE,YMATCHCODEA,RLEVEL_SZ,RLEVEL_CX,ESTABDATE,JJGS,JJGSID,ENDNAV,FEGMRQ,SHORTNAME,TTYPE,TJDIN,FUNDEXCHG,LISTTEXCHMARK,FSRQ,ISSBDATE,ISSEDATE,FEATURE,DWJZ,LJJZ,MINRG,RZDF,PERIODNAME,SYL_1N,SYL_LN,SYL_Z,SOURCERATE,RATE,TSRQ,BTYPE,BUY,BENCHCODE,BENCH_CORR,TRKERROR,BENCHRATIO,NEWINDEXTEXCH,BESTDT_STRATEGY,BESTDT_Y,BESTDT_TWY,BESTDT_TRY,BESTDT_FY"));
            formParams.add(new BasicNameValuePair("ISRG", "0"));
            formParams.add(new BasicNameValuePair("fcode", fundCode));

            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(formParams);

            // 设置请求参数实体
            httpPost.setEntity(formEntity);

            // 执行 POST 请求
            HttpResponse response = httpClient.execute(httpPost);

            // 检查响应状态
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HTTP_CODE_OK) {
                // 从响应中获取响应体数据
                HttpEntity responseEntity = response.getEntity();
                String responseBody = EntityUtils.toString(responseEntity);

                // 将JSON转换为对象
                FundInfoResp fundInfoResp = JSON.parseObject(responseBody, FundInfoResp.class);
                // 提取昨天的涨跌幅数据
                BaseInfo baseInfo = fundInfoResp.getData().getBaseInfo().get(0);
                return baseInfo;
            } else {
                System.out.println("HTTP POST 请求失败，状态码: " + statusCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            httpPost.releaseConnection();
        }

        return null;
    }

    @Override
    public FundStockResp getFundStockInfo(String fundCode, String date) {
        StringBuffer url = new StringBuffer();
        url.append("https://fundcomapi.tiantianfunds.com/mm/FundMNewApi/FundInverstPosition?");
        url.append("DATE=" + date);
        url.append("&FCODE=" + fundCode);

        // 创建 HttpClient 实例
        HttpClient httpClient = HttpClients.createDefault();

        // 创建 GET 请求
        HttpGet httpGet = new HttpGet(url.toString());

        try {
            // 执行 GET 请求
            HttpResponse response = httpClient.execute(httpGet);

            // 检查响应状态
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HTTP_CODE_OK) {
                // 从响应中获取响应体数据
                String responseBody = EntityUtils.toString(response.getEntity());

                // 将JSON转换为对象
                FundStockResp fundStockResp = JSON.parseObject(responseBody, FundStockResp.class);

                return fundStockResp;
            } else {
                System.out.println("HTTP GET 请求失败，状态码: " + statusCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            httpGet.releaseConnection();
        }
        return null;
    }

    @Override
    public FundEstimateData getFundEstimatedIncrease(String fundCode) {
        StringBuffer url = new StringBuffer();
        url.append("https://fundcomapi.tiantianfunds.com/mm/fundTrade/FundValuationDetail?");
        url.append("FCODE=" + fundCode);

        // 创建 HttpClient 实例
        HttpClient httpClient = HttpClients.createDefault();

        // 创建 GET 请求
        HttpGet httpGet = new HttpGet(url.toString());

        try {
            // 执行 GET 请求
            HttpResponse response = httpClient.execute(httpGet);

            // 检查响应状态
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HTTP_CODE_OK) {
                // 从响应中获取响应体数据
                String responseBody = EntityUtils.toString(response.getEntity());

                // 将JSON转换为对象，注意首层data对象其实是个String类型的
                FundEstimateResp fundEstimateResp = JSON.parseObject(responseBody, FundEstimateResp.class);
                FundEstimateData fundEstimateData = JSON.parseObject(fundEstimateResp.getData(), FundEstimateData.class);
                return fundEstimateData;
            } else {
                System.out.println("HTTP GET 请求失败，状态码: " + statusCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            httpGet.releaseConnection();
        }
        return null;
    }

    @Override
    public String buildStocksIds(FundStockResp fundStockResp) {
        // 根据持仓信息返回，拼接涨跌幅接口的参数
        // 示例：secids=1.600519%2C0.000858%2C0.000596%2C0.000568%2C1.600809%2C0.000333%2C1.600690%2C1.600600%2C1.600660%2C0.000860
        StringBuffer secids = new StringBuffer();
        Map<String, BigDecimal> stockMap = new HashMap<>();

        // 前十大持仓股票
        List<FundStocks> fundStocks = fundStockResp.getData().getFundStocks();
        if (null != fundStocks && fundStocks.size() > 0) {

            for (FundStocks fs : fundStocks) {
                // 拼接持仓代码列表参数
                secids.append(fs.getNEWTEXCH());
                secids.append(".");
                secids.append(fs.getGPDM());
                secids.append(",");

                // 提取持仓占比
                stockMap.put(fs.getGPDM(), fs.getJZBL());
            }
        }

        if (secids.length() > 0) {
            // 消除最后一个","符号
            secids = secids.delete(secids.length() - 1, secids.length());
        }

        return secids.toString();
    }

    @Override
    public String buildBondIds(FundStockResp fundStockResp) {
        // 债券持仓，可能会超过10个
        Map<String, BigDecimal> bondsMap = new HashMap<>();
        StringBuffer bondsIds = new StringBuffer();
        List<FundBoods> bondsList = fundStockResp.getData().getFundboods();
        if (null != bondsList && bondsList.size() > 0) {

            for (FundBoods fs : bondsList) {
                // 拼接持仓债券代码列表参数
                bondsIds.append(fs.getNEWTEXCH());
                bondsIds.append(".");
                bondsIds.append(fs.getZQDM());
                bondsIds.append(",");

                // 提取债券持仓占比
                bondsMap.put(fs.getZQDM(), fs.getZJZBL());
            }
        }

        if (bondsIds.length() > 0) {
            // 消除最后一个","符号
            bondsIds = bondsIds.delete(bondsIds.length() - 1, bondsIds.length());
        }

        return bondsIds.toString();
    }

    @Override
    public Map<String, BigDecimal> getStockRatio(FundStockResp fundStockResp) {
        Map<String, BigDecimal> stockRatioMap = new HashMap<>();

        // 前十大持仓股票
        List<FundStocks> fundStocks = fundStockResp.getData().getFundStocks();
        if (null != fundStocks && fundStocks.size() > 0) {
            for (FundStocks fs : fundStocks) {
                // 提取持仓占比
                stockRatioMap.put(fs.getGPDM(), fs.getJZBL());
            }
        }

        return stockRatioMap;
    }

    @Override
    public Map<String, BigDecimal> getBondRatio(FundStockResp fundStockResp) {
        // 债券持仓，可能会超过10个
        Map<String, BigDecimal> bondsRatioMap = new HashMap<>();
        List<FundBoods> bondsList = fundStockResp.getData().getFundboods();
        if (null != bondsList && bondsList.size() > 0) {

            for (FundBoods fs : bondsList) {
                // 提取债券持仓占比
                bondsRatioMap.put(fs.getZQDM(), fs.getZJZBL());
            }
        }

        return bondsRatioMap;
    }

    @Override
    public StockPriceFluResp getStockPriceList(String stocksIds) {
        String url = "https://push2.eastmoney.com/api/qt/ulist.np/get?appVersion=6.6.9&invt=2&product=EFund&fltt=2&plat=Android&fields=f1%2Cf2%2Cf3%2Cf4%2Cf12%2Cf13%2Cf14%2Cf292&secids=";
        try {
            url = url + URLEncoder.encode(stocksIds, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // 创建 HttpClient 实例
        HttpClient httpClient = HttpClients.createDefault();

        // 创建 GET 请求
        HttpGet httpGet = new HttpGet(url);

        try {
            // 执行 GET 请求
            HttpResponse response = httpClient.execute(httpGet);

            // 检查响应状态
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HTTP_CODE_OK) {
                // 从响应中获取响应体数据
                String responseBody = EntityUtils.toString(response.getEntity());

                // 将JSON转换为对象
                StockPriceFluResp stockPriceFluResp = JSON.parseObject(responseBody, StockPriceFluResp.class);
                return stockPriceFluResp;
            } else {
                System.out.println("HTTP GET 请求失败，状态码: " + statusCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            httpGet.releaseConnection();
        }
        return null;
    }

    @Override
    public BigDecimal calcFluctuation(StockPriceFluResp stockPriceFluResp, Map<String, BigDecimal> stockMap) {
        // 计算实时涨跌幅
        BigDecimal fundFlu = BigDecimal.ZERO;
        if(null != stockPriceFluResp && null != stockPriceFluResp.getData()) {
            List<Diff> stockPriceFlu = stockPriceFluResp.getData().getDiff();
            if (null != stockPriceFlu && stockPriceFlu.size() > 0) {
                for (Diff diff : stockPriceFlu) {
                    BigDecimal stockSlice = stockMap.get(diff.getF12());

                    BigDecimal f3 = BigDecimal.ZERO;
                    String f3Str = diff.getF3();
                    if (f3Str.matches("-?\\d+(\\.\\d+)?")) {
                        // 在这里处理成功转换的情况
                        f3 = new BigDecimal(f3Str);
                    } else {
                        System.out.println("get stock f3: " + diff.getF3());
                    }
                    BigDecimal item = stockSlice.multiply(f3).divide(new BigDecimal("100"));
                    fundFlu = fundFlu.add(item);
                }
            }
            System.out.println("当时幅度：" + fundFlu);
        }

        return fundFlu;
    }
}
