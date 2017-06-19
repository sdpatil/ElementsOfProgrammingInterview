package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class PalinDromeTest {
    PalinDrome palinDrome;

    @Before
    public void setup(){
        palinDrome = new PalinDrome();
    }

    @Test
    public void evenLengthStrings(){
        assert palinDrome.isPalinDrome("ABBA");
        assert !palinDrome.isPalinDrome("ABAB");
    }

    @Test
    public void oddLengthStrings(){
        assert palinDrome.isPalinDrome("ABABA");
        assert !palinDrome.isPalinDrome("ABAAB");
    }

    @Test
    public void complexStringsTest(){
        assert palinDrome.isPalinDrome("A man, a plan, a canal, Panama");
        assert !palinDrome.isPalinDrome("Ray a Ray");
    }
}
