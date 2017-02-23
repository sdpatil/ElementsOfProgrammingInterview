package com.eip.chapter13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class FindNearestRepeatedEntries {

    public int findNearestRepeatedEntries(List<String> paragraph){
        Map<String, Integer> wordToIndexMap = new HashMap<String, Integer>();
        int nearestDistance = Integer.MAX_VALUE;
        for(int i = 0 ; i < paragraph.size();i++){
            String currentWord = paragraph.get(i);
            if(wordToIndexMap.containsKey(currentWord)){
                int distance = i -wordToIndexMap.get(currentWord) ;
                nearestDistance = Math.min(nearestDistance,distance);
            }
            wordToIndexMap.put(currentWord,i);
        }
        System.out.println("Nearest distance " + nearestDistance);
        return nearestDistance;
    }
}
