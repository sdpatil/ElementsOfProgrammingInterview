package com.eip.chapter6;

import java.util.Arrays;

/**
 * Implement a function which takes as input an array and a key and updates the
 * array so that all occurrences of the key have been removed and the remaining
 * elements have been shifted left to fill the emptied indices. Return the number
 * of remaining key
 */
public class RemoveKey {
    public int removeKey(int[] A, int key ){
        System.out.println("Entering RemoveKey.removeKey " + Arrays.toString(A));
        int copyCounter = 0;
        for(int i = 0; i < A.length;i++){
            if(A[i] != key)
                A[copyCounter++] = A[i];
        }
        System.out.println("Exiting RemoveKey.removeKey " + Arrays.toString(A));

        return copyCounter;
    }
}
