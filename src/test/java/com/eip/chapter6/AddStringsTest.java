package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class AddStringsTest {
    AddStrings addStrings;

    @Before
    public void setup(){
        addStrings = new AddStrings();
    }

    @Test
    public void testSimple(){
        String output = addStrings.addStrings("123","456");
        assert output.equals("579");
    }

    @Test
    public void testStringsOfDifferentLength(){
        String output = addStrings.addStrings("111","2222");
        assert output.equals("2333");
    }

    @Test
    public void testStringsWithCarry(){
        String output = addStrings.addStrings("116","115");
        assert output.equals("231");
    }

}
