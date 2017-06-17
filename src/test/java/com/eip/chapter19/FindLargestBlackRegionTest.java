package com.eip.chapter19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class FindLargestBlackRegionTest {
    FindLargestBlackRegion problem = new FindLargestBlackRegion();

    @Test
    public void simpleTest(){
        List<List<Boolean>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(true, true, false, true));
        matrix.add(Arrays.asList(false,false,true,true));
        matrix.add(Arrays.asList(true,true,false,true));
        matrix.add(Arrays.asList(true,true,true,false));

        int result = problem.findLargestBlackRegion(matrix);
        assert result == 2;
    }

    @Test
    public void simple2Test(){
        List<List<Boolean>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(true, true, false, true));
        matrix.add(Arrays.asList(false,false,true,true));
        matrix.add(Arrays.asList(true,true,false,true));
        matrix.add(Arrays.asList(true,true,false,false));

        int result = problem.findLargestBlackRegion(matrix);
        assert result == 3;
    }

    @Test
    public void simple3Test(){
        List<List<Boolean>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(true, true, false, true));
        matrix.add(Arrays.asList(false,false,false,true));
        matrix.add(Arrays.asList(true,true,false,true));
        matrix.add(Arrays.asList(true,true,false,false));

        int result = problem.findLargestBlackRegion(matrix);
        assert result == 7;
    }
}
