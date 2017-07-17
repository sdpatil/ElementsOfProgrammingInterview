package com.eip.chapter6;

import java.util.List;

/**
 * Created by sunilpatil on 4/1/17.
 */
public class RotateMatrix {

    /**
     * In this problem given a square matrix of n*n size we are supposed to rotate it.
     * 1  2  3  4         13  9  5  1
     * 5  6  7  8         14 10  6  2
     * 9  10 11 12        15 11  7  3
     * 13 14 15 16        16 12  8  4
     * Basic idea is same as spiral ordering go layer by layer
     */
    public void rotateMatrix2(List<List<Integer>> squareMatrix) {
        final int matrixSize = squareMatrix.size() - 1;
        //Outer loop deals with one layer at a time
        for (int i = 0; i < (squareMatrix.size() / 2); ++i) {
            //In every layer read 4 values store them in temp. variable and rotate them

            for (int j = i; j < matrixSize - i; ++j) {
                int temp1 = squareMatrix.get(matrixSize - j).get(i);
                int temp2 = squareMatrix.get(matrixSize - i).get(matrixSize - j);
                int temp3 = squareMatrix.get(j).get(matrixSize - i);
                int temp4 = squareMatrix.get(i).get(j);
                squareMatrix.get(i).set(j, temp1);
                squareMatrix.get(matrixSize - j).set(i, temp2);
                squareMatrix.get(matrixSize - i).set(matrixSize - j, temp3);
                squareMatrix.get(j).set(matrixSize - i, temp4);
            }
        }
    }

}