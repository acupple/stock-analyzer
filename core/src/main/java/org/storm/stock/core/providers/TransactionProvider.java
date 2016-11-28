package org.storm.stock.core.providers;

import org.storm.stock.core.models.KData;
import org.storm.stock.core.models.Stock;
import org.storm.stock.core.models.Transaction;

import java.util.Date;
import java.util.List;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class TransactionProvider {

    private Stock stock;

    public TransactionProvider(Stock stock){
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }

    /**
     * 获取5分钟K线数据的交易详情
     * @param min: yyyy-MM-dd hh:mm
     * @return
     */
    public List<Transaction> getTransactions(Date min) {
        return null;
    }

    /**
     * 获取当天9:30到现在的历史5分钟K线数据
     * @param day
     * @return
     */
    public List<KData> get5MinKDates(Date day){
        return null;
    }
}
