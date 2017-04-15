package com.eip.chapter13;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class LongestContainedRange {
    public int longestContainedRange(List<Integer> A){
        Set<Integer> unprocessedEntries = new HashSet(A);
        int result = 0;
        while(!unprocessedEntries.isEmpty()){
            int currentNumber = unprocessedEntries.iterator().next();
            unprocessedEntries.remove(currentNumber);

            int lowerBound= currentNumber-1;
            while(unprocessedEntries.contains(lowerBound)){
                unprocessedEntries.remove(lowerBound);
                lowerBound--;
            }

            int upperBound= currentNumber+1;
            while (unprocessedEntries.contains(upperBound)){
                unprocessedEntries.remove(upperBound);
                upperBound++;
            }
            result = Math.max(upperBound-lowerBound-1, result);
        }
        return result;
    }
}
