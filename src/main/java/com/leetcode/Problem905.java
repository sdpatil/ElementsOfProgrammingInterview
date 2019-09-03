package com.leetcode;

public class Problem905 {

    public int[] sortArrayByParity(int[] A) {
        int startIndex = 0;
        int endIndex = A.length - 1;
        while (startIndex < endIndex){
            while(A[startIndex] % 2 == 0 && startIndex < endIndex)
                startIndex ++;
            while (A[endIndex] % 2 != 0 && startIndex < endIndex )
                endIndex --;
            swap(A,startIndex, endIndex);
        }
        return A;
    }

    private void swap(int[] a, int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
