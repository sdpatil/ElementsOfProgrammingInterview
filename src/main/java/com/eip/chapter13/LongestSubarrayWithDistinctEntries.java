package com.eip.chapter13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubarrayWithDistinctEntries {

    /*
    Problem: Write a program that takes an array and returns the length of the longest
    subarray with the
    property that that all its elements are distinct
    Ex. {f,s,f,e,t,w,e,n,w,e} then longest subarray without duplicate is {s,f,e,t,w}
    Solution:- Maintain a map of character to when that character was last appeared
    Every time you add a new entry check if that entry has appeared before if yes
    get its index, check if that index is greater than longestDuplicateFreeSubarrayStartIndex
    if yes calculate distance between i - longestDuplicateFreeSubarrayStartIndex, check if thats max

     */
    public int longestSubarrayWithDistinctEntries(List<Character> A) {
        Map<Character,Integer> mostRecentOccurance = new HashMap<>();
        int longestDuplicateFreeSubarrayStartIndex = 0;
        int result = 0;
        for(int i = 0 ; i <  A.size() ;i ++){
            Integer dupIdIdx = mostRecentOccurance.put(A.get(i),i);
            if(dupIdIdx != null ){
                if(dupIdIdx > longestDuplicateFreeSubarrayStartIndex){
                    result = Math.max(result, i - longestDuplicateFreeSubarrayStartIndex);
                    longestDuplicateFreeSubarrayStartIndex = dupIdIdx+1;
                }
            }
        }
        result = Math.max(result, A.size() - longestDuplicateFreeSubarrayStartIndex);

        return result;
    }

}
