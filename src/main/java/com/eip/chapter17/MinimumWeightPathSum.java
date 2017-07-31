package com.eip.chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem: Given pascal's triangle find the minimum weight path sum
 */
public class MinimumWeightPathSum {

    /*
    Solution: Start from the top row
     */
    public int minimumTotalPath(List<List<Integer>> triangle) {
        int minimumTotalPathSum = 0;
        List<Integer> prevRow = new ArrayList<>(triangle.get(0));

        for(int i = 1 ; i < triangle.size() ;i++){
            List<Integer> currRow = new ArrayList<>(triangle.get(i));
            //Sum of the 0th column is sum of the 0th column in current row + 0th column in current row
            currRow.set(0, currRow.get(0) + prevRow.get(0));
            for(int j = 1; j < currRow.size()-1 ;j++ ){
                //Choose minimum parent from two parents
                int minParent = Math.min(prevRow.get(j-1), prevRow.get(j));
                currRow.set(j, currRow.get(j)+minParent);
            }
            //Sum of the last column is sum of the last column from previous row + last column in current row
            currRow.set(currRow.size()-1, currRow.get(currRow.size()-1) + prevRow.get(prevRow.size()-1));
            prevRow = currRow;
        }

        return Collections.min(prevRow);
    }

}
