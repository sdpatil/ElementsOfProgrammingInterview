package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/22/17.
 */
public class MinimumWeightPathSumTest {
    MinimumWeightPathSum minimumWeightPathSum;

    @Before
    public void setup(){
        minimumWeightPathSum = new MinimumWeightPathSum();
    }

    @Test
    public void simpleTest(){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(0, Arrays.asList(2));
        triangle.add(1, Arrays.asList(4,4));
        triangle.add(2, Arrays.asList(8,5,6));
        triangle.add(3, Arrays.asList(4,2,6,2));
        triangle.add(4, Arrays.asList(1,5,2,3,4));

        int result = minimumWeightPathSum.minimumTotalPath(triangle);
        System.out.println("Minium weight path sum " + result);
        assert result ==15;
    }
}
