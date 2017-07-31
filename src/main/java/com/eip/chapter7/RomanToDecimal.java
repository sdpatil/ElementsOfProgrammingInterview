package com.eip.chapter7;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: THis method takes a roman encoded string as input and returns its decimal equivalent.
 Ex. XXXXXIIIIIIIII is 59 or LIX is 59
 */
public class RomanToDecimal {

    /*

    Basic idea is start from the last characters, if the character is smaller than its follower then
    current characters value should be subtracted from total if not it should be added to total
     */
    public int romanToDecimal(String s){
        Map<Character, Integer> T = new HashMap<Character, Integer>();
        T.put('I',1);
        T.put('V',5);
        T.put('X',10);
        T.put('L',50);
        T.put('C',100);
        T.put('D',500);
        T.put('M',1000);

        int stringLength = s.length();
        int sum = s.charAt(stringLength-1);
        for(int i = s.length()-2 ; i >=0 ; i--){
            if(T.get(s.charAt(i)) < T.get(s.charAt(i+1))){
                sum = sum - T.get(s.charAt(i));
            }else{
                sum = sum + T.get(s.charAt(i));
            }
        }
        return sum;
    }

}
