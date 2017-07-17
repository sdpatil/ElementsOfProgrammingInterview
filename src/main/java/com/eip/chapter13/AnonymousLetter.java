package com.eip.chapter13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class AnonymousLetter {

    /*
    Problem: Given a anonymous letter and magazine text check if all the letters required for
    writing anonymous letter are there in the magazine

    Solution: - Basic idea is first iterate through all the letters along with the frequency they
    occur from text in a HashMap, then iterate through every letter in magazineText and when you find
    a letter in magazine remove it from map. If the map becomes empty before we finish all the letters
    in magazine then that means we can construct leter
     */
    public  boolean isLetterConstructibleFromMagazine(String letterText, String magazineText) {
        Map<Character,Integer> charFrequencyMap = new HashMap<>();

        for(int i = 0 ; i < letterText.length(); i++){
            char c = letterText.charAt(i);
            if(charFrequencyMap.containsKey(c)){
                charFrequencyMap.put(c, charFrequencyMap.get(c)+1);
            }else{
                charFrequencyMap.put(c,1);
            }
        }

        for(int i = 0 ; i < magazineText.length() && !charFrequencyMap.isEmpty(); i++){
            char c = magazineText.charAt(i);
            if(charFrequencyMap.containsKey(c)){
                int frequency = charFrequencyMap.get(c);
                if(frequency ==1)
                    charFrequencyMap.remove(c);
                else
                    charFrequencyMap.put(c, frequency-1);
            }
        }
        return charFrequencyMap.isEmpty();
    }


     /*   public  boolean isLetterConstructibleFromMagazine(String letterText, String magazineText) {
        Map<Character, Integer> charFrequencyForLetter = new HashMap<Character, Integer>();
        for (int i = 0; i < letterText.length(); i++) {
            char c = letterText.charAt(i);
            if (charFrequencyForLetter.containsKey(c)) {
                charFrequencyForLetter.put(c, charFrequencyForLetter.get(c) + 1);
            } else {
                charFrequencyForLetter.put(c, 1);
            }
        }
        for (int i = 0; i < magazineText.length(); i++) {
            char c = magazineText.charAt(i);
            if(charFrequencyForLetter.containsKey(c)){
                int charFrequency = charFrequencyForLetter.get(c);
                if(charFrequency != 1)
                 charFrequencyForLetter.put(c,charFrequency-1);
                else
                    charFrequencyForLetter.remove(c);
            }else
                return false;
        }

        return charFrequencyForLetter.isEmpty();
    }*/
}
