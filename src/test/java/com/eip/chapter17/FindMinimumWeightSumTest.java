package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/3/17.
 */
public class FindMinimumWeightSumTest {
    FindMinimumWeightSum findMinimumWeightSum;

    @Before
    public void setup(){
        findMinimumWeightSum = new FindMinimumWeightSum();
    }

    @Test
    public void simpleTest(){
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(4,4));
        triangle.add(Arrays.asList(8,5,6));
        triangle.add(Arrays.asList(4,2,6,2));
        triangle.add(Arrays.asList(1,5,2,3,4));

        assert findMinimumWeightSum.minimumPathTotal(triangle) == 15;

    }
}
