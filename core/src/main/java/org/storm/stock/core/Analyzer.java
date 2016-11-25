package org.storm.stock.core;

import org.storm.stock.account.Account;
import org.storm.stock.core.models.Stat;
import org.storm.stock.core.policy.BuyPolicy;
import org.storm.stock.core.policy.SelectPolicy;
import org.storm.stock.core.policy.SellPolicy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class Analyzer {
    private SelectPolicy selectPolicy;
    private BuyPolicy buyPolicy;
    private SellPolicy sellPolicy;

    private Stat stat;
    private Account account;

    public void setBuyPolicy(BuyPolicy buyPolicy) {
        this.buyPolicy = buyPolicy;
    }

    public void setSelectPolicy(SelectPolicy selectPolicy) {
        this.selectPolicy = selectPolicy;
    }

    public void setSellPolicy(SellPolicy sellPolicy) {
        this.sellPolicy = sellPolicy;
    }

    public void Run() {
        //TODO: 获取所有股票代码
        Map<String, String> allStocks = new HashMap<>();
    }
}
