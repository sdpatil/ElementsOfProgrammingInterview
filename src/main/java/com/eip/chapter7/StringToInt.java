package com.eip.chapter7;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class StringToInt {

    public int stringToInt(String s) {
        System.out.println("Entering StringToInt.stringToInt " + s);
        char[] c = s.toCharArray();
        int returnValue = 0;
        for (int i = 0; i < c.length; i++) {
            //Check if this negative value
            if (c[i] != '-')
                returnValue = Character.getNumericValue(c[i]) + returnValue * 10;

        }
        if (c[0] == '-')
            returnValue = returnValue * -1;

        System.out.println("Exiting StringToInt.stringToInt " + returnValue);
        return returnValue;
    }

    public String intToString(int i) {
        System.out.println("Entering StringToInt.intToString " + i);
        StringBuffer b = new StringBuffer();
        boolean isNegative = false;
        if (i < 0)
            isNegative = true;
        i = Math.abs(i);
        while (i != 0) {
            b.append(i % 10);
            i = i / 10;
        }
        if (isNegative)
            b.append("-");
        String returnValue = b.reverse().toString();
        System.out.println("Exiting StringToInt.intToString " + returnValue);
        return returnValue;
    }
}
