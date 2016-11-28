package org.storm.stock.examples;

import org.storm.stock.core.StockContext;
import org.storm.stock.core.policy.SelectPolicy;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class JZHGSelectPolicy implements SelectPolicy {
    public boolean Select(StockContext ctx) {
        return false;
    }
}
