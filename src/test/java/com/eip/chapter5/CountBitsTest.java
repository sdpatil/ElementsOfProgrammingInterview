package com.eip.chapter5;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class CountBitsTest {
    CountBits countBits;

    @Before
    public void setup(){
        countBits = new CountBits();
    }

    @Test
    public void simpleTest(){
        assert countBits.countBits(4) ==1;
        assert countBits.countBits(2) ==1;
        assert countBits.countBits(7) ==3;
    }

}
