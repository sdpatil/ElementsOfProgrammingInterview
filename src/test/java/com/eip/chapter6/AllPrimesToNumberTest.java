package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/6/17.
 */
public class AllPrimesToNumberTest {
    AllPrimesToNumber allPrimesToNumber;

    @Before
    public void setup() {
        allPrimesToNumber = new AllPrimesToNumber();
    }

    @Test
    public void simpleTest() {
        List<Integer> primesList = allPrimesToNumber.generatePrimes(18);
        assert primesList.size() == 7;
        assert primesList.get(0) == 2;
        assert primesList.get(1) == 3;
        assert primesList.get(2) == 5;
        assert primesList.get(3) == 7;
        assert primesList.get(4) == 11;
        assert primesList.get(5) == 13;
        assert primesList.get(6) == 17;

    }
}
