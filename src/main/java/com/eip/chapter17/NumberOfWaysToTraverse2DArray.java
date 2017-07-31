package com.eip.chapter17;

import java.util.Arrays;

/**
 * Problem: Count the number of ways to traverse a 2D array
 */
public class NumberOfWaysToTraverse2DArray {

    public int numberOfWaysRecursive(int n, int m) {
        if (m == 0 && n == 0)
            return 0;
        if (m == 1 || n == 1)
            return 1;

        return numberOfWaysRecursive(n - 1, m) + numberOfWaysRecursive(n, m - 1);
    }

    /*
    Basic idea here is number of ways to traverse 2D array is sum of top and left node. There is always one to reach
    a cell in top most row and left most column
     */
    public int numberOfWays(int n, int m) {
        int[][] dpTable = new int[n][m];
        for (int i = 1; i < n; i++)
            dpTable[i][0] = 1;

        for (int j = 1; j < m; j++)
            dpTable[0][j] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++)
                dpTable[i][j] = dpTable[i - 1][j] + dpTable[i][j - 1];
        }
        printDPTable(dpTable);
        return dpTable[m - 1][n - 1];
    }

    private void printDPTable(int[][] dpTable) {
        for (int[] dpRow : dpTable)
            System.out.println(Arrays.toString(dpRow));
    }
}
