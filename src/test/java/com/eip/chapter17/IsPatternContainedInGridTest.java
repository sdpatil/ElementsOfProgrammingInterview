package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 4/4/17.
 */
public class IsPatternContainedInGridTest {
    IsPatternContainedInGrid isPatternContainedInGrid;

    @Before
    public void setup(){
        isPatternContainedInGrid = new IsPatternContainedInGrid();
    }

    @Test
    public void positiveTest(){
        List<List<Integer>> grid = new ArrayList<>();
        grid.add( Arrays.asList(1,2,3));
        grid.add(Arrays.asList(3,4,5));
        grid.add( Arrays.asList(5,6,7));

        List<Integer> pattern = Arrays.asList(1,3,4,6);

        boolean result = isPatternContainedInGrid.isPatternContainedInGrid(grid,pattern);
        System.out.println("Value of result " + result);
        assert result;
    }

    @Test
    public void negativeTest(){
        List<List<Integer>> grid = new ArrayList<>();
        grid.add( Arrays.asList(1,2,3));
        grid.add(Arrays.asList(3,4,5));
        grid.add( Arrays.asList(5,6,7));

        List<Integer> pattern = Arrays.asList(1,2,3,4);

        boolean result = isPatternContainedInGrid.isPatternContainedInGrid(grid,pattern);
        System.out.println("Value of result " + result);
        assert !result;
    }
}
