package com.eip.chapter6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/15/17.
 */
public class ComputeSpiralOrdering2DArrayTest {
    ComputeSpiralOrdering2DArray problem = new ComputeSpiralOrdering2DArray();

    @Test
    public void simpleTest(){
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1,2,3));
        matrix.add(Arrays.asList(4,5,6));
        matrix.add(Arrays.asList(7,8,9));

        List<Integer> result = problem.matrixInSpiralOrder(matrix);
        System.out.println(result);
    }

    @Test
    public void simple2Test(){
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1,2,3,4));
        matrix.add(Arrays.asList(5,6,7,8));
        matrix.add(Arrays.asList(9,10,11,12));
        matrix.add(Arrays.asList(13,14,15,16));

        List<Integer> result = problem.matrixInSpiralOrder(matrix);
        System.out.println(result);
    }
}
