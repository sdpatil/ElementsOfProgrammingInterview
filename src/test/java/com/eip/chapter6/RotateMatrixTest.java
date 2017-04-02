package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 4/1/17.
 */
public class RotateMatrixTest {
    RotateMatrix rotateMatrix;

    @Before
    public void setup(){
        rotateMatrix = new RotateMatrix();
    }

    @Test
    public void simpleTest(){
        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(Arrays.asList(1,2,3,4));
        matrix.add(Arrays.asList(5,6,7,8));
        matrix.add(Arrays.asList(9,10,11,12));
        matrix.add(Arrays.asList(13,14,15,16));

        System.out.println(matrix);
        rotateMatrix.rotateMatrix(matrix);
        System.out.println(matrix);
    }
}
