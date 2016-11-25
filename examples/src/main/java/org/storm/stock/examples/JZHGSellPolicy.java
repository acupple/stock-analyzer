package org.storm.stock.examples;

import org.storm.stock.core.policy.SellPolicy;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class JZHGSellPolicy extends SellPolicy {
    @Override
    public float Sell() {
        return 0;
    }
}
