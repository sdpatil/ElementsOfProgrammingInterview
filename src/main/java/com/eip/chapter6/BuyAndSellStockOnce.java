package com.eip.chapter6;

import java.util.List;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class BuyAndSellStockOnce {
    public double computeMaxProfit(double[] prices) {
        double lowestPrice = Double.MAX_VALUE;
        double maximumProfit = 0.0;
        for(int i = 0; i < prices.length ; i++){
            double currentProfit = prices[i] - lowestPrice;
            maximumProfit = Math.max(maximumProfit,currentProfit);
            lowestPrice = Math.min(lowestPrice,prices[i]);
        }
        return maximumProfit;
    }
}
