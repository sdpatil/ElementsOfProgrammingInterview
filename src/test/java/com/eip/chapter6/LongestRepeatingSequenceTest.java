package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class LongestRepeatingSequenceTest {
    LongestRepeatingSequence longestRepeatingSequence;

    @Before
    public void setup(){
        longestRepeatingSequence= new LongestRepeatingSequence();
    }

    @Test
    public void simpleTest(){
        int[] a = new int[]{1,2,2,1,1,1};
        int longest = longestRepeatingSequence.longestSubarray(a);

        assert longest ==3;
    }
}
