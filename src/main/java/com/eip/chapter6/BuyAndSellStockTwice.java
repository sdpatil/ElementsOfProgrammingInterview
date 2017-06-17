package com.eip.chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class BuyAndSellStockTwice {

    public double buyAndSellStockTwice(List<Integer> prices) {
        List<Double> firstPhaseProfit = new ArrayList<>();
        double minPriceSoFar = Double.MIN_VALUE;
        double maxProfit = 0.0;
        //Figure out what would be the max profit for first sell
        for (int i = 0; i < prices.size(); i++) {
            maxProfit = Math.max(maxProfit, prices.get(i) - minPriceSoFar);
            minPriceSoFar = Math.min(minPriceSoFar, prices.get(i));
            firstPhaseProfit.add(maxProfit);
        }

        //Now go through the prices in reverse order, in this the current price becomes buy price and maxPrice
        //becomes sell price, so track whats the max sell price we have seen so far and subtract current price
        // from it.
        double maxPrice = Double.MIN_VALUE;
        for (int i = prices.size() - 1; i > 0; i--) {
            maxPrice = Math.max(prices.get(i), maxPrice);
            //Max profit would be some of the this phase plus profit from last phase
            double currentProfit = maxPrice - prices.get(i);
            currentProfit = currentProfit + firstPhaseProfit.get(i-1);
            maxProfit = Math.max(currentProfit, maxProfit );
        }
        return maxProfit;
    }

    public double buyAndSellStockTwice2(List<Integer> prices) {
        double maxTotalProfit = Double.MIN_VALUE;

        List<Double> firstBuySellProfits = new ArrayList<Double>();
        double minPriceSoFar = Double.MAX_VALUE;

        for (int i = 0; i < prices.size(); i++) {
            minPriceSoFar = Math.min(minPriceSoFar, prices.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, prices.get(i) - minPriceSoFar);
            firstBuySellProfits.add(maxTotalProfit);
        }

        double maxPriceSoFar = Double.MIN_VALUE;
        for (int i = prices.size() - 1; i > 0; i--) {
            maxPriceSoFar = Math.max(maxPriceSoFar, prices.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, maxPriceSoFar - prices.get(i) + firstBuySellProfits.get(i - 1));
        }
        System.out.println("Max total profit " + maxTotalProfit);
        return maxTotalProfit;
    }
}
