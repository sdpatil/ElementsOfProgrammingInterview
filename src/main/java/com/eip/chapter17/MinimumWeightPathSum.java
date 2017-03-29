package com.eip.chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/22/17.
 */
public class MinimumWeightPathSum {
    public int minimumTotalPath(List<List<Integer>> triangle){
        if(triangle.isEmpty())
            return 0;

        List<Integer> prevRow = new ArrayList<>(triangle.get(0));
        for(int i = 1; i < triangle.size();i++){
            List<Integer> currRow = new ArrayList<>(triangle.get(i));
            currRow.set(0, currRow.get(0) + prevRow.get(0));
            for(int j = 1; j < currRow.size() -1; j++){
                int min = Math.min(prevRow.get(j), prevRow.get(j-1));
                currRow.set(j, currRow.get(j)+min);
            }
            currRow.set(currRow.size()-1, currRow.get(currRow.size()-1)+ prevRow.get(prevRow.size()-1));
            prevRow = currRow;
        }
        return Collections.min(prevRow);
    }
}
