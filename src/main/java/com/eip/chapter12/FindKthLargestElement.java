package com.eip.chapter12;

import java.util.Random;

/**
 * Created by sunilpatil on 2/22/17.
 */
public class FindKthLargestElement {
    public int findKth2(int[] A, int k){
        int left = 0;
        int right = A.length-1;
        k = k -1;
        while(left< right){
            int partition = partition(A,left,right);
            if(partition == k) {
                System.out.println("Returning value " + A[partition]);
                return A[partition];
            }else if(partition > k){
                right = partition-1;
            }else{
                left = partition+1;
            }
        }

        return -1;
    }

    public int partition2(int[] A, int left, int right){
        int partitionElem = A[left];
        int i = left+1;
        int j = right;
        int k = left;
        while(i < j){
            while(i < j && A[i] < partitionElem){
                i++;
            }
            while(i < j && A[j] > partitionElem)
                j--;
            swap(A,i,j);
        }
        swap(A,i-1,left);
        return i-1;
    }

    public int partition(int[] a, int l, int r) {
        int p = a[l];
        int i = l + 1;
        for (int j = l + 1; j <= r; j++) {
            if (a[j]< p) {
                //i++;
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i - 1, l);
        return i - 1;
    }

    public void swap(int[] A, int first, int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    /**
     * Problem: Find kth largest element
     * Solution:- Basic idea is to perform quicksort type of routine if we find that the pivot of search is equal
     * to k return it, if not find if the pivot is on the right or left of current pivot and quicksort those
     * elements
     */
    public int findKth(int[] A, int k){
        int left = 0 ;
        int right =  A.length-1;
        k = k -1;
        while (left<= right){
            int pivotIndex = partitionAroundPivot(A, left,right);
            if(pivotIndex == k)
                return A[pivotIndex];
            else if(pivotIndex< k)
                left = pivotIndex+1;
            else
                right = pivotIndex-1;
        }
        return -1;
    }

    /*
    This method is use for rearranging the array so that all the elements less than randomly chosen pivot are
     */
    public int partitionAroundPivot(int[] A, int left, int right){
        Random random = new Random();
        int pivotIndex = random.nextInt(right - left+1)+ left;
        int pivotValue = A[pivotIndex];
        int newPivotIndex = left;

        for(int i = left ; i  < right ; i++){
            if(A[i]<  pivotValue)
                swap(A, i, newPivotIndex++);
        }
        swap(A, right,newPivotIndex);
        return newPivotIndex;
    }
}
