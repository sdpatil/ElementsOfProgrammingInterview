package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class BuyAndSellStockOnceTest {
    BuyAndSellStockOnce buyAndSellStockOnce;

    @Before
    public void setup(){
        buyAndSellStockOnce = new BuyAndSellStockOnce();
    }

    @Test
    public void simpleTest(){
        double[] prices = new double[]{310,310,275,275,260,260,260,230,230,230};
        double maxProfit = buyAndSellStockOnce.computeMaxProfit(prices);
        System.out.println("Maximum profit " + maxProfit);
        assert maxProfit == 0.0;
    }

    @Test
    public void simpleTest2(){
        double[] prices = new double[]{310,315,275,295,260,270,290,230,255,250};
        double maxProfit = buyAndSellStockOnce.computeMaxProfit(prices);
        assert maxProfit == 30;
    }
}
