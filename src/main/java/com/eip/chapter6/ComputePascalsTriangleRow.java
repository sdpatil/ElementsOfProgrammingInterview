package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/6/17.
 */
public class ComputePascalsTriangleRow {
    public List<Integer> generatePascalsTriangle(int numRows) {
        List<Integer> rowList = new ArrayList<Integer>();
        Integer[][] pascalsTriangle = new Integer[numRows][numRows];
        pascalsTriangle[0][0] = 1;

        for (int i = 1; i < numRows; i++) {
            pascalsTriangle[i][0] = 1;
            pascalsTriangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                int prevColumn = pascalsTriangle[i - 1][j - 1];
                int sameColumn = pascalsTriangle[i - 1][j];

                pascalsTriangle[i][j] = prevColumn + sameColumn;
            }
            System.out.println(Arrays.toString(pascalsTriangle[i]));
        }
        return Arrays.asList(pascalsTriangle[numRows - 1]);
    }


}