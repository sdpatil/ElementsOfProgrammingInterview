package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Problem15Test {
    Problem15 problem;

    @Before
    public void setup() {
        problem = new Problem15();
    }

    @Test
    public void firstTest() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> output = problem.threeSum(input);

        System.out.println("Output is " + output);
        assert output.size() == 2;
    }

    @Test
    public void leetCode51Test() {
        int[] input = {0, 0, 0, 0};
        List<List<Integer>> output = problem.threeSum(input);

        System.out.println("Output is " + output);
        assert output.size() == 1;
    }
}
