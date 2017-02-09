package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class TestPalindromicityTest {
    TestPalindromicity testPalindromicity;

    @Before
    public void setup(){
        testPalindromicity = new TestPalindromicity();
    }

    @Test
    public void testPalindromeTest(){
        assert testPalindromicity.isPalindrome("A man, a plan, a canal, Panama");

    }

    @Test
    public void testPalindromePositiveTest(){
        assert testPalindromicity.isPalindrome("Able was I, ere, I saw Elba!");

    }

    @Test
    public void testPalindromeNegativeTest(){
        assert !testPalindromicity.isPalindrome("Ray a Ray");
    }
}
