package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class FindMinMaxSimulTest {
    FindMinMaxSimul findMinMaxSimul;

    @Before
    public void setup(){
        findMinMaxSimul = new FindMinMaxSimul();
    }

    @Test
    public void simpleTest(){
        int[] A = new int[]{3,2,5,1,2,4};
        FindMinMaxSimul.MinMax result = findMinMaxSimul.findMinMax(A);
        assert result.max == 5;
        assert result.min == 1;
    }

    @Test
    public void maxminLastElementTest(){
        int[] A = new int[]{3,2,5,1,2,4,6};
        assert findMinMaxSimul.findMinMax(A).max == 6;
        A = new int[]{3,2,5,1,2,4,6,0};
        assert findMinMaxSimul.findMinMax(A).min ==0;
    }

    @Test
    public void maxminFirstElementTest(){
        int[] A = new int[]{7,3,2,5,1,2,4,6};
        assert findMinMaxSimul.findMinMax(A).max == 7;
        A = new int[]{-1,3,2,5,1,2,4,6,0};
        assert findMinMaxSimul.findMinMax(A).min ==-1;
    }
}
