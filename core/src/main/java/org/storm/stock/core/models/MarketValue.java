package org.storm.stock.core.models;

/**
 * Created by yuanwangcheng on 16/11/28.
 */
public class MarketValue {
    //总市值
    private float all;

    //流通市值
    private float circulated;

    //市盈率
    private float peRatio;

    public float getAll() {
        return all;
    }

    public void setAll(float all) {
        this.all = all;
    }

    public float getCirculated() {
        return circulated;
    }

    public void setCirculated(float circulated) {
        this.circulated = circulated;
    }

    public float getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(float peRatio) {
        this.peRatio = peRatio;
    }
}
