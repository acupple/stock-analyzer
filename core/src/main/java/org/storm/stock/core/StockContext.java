package org.storm.stock.core;

import org.storm.stock.account.Account;
import org.storm.stock.core.models.Stock;
import org.storm.stock.core.providers.StockProvider;
import org.storm.stock.core.providers.TransactionProvider;

/**
 * Created by yuanwangcheng on 16/11/28.
 */
public class StockContext {
    private Account account;
    private Stock stock;

    public StockProvider getStockProvider(){
        return null;
    }

    public TransactionProvider getTransactionProvider(){
        return null;
    }

    public Stock getStock() {
        return stock;
    }

    public Account getAccount() {
        return account;
    }
}
