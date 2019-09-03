package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Problem905Test {
    Problem905 problem905;

    @Before
    public void setup() {
        problem905 = new Problem905();
    }

    @Test
    public void firstTest() {
        int[] input = {3, 1, 2, 4};
        int[] expectedOutput = {4, 2, 1, 3};
        int[] output = problem905.sortArrayByParity(input);
        System.out.println(Arrays.toString(output));
        assert Arrays.equals(expectedOutput, output);
    }

    @Test
    public void allreadySortedTest() {
        int[] input = {2, 4, 1, 3};
        int[] expectedOutput = {2, 4, 1, 3};
        int[] output = problem905.sortArrayByParity(input);
        System.out.println(Arrays.toString(output));
        assert Arrays.equals(expectedOutput, output);
    }

    @Test
    public void singleArrayElementTest() {
        int[] input = {2};
        int[] expectedOutput = {2};
        int[] output = problem905.sortArrayByParity(input);
        System.out.println(Arrays.toString(output));
        assert Arrays.equals(expectedOutput, output);
    }
}
