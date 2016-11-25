package org.storm.stock.core.providers;

import org.storm.stock.core.models.KData;
import org.storm.stock.core.models.Stock;
import org.storm.stock.core.models.enums.Average;
import org.storm.stock.core.models.enums.Peak;
import org.storm.stock.core.models.enums.Valley;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by yuanwangcheng on 16/11/25.
 */
public class StockProvider {

    private Stock stock;

    public StockProvider(String code){
        this.stock = new Stock();
        this.stock.setId(code);
    }

    //TODO: 加载股票数据
    public void Load() throws Exception{

    }

    public Stock getStock() {
        return stock;
    }

    /**
     * 获取历史峰值
     * @param start
     * @return
     */
    public Map<Peak, KData> GetPeakValue(Date start){
        return null;
    }

    /**
     * 获取历史谷底
     * @param start
     * @return
     */
    public Map<Valley, KData> GetValleyValue(Date start){
        return null;
    }

    /**
     * 获取历史均值
     * @param start
     * @return
     */
    public KData GetAverageValue(Date start){
        return null;
    }

    /**
     * 获取5, 10, 20, 60日均值
     * @return
     */
    public Map<Average, KData> GetAverageValue(){
        return null;
    }

    public List<KData> getDayKData(Date start, Date end){
        return null;
    }
}
