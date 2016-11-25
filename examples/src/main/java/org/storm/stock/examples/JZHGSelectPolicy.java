package org.storm.stock.examples;

import org.storm.stock.core.policy.SelectPolicy;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class JZHGSelectPolicy extends SelectPolicy {
    @Override
    public boolean Select() {
        return false;
    }
}
