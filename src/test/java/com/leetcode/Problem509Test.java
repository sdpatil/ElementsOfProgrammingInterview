package com.leetcode;

import org.junit.Before;
import org.junit.Test;

public class Problem509Test {
    Problem509 problem509;

    @Before
    public void setup() {
        problem509 = new Problem509();
    }

    @Test
    public void testSmallNumber() {
        assert problem509.fib(2) == 1;
        assert problem509.fib(3) == 2;
        assert problem509.fib(4) == 3;
    }

    @Test
    public void testNumber() {
        assert problem509.fib(30) == 832040;

    }
}
