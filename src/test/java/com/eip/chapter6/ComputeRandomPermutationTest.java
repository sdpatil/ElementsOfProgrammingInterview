package com.eip.chapter6;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/16/17.
 */
public class ComputeRandomPermutationTest {
    ComputeRandomPermutation problem =new ComputeRandomPermutation();

    @Test
    public void simpleTest(){
        List<Integer> result = problem.computeRandomPermutation(5);
        System.out.println(result);
    }
}
