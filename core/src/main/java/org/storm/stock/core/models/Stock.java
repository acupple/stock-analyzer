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

    //上市时间
    private Date begin;

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

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }
}
