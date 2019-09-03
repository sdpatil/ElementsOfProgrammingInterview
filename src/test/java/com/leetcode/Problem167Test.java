package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Problem167Test {
    Problem167 problem167;

    @Before
    public void setup(){
        problem167 = new Problem167();
    }

    @Test
    public void firstTest(){
        int[] input = {2, 7, 11, 15};
        int[] output = problem167.twoSum(input, 9);
        System.out.println("Output is " + Arrays.toString(output));
        int[] expectedOutput = {0, 1};
        assert Arrays.equals(output, expectedOutput);
    }
}
