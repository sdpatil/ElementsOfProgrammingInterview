package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/27/17.
 */
public class FindLongestNonDecreasingSubsequenceTest {
    FindLongestNonDecreasingSubsequence findLongestNonDecreasingSubsequence;

    @Before
    public void setup(){
        findLongestNonDecreasingSubsequence = new FindLongestNonDecreasingSubsequence();
    }

    @Test
    public void simpleTest(){
        List<Integer> a = Arrays.asList(0,8,4,12,2,10,6,14,1,9);
        int result = findLongestNonDecreasingSubsequence.longestNonDecreasingSubsequenceLength(a);
        System.out.println("Value of longest length " + result);
    }
}
