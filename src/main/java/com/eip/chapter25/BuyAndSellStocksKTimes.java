package com.eip.chapter25;

import java.util.Arrays;

/**
 * Created by sunilpatil on 6/16/17.
 */
public class BuyAndSellStocksKTimes {
    public int maxProfitLinearSpace(int k, int[] prices) {
        int[][] dpTable = new int[k+1][prices.length];

        for(int row = 1 ; row < dpTable.length ; row++ ){
            for(int column = 1 ; column < dpTable[0].length ; column++){
                int maxVal = 0;
                for(int m = 0 ; m < column; m++){
                    maxVal = Math.max(maxVal,prices[column] - prices[m]+ dpTable[row-1][m]);
                }
                dpTable[row][column] = Math.max(dpTable[row][column-1],maxVal);
            }
        }
        for(int[] dpRow: dpTable)
            System.out.println(Arrays.toString(dpRow));
        return dpTable[k][prices.length-1];
    }
}