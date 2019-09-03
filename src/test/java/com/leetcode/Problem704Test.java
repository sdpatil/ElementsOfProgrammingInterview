package com.leetcode;

import com.leetcode.Problem704;
import org.junit.Before;
import org.junit.Test;

public class Problem704Test {
    Problem704 problem704;

    @Before
    public void setup() {
        problem704 = new Problem704();
    }

    @Test
    public void recordFoundTest() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int output = problem704.search(nums, 9);
        System.out.println("Result is " + output);
        assert output == 4;
    }

    @Test
    public void recordNotFoundTest() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int output = problem704.search(nums, 2);
        System.out.println("Result is " + output);
        assert output == -1;
    }

    @Test
    public void singleRecordTest() {
        int[] nums = {5};
        int output = problem704.search(nums, 5);
        System.out.println("Result is " + output);
        assert output == 0;
    }
}
