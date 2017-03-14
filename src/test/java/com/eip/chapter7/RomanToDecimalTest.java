package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class RomanToDecimalTest {
    RomanToDecimal romanToDecimal;

    @Before
    public void setup(){
        romanToDecimal = new RomanToDecimal();
    }

    @Test
    public void simpleTest(){
        assert romanToDecimal.romanToDecimal("XXXXXIIIIIIIII") == 59;
        assert romanToDecimal.romanToDecimal("LVIIII") == 59;
        assert romanToDecimal.romanToDecimal("LIX") == 59;

    }
}
