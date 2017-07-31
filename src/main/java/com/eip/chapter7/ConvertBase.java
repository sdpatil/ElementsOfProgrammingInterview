package com.eip.chapter7;


/**
 * Created by sunilpatil on 2/8/17.
 */
public class ConvertBase {

    public String convertBase(String numString, int b1, int b2) {
        System.out.println("Entering convertBase.convertBase " + numString);
        int intValue = convertFromStringToBase(numString, b1);
        String returnValue = convertFromBaseToString(intValue, b2);
        System.out.println("Exiting convertBase.convertBase " + numString);
        return returnValue;
    }

    /**
     * This method is used to convert any string to supplied base Ex. 101 base 2 is 7
     * The way it works is loop through all the digits from start and for every digit multiply the
     * old result by base and add current digit to the result
     */
    public int convertFromStringToBase(String numString, int base) {
        char[] c = numString.toCharArray();
        boolean isNegative = c[0] == '-' ? true : false;
        int result = 0;
        for (int i = isNegative ? 1 : 0; i < c.length; i++) {
            result = (result * base) + charToInt(c[i]);
        }
        if (isNegative)
            result = result * -1;
        return result;
    }

    /*
    This recursive method is used to convert a number to given base.
    Basic idea is in every iteration take remainder of the number by the base what ever is remainder
    becomes digit at the current position and pass number/base to the next iteration number ==0 is terminating
    condition
     */
    public String convertFromBaseToString(int number, int base){
        if(number == 0)
            return "";
        int currentDigit = number % base;
        return convertFromBaseToString(number/base, base) + intToChar(currentDigit);
    }


    public int charToInt(char c) {
        if (Character.isDigit(c))
            return Character.getNumericValue(c);
        else
            return c - 'A';
    }


    public char intToChar(int num) {
        if (num < 10)
            return (char) ('0' + num);
        else
            return (char) ('A' + num - 9);
    }
}
