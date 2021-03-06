package com.eip.chapter6;

import java.util.List;


public class BuyAndSellStockOnce {
    /**
     *Calculate maximum profit by first buying and then selling stock with prices like this
     * {310,315,275,295,260,270,290,230,255,250}, its 30.00
     * You must first buy stock then only you can sell it.
     */
    public double computeMaxProfit(double[] prices) {
        double lowestPrice = prices[0];
        double maxProfit = 0.0;
        /*
        Iterate through all the stocks first calculate how much profit you can make if sell the stock at this price
        by subtracting current price - lowest price so far(Compare that profit to max profit)
        Also during this process keep checking if the current price is the lowest price
         */

        for(int i = 1 ; i < prices.length ;i++){
            double currentProfit = prices[i] - lowestPrice;
            maxProfit = Math.max(currentProfit,maxProfit);
            lowestPrice = Math.min(lowestPrice,prices[i]);
        }
        return maxProfit;
    }

}
