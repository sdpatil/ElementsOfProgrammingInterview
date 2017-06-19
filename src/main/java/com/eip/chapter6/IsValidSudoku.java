package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Check if supplied Sudoku puzzle is valid
 */
public class IsValidSudoku {
    public boolean isValidSudoku(List<List<Integer>> partialAssignment){
        //Check if there are any duplicates in given row
        for(int i = 0; i < partialAssignment.size(); i++){
            if(hasDuplicate(partialAssignment,i,i+1,0,partialAssignment.size()))
                return false;
        }
        //Check if there are any duplicates in the give column
        for(int i = 0; i < partialAssignment.size();i++){
            if(hasDuplicate(partialAssignment,0, partialAssignment.size(),i,i+1))
                return false;
        }
        //Check if there are any duplicates in the 3*3 matrix
        int regionSize =(int) Math.sqrt(partialAssignment.size());
        for(int i = 0; i < regionSize; i++){
            for(int j = 0; j < regionSize; j++){
                if(hasDuplicate(partialAssignment,regionSize*i,
                        regionSize *(i+1), regionSize*j, regionSize*(j+1)))
                    return false;
            }
        }

        return true;
    }
    /**
     *
     * This function takes one set at a time and checks if there is a duplicate in it.
     * First it creates a boolean array of size 9 and then starts iterating through all the records
     * for every digit it checks if that digit is already set to true in the array if yes then that
     * means there is a duplicate if not, it sets that digit to true
     */
    private boolean hasDuplicate(List<List<Integer>> partialAssignment,
                                 int startRow, int endRow,
                                 int startCol, int endCol){
        List<Boolean> isPresent = new ArrayList<>(Collections.nCopies(partialAssignment.size()+1,false));
        for(int i = startRow; i < endRow ; i++){
            for(int j = startCol; j < endCol; j++){
                int value = partialAssignment.get(i).get(j);
                if(value != 0){
                    if(isPresent.get(value))
                        return true;
                    else
                        isPresent.set(value,true);
                }
            }
        }
        return false;
    }
}
