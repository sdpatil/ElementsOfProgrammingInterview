package com.eip.chapter13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class PalindromicPermutation {

    public boolean canFormPalindrome(String s){
        Map<Character, Integer> charFrequencyMap = new HashMap<Character, Integer>();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(charFrequencyMap.containsKey(c)){
                int frequencyCount = charFrequencyMap.get(c);
                charFrequencyMap.put(c,frequencyCount+1);
            }else{
                charFrequencyMap.put(c,1);
            }
        }

        boolean singleCharFound = false;
        for(Map.Entry<Character,Integer> entry : charFrequencyMap.entrySet()){
            if(entry.getValue() % 2 == 0)
                continue;
            else if(s.length() % 2 ==1 && singleCharFound == false){
                singleCharFound = true;
                continue;
            }else
                return false;
        }

        return true;
    }
}
