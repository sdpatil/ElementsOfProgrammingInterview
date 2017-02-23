package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/22/17.
 */
public class ComputeRealSquareRootTest {

    ComputeRealSquareRoot computeRealSquareRoot;

    @Before
    public void setup(){
        computeRealSquareRoot = new ComputeRealSquareRoot();
    }

    @Test
    public void xGreaterThan1Test(){
        double returnValue = computeRealSquareRoot.squareRoot(4.0);
        assert computeRealSquareRoot.compare(returnValue,2.00000) == ComputeRealSquareRoot.Ordering.EQUAL;
        returnValue = computeRealSquareRoot.squareRoot(5.0);
        assert computeRealSquareRoot.compare(returnValue,2.23606) == ComputeRealSquareRoot.Ordering.EQUAL;

    }

    @Test
    public void xLessThan1Test(){
        double returnValue = computeRealSquareRoot.squareRoot(0.25);

        assert computeRealSquareRoot.compare(returnValue,0.50000) == ComputeRealSquareRoot.Ordering.EQUAL;
    }
}
