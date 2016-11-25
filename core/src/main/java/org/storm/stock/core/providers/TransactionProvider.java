package org.storm.stock.core.providers;


import org.storm.stock.core.models.HistoryTransaction;
import org.storm.stock.core.models.Stock;

import java.util.Date;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class TransactionProvider {

    private Stock stock;

    //TODO: 加载股票数据
    public void Load() throws Exception{

    }

    public TransactionProvider(String code){
        this.stock = new Stock();
        this.stock.setId(code);
    }

    public Stock getStock() {
        return stock;
    }

    /**
     * 获取历史交易详情
     * @param time
     * @return
     */
    public HistoryTransaction getHistoryTransaction(Date time){
        return null;
    }

    /**
     * 获取当前交易详情
     * @return
     */
    public HistoryTransaction getHistoryTransaction(){
        return this.getHistoryTransaction(new Date());
    }
}
