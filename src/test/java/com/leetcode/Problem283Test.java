package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Problem283Test {
    Problem283 problem;

    @Before
    public void setup() {
        problem = new Problem283();
    }

    @Test
    public void firstTest() {
        int[] input = {0, 1, 0, 3, 12};
        int[] expectedOutput = {1, 3, 12, 0, 0};
        problem.moveZeroes(input);
        System.out.println("Output is " + Arrays.toString(input));
        assert Arrays.equals(input, expectedOutput);
    }
}
