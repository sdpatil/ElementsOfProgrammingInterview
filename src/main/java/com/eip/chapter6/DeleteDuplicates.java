package com.eip.chapter6;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class DeleteDuplicates {

    public void deleteDuplicates(int[] A) {
        System.out.println("Entering deleteDuplicates " + Arrays.toString(A));
        int copyCount = A.length-2;
        for (int i = A.length-2; i >= 0; i--) {
            if(A[i+1] !=  A[i]){
                A[copyCount --] =A[i];
            }
        }
        System.out.println("Value of copyCount " + copyCount);
        System.out.println("Intermediate array "+ Arrays.toString(A));
        int restartCount = 0;
        for(int i = copyCount+1; i < A.length; i++){
            A[restartCount++] = A[i];
        }
        for(int i = restartCount ; i < A.length; i++)
            A[restartCount++] = 0;
        System.out.println("Exiting deleteDuplicates " + Arrays.toString(A));
    }

    public void deleteDuplicate(int[] A){
        System.out.println("Entering deleteDuplicate2 " +Arrays.toString(A));
        int copyCounter = 1;
        for(int i = 1; i < A.length;i++){
            if(A[i-1] != A[i])
                A[copyCounter++] = A[i];
        }
        for(int i = copyCounter ; i < A.length ; i++)
            A[i] =0;
        System.out.println("Exiting deleteDuplicate2 " +Arrays.toString(A));
    }

    private void swap(int[] A, int f, int s) {
        int temp = A[f];
        A[f] = A[s];
        A[s] = temp;
    }
}
