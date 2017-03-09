package com.eip.chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class BuyAndSellStockTwice {
    public double buyAndSellStockTwice(List<Integer> prices){
        double maxTotalProfit = Double.MIN_VALUE;

        List<Double> firstBuySellProfits = new ArrayList<Double>();
        double minPriceSoFar = Double.MAX_VALUE;

        for(int i = 0; i < prices.size(); i++){
            minPriceSoFar = Math.min(minPriceSoFar,prices.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, prices.get(i)-minPriceSoFar);
            firstBuySellProfits.add(maxTotalProfit);
        }

        double maxPriceSoFar = Double.MIN_VALUE;
        for(int i  = prices.size()-1 ; i > 0 ; i-- ){
            maxPriceSoFar =Math.max(maxPriceSoFar,prices.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, maxPriceSoFar - prices.get(i) + firstBuySellProfits.get(i-1));
        }
        System.out.println("Max total profit " + maxTotalProfit);
        return  maxTotalProfit;
    }
}
