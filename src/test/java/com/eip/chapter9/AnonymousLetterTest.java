package com.eip.chapter9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class AnonymousLetterTest {
    AnonymousLetter anonymousLetter;

    @Before
    public void setup(){
        anonymousLetter = new AnonymousLetter();
    }

    @Test
    public void simpleTest(){
        assert anonymousLetter.isLetterConstructibleFromMagazine("Hello from Sunil", "Hello from Sunil") == true;
        assert anonymousLetter.isLetterConstructibleFromMagazine("Leena", "Hello from Sunil") == false;

    }
}
