package com.eip.chapter7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class RomanToDecimal {

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
        int sum = T.get(s.charAt(stringLength-1));

        for(int i = stringLength-2; i >=0; i--){
            if(T.get(s.charAt(i)) < T.get(s.charAt(i+1))){
                sum -= T.get(s.charAt(i));
            }else{
                sum += T.get(s.charAt(i));
            }
        }
        return sum;

    }
}
