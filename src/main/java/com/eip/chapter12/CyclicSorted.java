package com.eip.chapter12;

import java.util.List;

/**
 * Created by sunilpatil on 2/21/17.
 */
public class CyclicSorted {

    public int searchSmallest2(List<Integer> A) {
        int left = 0;
        int right = A.size() - 1;
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (A.get(mid) > A.get(right)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println("Returning value " + left);
        return left;
    }

    /**
     * Problem: Basic issue here is given rotated array how do i find smallest element in it
     * Ex. Given {368,378,478,550,631,103,203,220,234,279} how do i find 103 in it.
     * <p>
     * Solution: Basic idea is if array was correctly sorted n+1 > n, If its not then problem is
     * in the second half if it is then problem is first half
     */
    public int searchSmallest(List<Integer> A) {
        int start = 0;
        int end = A.size() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (A.get(mid) > A.get(end)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public int searchInRotatedArray(List<Integer> A, int k) {
        int length = A.size();
        int offsetIndex = searchSmallest(A);


        if(A.get(offsetIndex-1) == k)
            return offsetIndex-1;
        else if(A.get(A.size()-1) > k)
            return binarySearch(A,offsetIndex,A.size()-1,k);
        else
            return binarySearch(A,0,offsetIndex-1,k);
    }

    public int binarySearch(List<Integer> A, int start, int end, int key){

        while (start<=end){
            int mid = start + (end-start)/2;
            if(A.get(mid) > key){
                end = mid-1;
            }else if(A.get(mid) < key){
                start = mid+1;
            }else
                return mid;
        }
        return -1;

    }

}