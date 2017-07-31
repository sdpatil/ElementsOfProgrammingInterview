package com.eip.chapter14;

import java.util.List;

/**
 * Problem: Write a program that takes as input two sorted arrays of integers and updates the first to the combined
 * entities of the two arrays in sorted order. Assume the first array has enough empty entries to hold the result
 */
public class MergeTwoSortedArrays {

    /*
    Solution: - Start from the end of both arrays. Calculate total length of merged arrays as sum of length of
    first and second. check if Array entry A is greater than B if yes copy it at merged index and move inwards
     */
    public void mergeTwoSortedArrays(int[] A, int m, int[] B, int n) {
        int totalLength = m + n;
        int firstIndex = m - 1;
        int secondIndex = n - 1;
        int mergedIndex = totalLength - 1;
        while (mergedIndex >= 0) {
            if (firstIndex < 0) {
                //This means already consumed all elements in A
                A[mergedIndex] = B[secondIndex];
                mergedIndex = mergedIndex - 1;
                secondIndex = secondIndex - 1;
            } else if (secondIndex < 0) {
                //Consumed all elements in B
                A[mergedIndex] = A[firstIndex];
                mergedIndex = mergedIndex - 1;
                firstIndex = firstIndex - 1;
            } else if (A[firstIndex] >= B[secondIndex]) {
                //If A element is bigger than B element copy it in merged array
                A[mergedIndex] = A[firstIndex];
                mergedIndex = mergedIndex - 1;
                firstIndex = firstIndex - 1;
            } else {
                //If B element is bigger than A element copy it in merged array
                A[mergedIndex] = B[secondIndex];
                mergedIndex = mergedIndex - 1;
                secondIndex = secondIndex - 1;
            }
        }
    }
}
