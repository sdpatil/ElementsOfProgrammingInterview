package com.eip.chapter13;

import java.util.*;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class Anagram {
    public List<List<String>> findAnagrams(List<String> dictonary){
        List<List<String>> returnList = new ArrayList<List<String>>() ;

        Map<String,List<String>> wordMap = new HashMap<String, List<String>>();

        for(String word : dictonary){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);
            if(wordMap.get(sortedString) == null)
                wordMap.put(sortedString,new ArrayList<String>());

            wordMap.get(sortedString).add(word);
        }

        for(Map.Entry<String,List<String>> entry: wordMap.entrySet()){
            returnList.add(entry.getValue());
        }

        return returnList;
    }
}
