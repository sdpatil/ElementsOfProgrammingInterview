package com.eip.chapter12;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class MatrixSearch {
    /*
    Problem: Search a number in 2D matrix
    Solution: - Start by comparing with last column in first row, if the value matches return it
    if not if target is smaller than current column go to next row if target is more than current
    value go one column inward
     */
    public boolean matrixSearch2(int[][] A, int k){
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

    public boolean matrixSearch(int[][] A, int k){
        int row = 0;
        int column = A[0].length-1;

        while(row < A.length && column >=0 ){
            int val = A[row][column];
            if(val == k)
                return true;
            if(val  > k){
                column = column -1;
            }else{
                row = row+1;
            }
        }
        return false;
    }
}
