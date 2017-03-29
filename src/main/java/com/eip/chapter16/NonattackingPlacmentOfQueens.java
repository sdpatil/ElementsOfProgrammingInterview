package com.eip.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/22/17.
 */
public class NonattackingPlacmentOfQueens {
    public List<List<Integer>> nQueens(int n){
        List<List<Integer>> result = new ArrayList();
        solveNQueens(n,0,new ArrayList<Integer>(), result);
        return result;
    }

    public void solveNQueens(int n, int row, List<Integer> colPlacments, List<List<Integer>> result){
        if(row == n)
            result.add(new ArrayList(colPlacments));
        else{
            for(int col = 0; col < n; ++col){
                colPlacments.add(col);
                if(isValid(colPlacments)){
                    solveNQueens(n,row+1,colPlacments,result);
                }
                colPlacments.remove(colPlacments.size()-1);
            }
        }
    }

    private boolean isValid(List<Integer> colPlacment){
        int rowId = colPlacment.size()-1;
        for(int i =0 ; i < rowId; i++){
            int diff = Math.abs(colPlacment.get(i) - colPlacment.get(rowId));
            if(diff ==0 || diff == rowId-i)
                return false;
        }
        return true;
    }
}
