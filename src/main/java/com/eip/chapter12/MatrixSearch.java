package com.eip.chapter12;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class MatrixSearch {
    public boolean matrixSearch(int[][] A, int k){
        int row =  0;
        int col = A[0].length -1;
        while(row < A.length && col >=0){
            if(A[row][col] == k) {
                return true;
            }else if(A[row][col] < k){
                row = row+1;
            }else{
                col = col-1;
            }
        }
        return false;
    }
}
