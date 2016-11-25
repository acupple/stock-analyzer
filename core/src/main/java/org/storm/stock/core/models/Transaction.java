package org.storm.stock.core.models;

/**
 * 交易信息
 * Created by yuanwangcheng on 16/11/25.
 */
public class Transaction {

    //交易价格
    private float price;

    //交易量
    private float volume;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
