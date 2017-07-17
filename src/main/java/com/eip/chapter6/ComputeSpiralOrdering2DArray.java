package com.eip.chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * In this problem given a 2D array we are supposed to write it in spiral order
 *  1 2 3
 *  4 5 6
 *  7 8 9
 *  Spiral order is 1 2 3 6 9 8 7 4 5
 */
public class ComputeSpiralOrdering2DArray {
    //Basic idea is to solve the problem layer by first get outer most layer then go inward
    public List<Integer> matrixInSpiralOrder(List<List<Integer>> squareMatrix) {
        List<Integer> spiralOrder = new ArrayList<>();
        for (int i = 0; i < Math.ceil(0.5 * squareMatrix.size()); i++) {
            matrixLayerInClockWise(squareMatrix, spiralOrder, i);
        }
        return spiralOrder;
    }

    public void matrixLayerInClockWise(List<List<Integer>> squareMatrix, List<Integer> spiralOrder, int offset) {
        //This checks if square matrix has odd dimension, if yes then the last entry is middle
        if (offset == squareMatrix.size() - offset - 1) {
            spiralOrder.add(squareMatrix.get(offset).get(offset));
        }

        //Top most row
        for (int j = offset; j < squareMatrix.size() - offset - 1; j++) {
            spiralOrder.add(squareMatrix.get(offset).get(j));
        }
        //Right most column
        for (int j = offset; j < squareMatrix.size() - offset - 1; j++) {
            spiralOrder.add(squareMatrix.get(j).get(squareMatrix.size() - offset - 1));
        }
        //Bottom row
        for (int j = squareMatrix.size() - offset - 1; j > offset; j--) {
            spiralOrder.add(squareMatrix.get(squareMatrix.size() - offset - 1).get(j));
        }
        //Left column
        for (int j = squareMatrix.size() - offset - 1; j > offset; j--) {
            spiralOrder.add(squareMatrix.get(j).get(offset));
        }
    }

    public void matrixInSpiralOrder(int[][] squareMatrix) {
        spiralPrint(squareMatrix.length, squareMatrix[0].length,squareMatrix);
    }

    public void spiralPrint(int endRow, int endColumn, int[][] squareMatrix){
        int startRow = 0;
        int startColumn = 0;
        int i =0;
        while (startRow < endRow && startColumn < endColumn){
            for( i = startColumn ; i < endColumn ; i++){
                System.out.print(squareMatrix[startRow][i] +" ");
            }
            startRow++;
            for(i = startRow ; i < endRow ; i++){
                System.out.print(squareMatrix[i][endColumn-1] +" ");
            }
            endColumn--;
            if(startRow< endRow) {
                for (i = endColumn-1; i >= startColumn; i--) {
                    System.out.print(squareMatrix[endRow-1][i] +" ");
                }
                endRow--;
            }
            if(startColumn  < endColumn){
                for(i = endRow-1 ; i >= startRow; i--){
                    System.out.print(squareMatrix[i][startColumn]+" ");
                }
                startColumn++;
            }
        }
    }
}