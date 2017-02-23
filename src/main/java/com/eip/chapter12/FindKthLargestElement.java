package com.eip.chapter12;

/**
 * Created by sunilpatil on 2/22/17.
 */
public class FindKthLargestElement {
    public int findKth(int[] A, int k){
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
}
