package com.eip.chapter9;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class AnonymousLetter {

    public  boolean isLetterConstructibleFromMagazine(String letterText, String magazineText) {
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
    }
}
