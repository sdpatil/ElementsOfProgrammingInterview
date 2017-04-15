package com.eip.chapter13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class LongestSubarrayWithDistinctEntries {

    public int longestSubarrayWithDistinctEntries(List<Character> A){

        Map<Character, Integer> mostRecentOccurance = new HashMap<>();
        int longestSubArrayWithDistinctEntriesStartIndex = 0;
        int result = 0;
        for(int i = 0 ; i < A.size() ;i++){
            Integer duplicateIdx = mostRecentOccurance.put(A.get(i),i);
            if(duplicateIdx != null){
                if(duplicateIdx >= longestSubArrayWithDistinctEntriesStartIndex) {
                    result = Math.max(result, i - longestSubArrayWithDistinctEntriesStartIndex);
                    longestSubArrayWithDistinctEntriesStartIndex = duplicateIdx + 1;
                }

            }
        }
        result = Math.max(result, A.size()-longestSubArrayWithDistinctEntriesStartIndex);
        return result;
    }
}
