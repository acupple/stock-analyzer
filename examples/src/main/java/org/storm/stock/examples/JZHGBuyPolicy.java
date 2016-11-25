package org.storm.stock.examples;

import org.storm.stock.core.policy.BuyPolicy;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class JZHGBuyPolicy extends BuyPolicy {
    @Override
    public float Buy() {
        return 0;
    }
}
