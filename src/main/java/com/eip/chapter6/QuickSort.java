package com.eip.chapter6;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/5/17.
 */
public class QuickSort {

    public void sort(int[] a){
        sort(a, 0, a.length-1);
    }

    public void sort(int[] A, int low, int high){
        int pivot;
        if(high > low){
            pivot = partition(A,low,high);
            System.out.println("Pivot " + pivot + " A" + Arrays.toString(A));
            sort(A,low,pivot-1);
            sort(A,pivot+1,high);
        }
    }

    public int partition( int[] A,int low, int high){
        int left = low;
        int right = high;
        int pivot = A[low];
        while(left < right){
            while(left < high && A[left] <= pivot)
                left++;
            while (right > low && A[right] > pivot)
                right--;
            if(left < right)
                swap(A, left,right);
        }
        A[low] = A[right];
        A[right] = pivot;
        return right;
    }

    private void swap(int[]A, int first, int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }
}
