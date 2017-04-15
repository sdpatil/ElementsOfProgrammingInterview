package com.eip.chapter13;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class LongestContainedRangeTest {
    LongestContainedRange longestContainedRange;

    @Before
    public void setup() {
        longestContainedRange = new LongestContainedRange();
    }

    @Test
    public void simpleTest() {
        List<Integer> numList = Arrays.asList(3, -2, 7, 9, 8, 1, 2,0, -1, 5, 8);
        int returnValue = longestContainedRange.longestContainedRange(numList);
        System.out.println("Return value " + returnValue);
        assert returnValue == 6;
    }
}
