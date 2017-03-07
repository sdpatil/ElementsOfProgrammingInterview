package com.eip.chapter7;

import java.util.HashMap;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class ConvertBase {


    public String convertBase(String numString, int b1, int b2) {
        System.out.println("Entering convertBase.convertBase " + numString);
        int intValue = convertFromStringToInt(numString, b1);
        String returnValue = constructFromBase(intValue, b2);
        System.out.println("Exiting convertBase.convertBase " + numString);
        return returnValue;
    }

    public int charToInt(char c) {
        if (Character.isDigit(c))
            return Character.getNumericValue(c);
        else
            return c - 'A';
    }

    public int convertFromStringToInt(String numString, int base) {
        System.out.println("Entering convertFromStringToInt " + numString);
        char[] c = numString.toCharArray();
        boolean isNegative = numString.startsWith("-");
        int numAsInt = 0;
        int startIndex = 0;
        if (isNegative)
            startIndex = 1;
        for (int i = startIndex; i < c.length; i++) {
            int currentDigit = charToInt(c[i]);
            numAsInt = numAsInt * base + currentDigit;
        }
        if (isNegative)
            numAsInt = numAsInt * -1;
        System.out.println("Exiting ConvertFromStringToInt " + numAsInt);
        return numAsInt;
    }

    public String constructFromBase(int num, int base) {
        if (num == 0)
            return "";
        int remainder = num % base;
        return constructFromBase(num / base, base) + "" + intToChar(remainder);
    }

    public char intToChar(int num) {
        if (num < 10)
            return (char) ('0' + num);
        else
            return (char) ('A' + num - 9);
    }
}
