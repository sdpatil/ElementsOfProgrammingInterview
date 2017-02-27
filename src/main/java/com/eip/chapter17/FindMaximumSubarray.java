package com.eip.chapter17;

import java.util.List;

/**
 * Created by sunilpatil on 2/24/17.
 */
public class FindMaximumSubarray {

    public int findMaximumSubarrayDP(List<Integer> a){
        int minsum =0;
        int sum =0;
        int maxSum = 0;
        for(int i =0;i < a.size();i++){
            sum = sum + a.get(i);
            if(sum < minsum){
                minsum = sum;
            }
            if(sum - minsum > maxSum){
                maxSum = sum - minsum;
            }
        }
        return maxSum;
    }

    public int findMaximumSubarray(List<Integer> a){
        int maxSum = 0;
        for(int i = 0 ; i < a.size();i++ ){
            int sum = 0;
            for(int j = i; j < a.size(); j++){
                sum = sum + a.get(j);
                maxSum = Math.max(sum,maxSum);
            }
        }
        System.out.println("Returning Maximum sum " + maxSum);
        return maxSum;
    }
}
