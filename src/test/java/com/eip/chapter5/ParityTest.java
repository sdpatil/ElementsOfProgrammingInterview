package com.eip.chapter5;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class ParityTest {
    Parity parity;

    @Before
    public void setup(){
        parity = new Parity();
    }

    @Test
    public void simpleTest(){
        assert parity.parity(4) ==1;
        assert parity.parity(6) == 0;
        assert parity.parity(7) ==1;
    }
}
