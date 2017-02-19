package com.eip.chapter18;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class ThreeSum {


    public boolean hasTwoSum(List<Integer> A, int t){
        int i = 0;
        int j = A.size() -1;
        while( i <= j){
            if(A.get(i) + A.get(j) == t)
                return true;
            else if(A.get(i) + A.get(j) < t){
                ++i;
            }else
                --j;
        }
        return false;
    }

    public int hasThreeSum(List<Integer> A, int t) {
        Collections.sort(A);
        int threeSumCount = 0;
        for(int i = 0; i < A.size() -1; i++){
            for(int j = i; j < A.size()-1; j++){
                int currentSum = A.get(i) + A.get(j);
                int thirdNum = t - currentSum;

                int searchIndex = binarySearch(A,j+1,A.size()-1,thirdNum);
                if(searchIndex > j) {
                    System.out.println("Search Index  " + searchIndex +" j ->" + j);
                    System.out.println(A.get(i)+" " + A.get(j)+" " + thirdNum);
                    threeSumCount++;
                }
            }
        }

        return threeSumCount;
    }

    public int binarySearch(List<Integer> A, int lo, int hi, int t) {
        if (lo > hi)
            return -1;

        int mid = lo + ((hi - lo) / 2);
        if (A.get(mid) == t)
            return mid;
        else if (A.get(mid) < t) {
            return binarySearch(A, mid + 1, hi, t);
        } else if (A.get(mid) > t) {
            return binarySearch(A, lo, mid - 1, t);
        }
        return -1;
    }
}
