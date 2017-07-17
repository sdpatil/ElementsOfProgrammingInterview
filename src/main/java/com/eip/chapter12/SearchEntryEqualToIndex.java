package com.eip.chapter12;

import java.util.List;

/**
 * Created by sunilpatil on 2/20/17.
 */
public class SearchEntryEqualToIndex {

    public int searchEntryEqualToItsIndex2(List<Integer> A){
        int left = 0;
        int right = A.size()-1;
        while(left < right){
            int mid = left + ( (right -left)/2);
            int difference = A.get(mid) - mid;
            if(difference == 0){
                return mid;
            }else if (A.get(mid) < mid){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }

    /*
    Problem: THe problem is given a sorted array find an entry whose index is equal to its value.
    Ex. For array {-2,0,2,3,6,7,9} both 2 and 3 are equal to its index

    Solution: Since this is sorted array a[j] > j is not possible same as a[j] < j is not possible
    so this is essentially a binary search in which we go either right or left depending on difference
    in index and value of an entry
     */
    public int searchEntryEqualToItsIndex(List<Integer> numList){
        int start = 0;
        int end = numList.size()-1;
        while (start<end){
            int mid = start + ( end - start)/2;
            //Calculate difference between Array entry and arrays index, use it to decide direction
            int difference = numList.get(mid) - mid;
            if(difference > 0){
                end = mid-1;
            }else if (difference == 0) {
                return mid;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
