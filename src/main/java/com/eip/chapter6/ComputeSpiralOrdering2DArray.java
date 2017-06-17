package com.eip.chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 6/15/17.
 */
public class ComputeSpiralOrdering2DArray {


    public List<Integer> matrixInSpiralOrder    (List<List<Integer>> squareMatrix) {
        List<Integer> spiralOrder = new ArrayList<>();
        for (int i = 0; i < Math.ceil(0.5 * squareMatrix.size()); i++) {
            matrixLayerInClockWise(squareMatrix, spiralOrder, i);
        }
        return spiralOrder;
    }

    public void matrixLayerInClockWise(List<List<Integer>> squareMatrix, List<Integer> spiralOrder, int offset) {
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
}
