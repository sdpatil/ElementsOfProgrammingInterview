package com.eip.chapter5;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class ReverseBitsTest {
    ReverseBits problem;

    @Before
    public void setup(){
        problem = new ReverseBits();
    }

    @Test
    public void simpleTest(){
        int i = 73;
        System.out.println(Integer.toBinaryString(i));
        long result = problem.swapBits(73,1,6);
        System.out.println(Long.toBinaryString(result));
    }
}
