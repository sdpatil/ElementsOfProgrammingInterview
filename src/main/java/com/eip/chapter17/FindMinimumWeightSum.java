package com.eip.chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/3/17.
 */
public class FindMinimumWeightSum {

    public int minimumPathTotal(List<List<Integer>> triangle){
        if(triangle.size() == 0)
            return 0;

        List<Integer> prevRow = new ArrayList<Integer>(triangle.get(0));

        for(int i = 1; i < triangle.size();i++){
            List<Integer> currentRow = new ArrayList<Integer>(triangle.get(i));
            currentRow.set(0, currentRow.get(0)+ prevRow.get(0));

            for(int j = 1;j < currentRow.size()-1;j++){
                currentRow.set(j, currentRow.get(j) + Math.min(prevRow.get(j-1),prevRow.get(j)));
            }
            currentRow.set(currentRow.size()-1, currentRow.get(currentRow.size()-1) + prevRow.get(prevRow.size()-1));

            prevRow = currentRow;
        }

        return Collections.min(prevRow);
    }
}
