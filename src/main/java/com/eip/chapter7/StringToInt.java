package com.eip.chapter7;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class StringToInt {
    public static void main(String[] argv) {
        StringToInt sti = new StringToInt();
        System.out.println(sti.intToString(-10));
        System.out.println(sti.stringToInt("123"));
    }

    /**
     * This method takes integer as input and converts it to string
     */
    public String intToString(int i) {
        StringBuffer sb = new StringBuffer();
        boolean isNegative = false;
        //Check if i is negative if yes remember that and convert i to absolute
        if (i < 0)
            isNegative = true;
        i = Math.abs(i);
        //Use do while so that you can handle correct conversion of 0, at every step take remainder of 10
        //append to string and divide i by 10 and move on
        do {
            sb.append(((char) ('0' + (i % 10))));
            i = i / 10;
        } while (i != 0);

        if (isNegative)
            sb.append("-");
        return sb.reverse().toString();
    }

    //This method takes a string as input and parses it to integer
    public int stringToInt(String s) {
        char[] c = s.toCharArray();
        int returnValue = 0;
        //First check if the first character is '-' if yes this is negative number
        boolean isNegative = c[0] == '-' ? true : false;
        // Go through all the characters of a string and for every character convert it to digit by doing c -'0'
        for (int i = isNegative ? 1 : 0; i < c.length; i++) {
            int digitValue = c[i] - '0';
            returnValue = returnValue * 10 + digitValue;
        }
        if (isNegative)
            returnValue = returnValue * -1;
        return returnValue;
    }


}
