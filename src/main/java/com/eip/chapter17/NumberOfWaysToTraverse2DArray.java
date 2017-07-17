package com.eip.chapter17;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/27/17.
 */
public class NumberOfWaysToTraverse2DArray {

    public int numberOfWaysRecursive(int n, int m) {
        if(m == 0 && n == 0)
            return 0;
        if(m ==1 || n ==1)
            return 1;

        return numberOfWaysRecursive(n-1,m) + numberOfWaysRecursive(n,m-1);
    }

    /*
    Basic idea here is number of ways to traverse 2D array is sum of top and left node. There is always one to reach
    a cell in top most row and left most column
     */
    public int numberOfWays(int n, int m) {
        int[][] dpTable = new int[n][m];
        for(int i = 1; i < n; i++)
            dpTable[i][0] =1;

        for(int j =1; j < m ; j++)
            dpTable[0][j] = 1;

        for(int i = 1; i < n ; i++){
            for(int j = 1; j < m; j++)
                dpTable[i][j] = dpTable[i-1][j] + dpTable[i][j-1];
        }

        printDPTable(dpTable);
        return dpTable[m-1][n-1];
    }

    private void printDPTable(int[][] dpTable){
        for(int[] dpRow: dpTable)
            System.out.println(Arrays.toString(dpRow));
    }
    /*
        public int numberOfWays(int n, int m){
        return computeNumberOfWaysToXY(n-1,m-1,new int[n][m]);
    }

    public int computeNumberOfWaysToXY2(int x, int y, int[][] numberOfWays){
        if(x == 0 || y == 0)
            return 1;

        if(numberOfWays[x][y] == 0){
            int wayToTop = x == 0 ? 0: computeNumberOfWaysToXY(x-1,y,numberOfWays);
            int waysToLeft = y == 0 ? 0 :computeNumberOfWaysToXY(x,y-1,numberOfWays);
            numberOfWays[x][y] = wayToTop + waysToLeft;
        }
        return numberOfWays[x][y];
    }


    public int computeNumberOfWaysToXY(int x, int y, int[][] numberOfWays) {
        if(x == 0 || y == 0)
            return 1;

        if(numberOfWays[x][y] == 0){
            int wayToTop = x==0 ? 0:computeNumberOfWaysToXY(x-1,y, numberOfWays);
            int wayToLeft = x==0 ? 0: computeNumberOfWaysToXY(x,y-1,numberOfWays);
            numberOfWays[x][y] = wayToLeft + wayToTop;
        }
        return numberOfWays[x][y];
    }*/
}
