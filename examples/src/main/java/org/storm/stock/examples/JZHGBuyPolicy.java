package org.storm.stock.examples;

import org.storm.stock.core.StockContext;
import org.storm.stock.core.models.Transaction;
import org.storm.stock.core.policy.BuyPolicy;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class JZHGBuyPolicy implements BuyPolicy {
    public Transaction Buy(StockContext ctx) {
        return null;
    }
}
