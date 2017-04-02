package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 4/1/17.
 */
public class IsValidSudoku {
    public boolean isValidSudoku(List<List<Integer>> partialAssignment){
        for(int i = 0; i < partialAssignment.size(); i++){
            if(hasDuplicate(partialAssignment,i,i+1,0,partialAssignment.size()))
                return false;
        }
        for(int i = 0; i < partialAssignment.size();i++){
            if(hasDuplicate(partialAssignment,0, partialAssignment.size(),i,i+1))
                return false;
        }

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
