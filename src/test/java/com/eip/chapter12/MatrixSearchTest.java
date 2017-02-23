package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class MatrixSearchTest {
    MatrixSearch matrixSearch;
    int[][] matrix = new int[6][5];

    @Before
    public void setup() {
        matrixSearch = new MatrixSearch();
        matrix[0] = new int[]{-1, 2, 4, 4, 6};
        matrix[1] = new int[]{1, 5, 5, 9, 21};
        matrix[2] = new int[]{3, 6, 6, 9, 22};
        matrix[3] = new int[]{3, 6, 8, 10, 24};
        matrix[4] = new int[]{6, 8, 9, 12, 25};
        matrix[5] = new int[]{8, 10, 12, 13, 40};

    }

    @Test
    public void negativeSearchTest() {
        assert !matrixSearch.matrixSearch(matrix,7);
    }

    @Test
    public void positiveSearchTest() {
        assert matrixSearch.matrixSearch(matrix,8);
    }
}
