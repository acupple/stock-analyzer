package org.storm.stock.core.models;

import java.util.Date;

/**
 * 历史交易信息
 * Created by yuanwangcheng on 16/11/25.
 */
public class HistoryTransaction {
    //股票名称
    private String name;

    //交易时间(yyyy-MM-dd HH:mm:ss)
    private Date dateTime;

    //交易价格
    private float curPrice;

    //交易量
    private float volume;

    //总市值
    private float allMarketValue;

    //流通市值
    private float circulatedMarketValue;

    //市盈率
    private float peRatio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public float getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(float curPrice) {
        this.curPrice = curPrice;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getAllMarketValue() {
        return allMarketValue;
    }

    public void setAllMarketValue(float allMarketValue) {
        this.allMarketValue = allMarketValue;
    }

    public float getCirculatedMarketValue() {
        return circulatedMarketValue;
    }

    public void setCirculatedMarketValue(float circulatedMarketValue) {
        this.circulatedMarketValue = circulatedMarketValue;
    }

    public float getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(float peRatio) {
        this.peRatio = peRatio;
    }
}
