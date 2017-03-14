package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class SinusoidallyStringTest {
    SinusoidallyString sinusoidallyString;

    @Before
    public void setup(){
        sinusoidallyString = new SinusoidallyString();
    }

    @Test
    public void simpleTest(){
        String snakeString = sinusoidallyString.snakeString("Hello World!");
        System.out.println("Return String " + snakeString);
        assert snakeString.equals("e lHloWrdlo!");
    }
}
