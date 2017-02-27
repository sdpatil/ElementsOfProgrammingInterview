package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/25/17.
 */
public class NumberOfScoreCombinationsTest {
    NumberOfScoreCombinations numberOfScoreCombinations;

    @Before
    public void setup(){
        numberOfScoreCombinations = new NumberOfScoreCombinations();
    }

    @Test
    public void simpleTest(){
        int[] individualPlays = new int[]{1,2,3};
        int result = numberOfScoreCombinations.numOfCombinationsForFinalScore(5,individualPlays);
        System.out.println("Result " + result);
        assert result ==5;
    }

    @Test
    public void complexTest(){
        int[] individualPlays = new int[]{2,3,7};
        int result = numberOfScoreCombinations.numOfCombinationsForFinalScore(12,individualPlays);
        System.out.println("Result " + result);
        assert result ==4;
    }
}
