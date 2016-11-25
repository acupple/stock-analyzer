package org.storm.stock.core.policy;

import org.storm.stock.core.providers.StockProvider;
import org.storm.stock.core.providers.TransactionProvider;

/**
 * Created by yuanwangcheng on 16/11/21.
 */
public class Policy {
    private String stockId;
    private String name;

    protected StockProvider stockProvider;
    protected TransactionProvider transactionProvider;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStockProvider(StockProvider stockProvider) {
        this.stockProvider = stockProvider;
    }

    public void setTransactionProvider(TransactionProvider transactionProvider) {
        this.transactionProvider = transactionProvider;
    }
}
