package org.storm.stock.core.policy;

import org.storm.stock.core.StockContext;
import org.storm.stock.core.models.Transaction;

/**
 * Created by yuanwangcheng on 16/11/21.
 */
public interface BuyPolicy {
    Transaction Buy(StockContext ctx);
}
