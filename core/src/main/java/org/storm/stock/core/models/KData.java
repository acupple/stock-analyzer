package org.storm.stock.core.models;

import java.util.Date;

/**
 * K线信息
 * 时间格式: 日-K(yyyy-MM-dd), 月-K(yyyy-MM), 5Min-K(yyyy-MM-dd HH:mm)
 * Created by yuanwangcheng on 16/11/25.
 */
public class KData {
    //日期+时间
    private Date date;

    //开盘价
    private float open;

    //收盘价
    private float close;

    //最高
    private float low;

    //最低
    private float high;

    //成交量
    private float volume;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
