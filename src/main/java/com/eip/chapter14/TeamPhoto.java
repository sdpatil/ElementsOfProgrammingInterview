package com.eip.chapter14;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/11/17.
 */
public class TeamPhoto {

    /**
     * Team Photo
     * If you get two arrays of players heights representing 2 teams can you
     * place them one behind another for photo
     */
    public boolean validPlacementExists(int[] A, int[] B ){
        // First sort both team players by height so that tallest player of one team goes behind
        // tallest player of other team
        Arrays.sort(A);
        Arrays.sort(B);
        boolean aSmaller = false;
        //Check which team has the tallest player
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
