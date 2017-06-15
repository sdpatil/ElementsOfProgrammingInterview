package com.eip.chapter17;

/**
 * Created by sunilpatil on 2/27/17.
 */
public class NumberOfWaysToTraverse2DArray {

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
    }
}
