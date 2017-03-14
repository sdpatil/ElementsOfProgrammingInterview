package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class ReplaceAndRemoveTest {
    ReplaceAndRemove replaceAndRemove;

    @Before
    public void setup(){
        replaceAndRemove = new ReplaceAndRemove();
    }

    @Test
    public void simpleTest(){

        char[] c = new char[]{'a','c','d','b','b','c','a','0','0'};
        System.out.println(Arrays.toString(c));
        replaceAndRemove.replaceAndRemove(8,c);
        System.out.println(Arrays.toString(c));

    }
}
