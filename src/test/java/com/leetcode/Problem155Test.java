package com.leetcode;

import org.junit.Before;
import org.junit.Test;

public class Problem155Test {
    Problem155 problem155 ;

    @Before
    public void setup(){
        problem155 = new Problem155();
    }

    @Test
    public void simpleTest(){
        problem155.push(-2);
        problem155.push(0);
        problem155.push(-3);
        assert problem155.getMin() == -3;
        problem155.pop();

        assert problem155.top() == 0;
        assert problem155.getMin() == -2;
    }

    @Test
    public void leetCode15Test(){
        problem155.push(2);
        problem155.push(0);
        problem155.push(3);
        problem155.push(0);
        assert problem155.getMin() == 0;
        problem155.pop();
        assert problem155.getMin() == 0;
        problem155.pop();
        assert problem155.getMin() == 0;
        problem155.pop();
        assert problem155.getMin() == 2;
    }
}
