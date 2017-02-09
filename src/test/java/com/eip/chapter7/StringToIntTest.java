package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class StringToIntTest {
    StringToInt stringToInt;

    @Before
    public void setup() {
        stringToInt = new StringToInt();
    }

    @Test
    public void stringToIntTest() {
        assert stringToInt.stringToInt("0") == 0;
        assert stringToInt.stringToInt("1") == 1;
        assert stringToInt.stringToInt("123") == 123;
        assert stringToInt.stringToInt("3333") == 3333;
    }

    @Test
    public void stringToIntNegativeNumberTest() {
        assert stringToInt.stringToInt("-123") == -123;
        assert stringToInt.stringToInt("-3333") == -3333;
    }

    @Test
    public void intToStringSimple() {
        assert stringToInt.intToString(1).equals("1");
        assert stringToInt.intToString(12).equals("12");
        assert stringToInt.intToString(123).equals("123");

    }

    @Test
    public void intToStringNegative() {
        assert stringToInt.intToString(-1).equals("-1");
        assert stringToInt.intToString(-12).equals("-12");
        assert stringToInt.intToString(-123).equals("-123");

    }

}
