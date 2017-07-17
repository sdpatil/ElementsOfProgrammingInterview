package com.eip.chapter16;

import java.util.List;

/**
 * Created by sunilpatil on 4/2/17.
 */
public class SudokuSolver {

    private static final int EMPTY_ENTRY = 0;

    public boolean solveSudoku(List<List<Integer>> partialAssignment){
        return solvePartitionSudoku(0,0,partialAssignment);
    }

    private boolean solvePartitionSudoku(int i, int j, List<List<Integer>> partialAssignment){
        if(i == partialAssignment.size()) {
            i = 0;
            if(++j == partialAssignment.get(i).size())
                return true;
        }
        if(partialAssignment.get(i).get(j) != EMPTY_ENTRY){
            solvePartitionSudoku(i+1,j, partialAssignment);
        }
        for(int val = 1; val <= partialAssignment.size() ;val++){
            if(validToAddVal(partialAssignment,i,j,val)){
                partialAssignment.get(i).set(j,val);
                if(solvePartitionSudoku(i+1,j,partialAssignment))
                    return true;
            }
        }
        partialAssignment.get(i).set(j, EMPTY_ENTRY);
        return false;
    }

    private boolean validToAddVal(List<List<Integer>> partialAssignment, int row, int column, int val){
        for(List<Integer> elements: partialAssignment){
            if(val == elements.get(column))
                return false;
        }
        for(int k = 0 ; k < partialAssignment.size(); k++){
            if(val == partialAssignment.get(row).get(k))
                return false;
        }
        int regionSize = (int)Math.sqrt(partialAssignment.size());
        int i = row/regionSize;
        int j = column/regionSize;
        for(int a = 0; a < regionSize; a++){
            for(int b = 0 ; b < regionSize; b++){
                if(val == partialAssignment.get(i*regionSize + a).get(regionSize*j +b))
                    return false;
            }
        }
        return true;
    }



}
