package org.storm.stock.examples;

import org.storm.stock.core.Analyzer;

/**
 * Created by yuanwangcheng on 16/11/21.
 */
public class Application {
    public static void main(String[] args){
        Analyzer analyzer = new Analyzer();
        analyzer.setSelectPolicy(new JZHGSelectPolicy());
        analyzer.setBuyPolicy(new JZHGBuyPolicy());
        analyzer.setSellPolicy(new JZHGSellPolicy());
        analyzer.Run();
    }
}
