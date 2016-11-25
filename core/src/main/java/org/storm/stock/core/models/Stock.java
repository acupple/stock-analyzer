package org.storm.stock.core.models;

import java.util.Date;

/**
 * 股票common信息
 * Created by yuanwangcheng on 16/11/25.
 */
public class Stock {
    //代号
    private String id;

    //名称
    private String name;

    //市值: 亿
    private float marketValue;

    //流通市值: 亿
    private float circulatedMarketValue;

    //上市时间
    private Date begin;

    //市盈率
    private float peRatio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(float marketValue) {
        this.marketValue = marketValue;
    }

    public float getCirculatedMarketValue() {
        return circulatedMarketValue;
    }

    public void setCirculatedMarketValue(float circulatedMarketValue) {
        this.circulatedMarketValue = circulatedMarketValue;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public float getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(float peRatio) {
        this.peRatio = peRatio;
    }
}
