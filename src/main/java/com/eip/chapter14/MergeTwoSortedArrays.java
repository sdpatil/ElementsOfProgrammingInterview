package com.eip.chapter14;

import java.util.List;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class MergeTwoSortedArrays {

    public void mergeTwoSortedArrays(int[] A, int m, int[] B, int n) {
        int totalLength = m + n;
        int firstIndex = m - 1;
        int secondIndex = n - 1;
        int mergedIndex = totalLength - 1;
        while (mergedIndex >= 0) {
            if(firstIndex <0){
                A[mergedIndex] = B[secondIndex];
                mergedIndex = mergedIndex - 1;
                secondIndex = secondIndex - 1;
            }else if(secondIndex <0 ){
                A[mergedIndex] = A[firstIndex];
                mergedIndex = mergedIndex - 1;
                firstIndex = firstIndex - 1;
            }else if (A[firstIndex] >= B[secondIndex]) {
                A[mergedIndex] = A[firstIndex];
                mergedIndex = mergedIndex - 1;
                firstIndex = firstIndex - 1;
            } else {
                A[mergedIndex] = B[secondIndex];
                mergedIndex = mergedIndex - 1;
                secondIndex = secondIndex - 1;
            }
        }
    }
}
