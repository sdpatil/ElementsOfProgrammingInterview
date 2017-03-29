package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/19/17.
 */
public class PalindromicDecompositionTest {
    PalindromicDecomposition palindromicDecomposition;

    @Before
    public void setup(){
        palindromicDecomposition = new PalindromicDecomposition();
    }

    @Test
    public void simpleTest(){
        List<List<String>> result= palindromicDecomposition.palindromePartitioning("0204451881");
        System.out.println(result);

    }
}
