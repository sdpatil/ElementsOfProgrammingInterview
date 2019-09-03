package com.leetcode;


import org.junit.Before;
import org.junit.Test;

public class Problem1047Test {
    Problem1047 problem1047;

    @Before
    public void setup(){
        problem1047 = new Problem1047();
    }

    @Test
    public void simpleTest(){
        String input = "abbaca";
        String expectedOutput = "ca";

        String output = problem1047.removeDuplicates(input);
        System.out.printf("Expected Output %s Actual output %s \n", expectedOutput,output);
        assert expectedOutput.equals(output);
    }
}
