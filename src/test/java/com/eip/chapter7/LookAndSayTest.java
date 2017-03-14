package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class LookAndSayTest {
    LookAndSay lookAndSay = null;

    @Before
    public void setup(){
        lookAndSay = new LookAndSay();
    }

    @Test
    public void simpleTest(){
        String lookAndSayStr = lookAndSay.lookAndSay(5);
        System.out.println("Return Value " + lookAndSayStr);
        assert lookAndSayStr.equals("111221");
    }
}
