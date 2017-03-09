package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class BuyAndSellStockTwiceTest {
    BuyAndSellStockTwice buyAndSellStockTwice;

    @Before
    public void setup(){
        buyAndSellStockTwice = new BuyAndSellStockTwice();
    }

    @Test
    public void simpleTest(){
        List<Integer> priceList = Arrays.asList(12,11,13,8,11,9,14,13,15);

        assert buyAndSellStockTwice.buyAndSellStockTwice(priceList) == 10;
    }
}
