package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/21/17.
 */
public class SquareRootCalculatorTest {
    SquareRootCalculator squareRootCalculator;

    @Before
    public void setup(){
        squareRootCalculator = new SquareRootCalculator();
    }

    @Test
    public void simpleTest(){
       assert squareRootCalculator.squareRoot(25) ==5;
        assert squareRootCalculator.squareRoot(21) ==4;
    }
}
