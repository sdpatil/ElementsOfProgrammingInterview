package com.leetcode;

import org.junit.Before;
import org.junit.Test;

public class Problem20Test {
    Problem20 problem20;

    @Before
    public void setup() {
        problem20 = new Problem20();
    }

    @Test
    public void simpleTest() {
        String inputString = "()";
        assert problem20.isValid(inputString);
    }

    @Test
    public void simple1Test() {
        String inputString = "()";
        assert problem20.isValid(inputString);
    }

    @Test
    public void simple2Test() {
        String inputString = "()[]{}";
        assert problem20.isValid(inputString);
    }

    @Test
    public void simple3Test() {
        String inputString = "(]";
        assert !problem20.isValid(inputString);
    }

    @Test
    public void simple4Test() {
        String inputString = "([)]";
        assert !problem20.isValid(inputString);
    }

    @Test
    public void simple5Test() {
        String inputString = "{[]}";
        assert problem20.isValid(inputString);
    }
}
