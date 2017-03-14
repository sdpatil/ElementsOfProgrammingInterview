package com.eip.chapter14;

import java.util.Arrays;

/**
 * Created by sunilpatil on 3/11/17.
 */
public class TeamPhoto {

    public boolean validPlacementExists(int[] A, int[] B ){
        Arrays.sort(A);
        Arrays.sort(B);
        boolean aSmaller = false;
        if(A[A.length-1] < B[B.length-1])
            aSmaller =true;
        for(int i = 0; i < A.length; i++){
            if(aSmaller){
                if(A[i] > B[i])
                    return false;
            }else{
                if(A[i] < B[i])
                    return false;
            }
        }
        return true;
    }
}
