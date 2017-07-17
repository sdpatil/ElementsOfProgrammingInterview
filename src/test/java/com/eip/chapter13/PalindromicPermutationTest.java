package com.eip.chapter13;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class PalindromicPermutationTest {
    PalindromicPermutation palindromicPermutation;

    @Before
    public void setup(){
        palindromicPermutation = new PalindromicPermutation();
    }

    @Test
    public void simpleTest(){
        assert palindromicPermutation.canFormPalindrome("level") == true;
        assert palindromicPermutation.canFormPalindrome("rotator") == true;
        assert palindromicPermutation.canFormPalindrome("edified") == true;
        assert palindromicPermutation.canFormPalindrome("aab") == true;

    }
}
