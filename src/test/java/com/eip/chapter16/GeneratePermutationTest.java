package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/20/17.
 */
public class GeneratePermutationTest {
    GeneratePermutation generatePermutation;

    @Before
    public void setup(){
        generatePermutation = new GeneratePermutation();
    }

    @Test
    public void simpleTest(){
        List<Integer> input = Arrays.asList(2,3,5,7);
        List<List<Integer>> result = generatePermutation.generatePermutation(input);
        System.out.println(result);
    }

    @Test
    public void simpleTest2(){
        List<Integer> input = Arrays.asList(1,2,3);
        List<List<Integer>> result = generatePermutation.generatePermutation(input);
        System.out.println(result);
    }
}
