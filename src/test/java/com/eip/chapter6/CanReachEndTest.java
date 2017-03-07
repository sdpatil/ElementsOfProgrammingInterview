package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/6/17.
 */
public class CanReachEndTest {
    CanReachEnd canReachEnd;

    @Before
    public void setup(){
        canReachEnd = new CanReachEnd();
    }

    @Test
    public void simplePositiveTest(){
        List<Integer> numList = Arrays.asList(3,3,1,0,2,0,1);
        assert canReachEnd.canReachEnd(numList);
    }

    @Test
    public void simpleNegativeTest(){
        List<Integer> numList = Arrays.asList(3,2,0,0,2,0,1);
        assert !canReachEnd.canReachEnd(numList);
    }
}
