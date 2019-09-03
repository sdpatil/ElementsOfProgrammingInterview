package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Problem1Test {
    Problem1 problem1;

    @Before
    public void setup() {
        problem1 = new Problem1();
    }

    @Test
    public void firstTest() {
        int[] input = {2, 7, 11, 15};
        int[] output = problem1.twoSum(input, 9);
        System.out.println("Output is " + Arrays.toString(output));
        int[] expectedOutput = {0, 1};
        assert Arrays.equals(output, expectedOutput);
    }

    @Test
    public void leetCode8Test() {
        int[] input = {3, 2, 4};
        int[] output = problem1.twoSum(input, 6);
        System.out.println("Output is " + Arrays.toString(output));
        int[] expectedOutput = {1, 2};
        assert Arrays.equals(output, expectedOutput);
    }

    @Test
    public void leetCode17Test() {
        int[] input = {0, 4, 3, 0};
        int[] output = problem1.twoSum(input, 0);
        System.out.println("Output is " + Arrays.toString(output));
        int[] expectedOutput = {0, 3};
        assert Arrays.equals(output, expectedOutput);
    }
}
