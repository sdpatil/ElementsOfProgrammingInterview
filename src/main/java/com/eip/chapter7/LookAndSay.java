package com.eip.chapter7;

/**
 * Problem: This method takes n as input and returns nth lookandsay string ex. 3rd look and feel string is 21
 * {1,11,21,1211,111221}
 */
public class LookAndSay {

    /*
      * Solution:- Call lookAndSayRec() n times with output of previous method as input
    */
    public String lookAndSay(int n) {
        String lookAndSayString = "1";
        for (int i = 1; i < n; i++) {
            lookAndSayString = lookAndSayRec(lookAndSayString);
            System.out.println(i + " " + lookAndSayString);
        }
        return lookAndSayString;
    }

    /*
    This method takes a string as input and returns its look and say equivalent
     */
    public String lookAndSayRec(String input) {
        StringBuffer result = new StringBuffer();
        char[] c = input.toCharArray();
        int currentCount = 1;
        char currentChar = c[0];
        for (int i = 1; i < c.length; i++) {
            if (currentChar == c[i]) {
                currentCount++;
            } else {
                result.append(currentCount);
                result.append(currentChar);
                currentChar = c[i];
                currentCount = 1;
            }
        }
        return result.toString();
    }
}
