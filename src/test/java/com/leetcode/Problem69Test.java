package com.leetcode;

import org.junit.Before;
import org.junit.Test;

public class Problem69Test {
    Problem69 problem69;

    @Before
    public void setup() {
        problem69 = new Problem69();
    }

    @Test
    public void squareRootOfOneTest() {
        int output = problem69.mySqrt(1);
        System.out.println("Value of sqrt " + output);
        assert output == 1;
    }

    @Test
    public void completeSquareRootTest() {
        int output = problem69.mySqrt(4);
        System.out.println("Value of sqrt " + output);
        assert output == 2;
    }

    @Test
    public void squareWithReminderRootTest() {
        int output = problem69.mySqrt(8);
        System.out.println("Value of sqrt " + output);
        assert output == 2;
    }

    @Test
    public void overflowSquareNumberTest() {
        int output = problem69.mySqrt(2147395599);
        System.out.println("Value of sqrt " + output);
        assert output == 46339;
    }

    @Test
    public void sqrtOfThreeTest() {
        int output = problem69.mySqrt(3);
        System.out.println("Value of sqrt " + output);
        assert output == 1;
    }

    @Test
    public void largeNumberTest() {
        int output = problem69.mySqrt(677889);
        System.out.println("Value of sqrt " + output);
        assert output == 823;
    }



}
