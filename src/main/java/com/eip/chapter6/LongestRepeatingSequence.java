package com.eip.chapter6;

import java.util.Arrays;

/**
 * Problem 6.6 variant
 * Write a program that takes an array of integers and finds the length of a longest
 * subarray all of whose entries are equal
 * Created by sunilpatil on 2/7/17.
 */
public class LongestRepeatingSequence {

    public int longestSubarray(int[] A){
        System.out.println("Input array " + Arrays.toString(A));
        int longestCount = 0;
        int currentCount = 0;
        for(int i =1 ; i < A.length ;i++){
            if(A[i-1] == A[i])
                currentCount++;
            else{
                longestCount = Math.max(currentCount,longestCount);
                currentCount = 1;
            }
        }
        longestCount = Math.max(currentCount,longestCount);

        System.out.println("Longest count  " + longestCount);
        return longestCount;
    }
}
