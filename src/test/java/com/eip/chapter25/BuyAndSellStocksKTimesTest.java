package com.eip.chapter25;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/16/17.
 */
public class BuyAndSellStocksKTimesTest {
    BuyAndSellStocksKTimes problem = new BuyAndSellStocksKTimes();

    @Test
    public void simpleTest(){
        int[] prices = {2,5,7,1,4,3,1,3};
        int maxProfit = problem.maxProfitLinearSpace(3,prices);

        System.out.println("Max Profit " + maxProfit);
      //  assert maxProfit ==
    }
}
