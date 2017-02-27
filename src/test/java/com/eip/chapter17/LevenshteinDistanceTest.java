package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/26/17.
 */
public class LevenshteinDistanceTest {
    LevenshteinDistance levenshteinDistance;

    @Before
    public void setup(){
        levenshteinDistance = new LevenshteinDistance();
    }

    @Test
    public void simpleTest(){
        String one = "abcdef";
        String two = "azced";
        int result = levenshteinDistance.levenshteinDistance(one,two);
        System.out.println("Value of result " + result);
        assert result ==3;
    }

    @Test
    public void complexTest(){
        String one = "Carthorse";
        String two = "Orchestra";
        int result = levenshteinDistance.levenshteinDistance(one,two);
        System.out.println("Value of result " + result);

    }
}
