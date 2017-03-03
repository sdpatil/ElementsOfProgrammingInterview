package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class NumberOfMovesToClimbStairsTest {
    NumberOfMovesToClimbStairs numberOfMovesToClimbStairs;

    @Before
    public void setup(){
        numberOfMovesToClimbStairs = new NumberOfMovesToClimbStairs();
    }

    @Test
    public void simpleTest(){
        int result = numberOfMovesToClimbStairs.computeNumberOfWays(4,2);
        assert result ==5;
    }
}
