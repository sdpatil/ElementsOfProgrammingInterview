package com.eip.chapter13;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class LongestContainedRange {
    /*
    Given an integer array find out what is the longest continuos interval that has numbers
    Ex. For array {3, -2, 7, 9, 8, 1, 2,0, -1, 5, 8} longest continous interval is {-2,-1,0,1,2,3}

    Solution:- First insert all the numbers in the array in a HashSet. Then start iterating through
    the hashset, take first entry start checking hashset for all the continous entries above and below
    that entry and remove the continous entries. The result at the end is upperbound -lowerbound -1
     */
    public int longestContainedRange(List<Integer> A) {
        Set<Integer> unprocessedEntries = new HashSet<>(A);

        int result = Integer.MIN_VALUE;
        while (!unprocessedEntries.isEmpty()){
            int a = unprocessedEntries.iterator().next();
            unprocessedEntries.remove(a);
            int lowerBound = a -1;

            while (unprocessedEntries.contains(lowerBound)){
                unprocessedEntries.remove(lowerBound);
                lowerBound--;
            }

            int upperBound = a +1;
            while (unprocessedEntries.contains(upperBound)){
                unprocessedEntries.remove(upperBound);
                upperBound++;
            }

            result = Math.max(result, (upperBound-lowerBound-1));
        }
        return result;
    }
     /*   public int longestContainedRange(List<Integer> A){
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
    }*/
}
