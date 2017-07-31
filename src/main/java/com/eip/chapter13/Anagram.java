package com.eip.chapter13;

import java.util.*;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class Anagram {

    /*
        Problem: Given set of words, return list of words that are anagrams
        Solution: Two words are anagrams of each other if we can use characters of one word to buid other word
        Quickest way to find if two words are anagrams of each other is to sort their characters, if the sorted
        sequence matches then they are anagrams.
     */
    public List<List<String>> findAnagrams(List<String> dictonary) {

        List<List<String>> result = new ArrayList<>();
        //Create a map with anagram as key and list of words as map
        Map<String, List<String>> anagramToWordMap = new HashMap<>();

        for(String word: dictonary){
            //Convert a word to char array and sort that array
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            List<String> wordBag = anagramToWordMap.get(key);
            if(wordBag == null){
                wordBag = new ArrayList<>();
                anagramToWordMap.put(key,wordBag);
            }
            wordBag.add(word);
        }

        for(Map.Entry<String,List<String>> entry: anagramToWordMap.entrySet()){
            if(entry.getValue().size() >=2)
                result.add((List<String>)entry.getValue());
        }

        return result;
    }


}
