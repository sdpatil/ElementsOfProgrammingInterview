package com.eip.chapter17;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/27/17.
 */
public class FindLongestNonDecreasingSubsequence {
    public int longestNonDecreasingSubsequenceLength(List<Integer> A){
        Integer[] longestSubsequenceArray = new Integer[A.size()];
        Arrays.fill(longestSubsequenceArray,1);
        for(int i = 1; i < A.size() ;i++ ){
            for(int j = 0; j < i; j++){
                if(A.get(i) > A.get(j)){
                    longestSubsequenceArray[i] = Math.max(longestSubsequenceArray[i], longestSubsequenceArray[j]+1);
                }
            }
        }
        return Collections.max(Arrays.asList(longestSubsequenceArray));
    }

}
