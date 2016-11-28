package org.storm.stock.core.models;

import java.util.Date;

/**
 * 交易信息
 * Created by yuanwangcheng on 16/11/25.
 */
public class Transaction {
    //交易时间
    private Date time;

    //交易价格
    private float price;

    //交易量
    private float volume;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
