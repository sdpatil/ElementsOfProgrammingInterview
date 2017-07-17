package com.eip.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/22/17.
 */
public class NonattackingPlacmentOfQueens {
    /*
    Problem: Check how many non-attacking positions can you put the queen in. You will need at least numberOfQueens rows
     */
    public List<List<Integer>> nQueens(int numberOfQueens) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(numberOfQueens,0,new ArrayList<>(),result);
        return result;
    }

    // Simple backtracking solution that tries putting queen on different columns on given row
    public void backtrack(int numberOfQueens, int row, List<Integer> tempList, List<List<Integer>> result){
        if(row == numberOfQueens){
            result.add(new ArrayList<>(tempList));
        }else{
            for (int col = 0 ; col < numberOfQueens; col++){
                tempList.add(col);
                if(isValidPlacement(tempList)){
                    backtrack(numberOfQueens,row+1, tempList,result);
                }
                tempList.remove(tempList.size()-1);
            }
        }
    }
    //  Only the last entry that is added has to be checked, for valid placement
    private boolean isValidPlacement(List<Integer> tempList){
        int rowID = tempList.size() -1;
        for(int i = 0 ; i < rowID ; i++){
            int diff = Math.abs(tempList.get(i) - tempList.get(rowID));
            //diff == 0 means two different placements are on same column, diff== rowId-d means they are in
            // same diagnoal line
            if(diff == 0|| diff == (rowID-i))
                return false;
        }
        return true;
    }
    /*    public List<List<Integer>> nQueens(int n){
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
    }*/
}
