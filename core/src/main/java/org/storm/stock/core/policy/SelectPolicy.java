package org.storm.stock.core.policy;

import org.storm.stock.core.StockContext;

/**
 * Created by yuanwangcheng on 16/11/21.
 */
public interface SelectPolicy  {
    boolean Select(StockContext ctx);
}
