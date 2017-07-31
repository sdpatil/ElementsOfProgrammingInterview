package com.eip.chapter13;

import java.util.HashMap;
import java.util.Map;


public class PalindromicPermutation {

    /*
        Problem: Given a string figure out if its characters can be rearranged to form
        a plaindrom
        Ex. level is true. sunius is false

        Solution: Basic idea is store frequency of all characters in the string in a map
        for a string to be palindromic every character must appear twice and only one char
        should appear once. Check for that
     */
    public boolean canFormPalindrome(String s) {
        Map<Character,Integer> charFrequencyMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length ; i++){
            if(charFrequencyMap.containsKey(chars[i])){
                int frequency = charFrequencyMap.get(chars[i]);
                charFrequencyMap.put(chars[i],frequency+1);
            }else{
                charFrequencyMap.put(chars[i],1);
            }
        }
        int oddCount = 0;
        for(Map.Entry<Character,Integer>  entry: charFrequencyMap.entrySet()){
            if(entry.getValue() %2 !=0 && ++oddCount >1)
                return false;
        }
        return true;
    }
}
