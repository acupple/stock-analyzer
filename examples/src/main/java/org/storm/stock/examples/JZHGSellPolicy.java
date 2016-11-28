package org.storm.stock.examples;

import org.storm.stock.core.StockContext;
import org.storm.stock.core.models.Transaction;
import org.storm.stock.core.policy.SellPolicy;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class JZHGSellPolicy implements SellPolicy {
    public Transaction Sell(StockContext ctx) {
        return null;
    }
}
