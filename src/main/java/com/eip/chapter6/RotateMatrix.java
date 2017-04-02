package com.eip.chapter6;

import java.util.List;

/**
 * Created by sunilpatil on 4/1/17.
 */
public class RotateMatrix {

    public void rotateMatrix(List<List<Integer>> squareMatrix){
        final int matrixSize = squareMatrix.size()-1;
        for(int i = 0; i < (squareMatrix.size()/2) ; ++i){
            for(int j = i; j < matrixSize-i ; ++j ){
                int temp1 = squareMatrix.get(matrixSize -j).get(i);
                int temp2 = squareMatrix.get(matrixSize -i).get(matrixSize-j);
                int temp3 = squareMatrix.get(j).get(matrixSize -i);
                int temp4 = squareMatrix.get(i).get(j);
                squareMatrix.get(i).set(j,temp1);
                squareMatrix.get(matrixSize -j).set(i,temp2);
                squareMatrix.get(matrixSize-i).set(matrixSize-j,temp3);
                squareMatrix.get(j).set(matrixSize-i,temp4);
            }
        }
    }
}
