package com.alg.misc;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class LargestSumContigousSubarray {

    public int maxSubArray(int[] a){
        int maxSubArraySum = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for(int i = 0 ; i < a.length ;i++){
            maxEndingHere = maxEndingHere + a[i];
            if(maxSubArraySum < maxEndingHere)
                maxSubArraySum = maxEndingHere;
            if(maxEndingHere <0)
                maxEndingHere = 0;
        }
        return maxSubArraySum;
    }
}
