package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class RabinKarpSubStringTest {
    RabinKarpSubString rabinKarpSubString;

    @Before
    public void setup(){
        rabinKarpSubString = new RabinKarpSubString();
    }

    @Test
    public void simpleTest(){
        assert rabinKarpSubString.rabinKarp("abc","abdabc") == 3;

        assert rabinKarpSubString.rabinKarp("abc","adbacb") == -1;
    }
}
