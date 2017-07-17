package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/27/17.
 */
public class NumberOfWaysToTraverse2DArrayTest {
    NumberOfWaysToTraverse2DArray numberOfWaysToTraverse2DArray;

    @Before
    public void setup(){
        numberOfWaysToTraverse2DArray = new NumberOfWaysToTraverse2DArray();
    }

    @Test
    public void threeByThreeArrayTest(){
        int result = numberOfWaysToTraverse2DArray.numberOfWays(3,3);
        System.out.println("Result " + result);
        assert result ==6;
    }

    @Test
    public void fiveByFiveArrayTest(){
        int result = numberOfWaysToTraverse2DArray.numberOfWays(5,5);
        System.out.println("Result " + result);
        assert result == 70;
    }
}
