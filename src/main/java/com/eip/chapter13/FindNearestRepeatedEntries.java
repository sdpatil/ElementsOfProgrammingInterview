package com.eip.chapter13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class FindNearestRepeatedEntries {

    /*
    Problem :Write a program that takes as input an array and finds the distance between a closest pair
    of equal entries
    Ex. {"All","Work","and","no","play","makes","for","no","word","no","fun","and","no","result"}
    Answer is 2 in this case, which is distance between second and third no.
    Solution:
     */
    public int findNearestRepeatedEntries(List<String> paragraph) {
        Map<String, Integer> wordToIndexMap = new HashMap<>();
        int nearestDistance = Integer.MAX_VALUE;
        for(int i = 0 ; i < paragraph.size() ;i++){
            String currentWord = paragraph.get(i);
            if(wordToIndexMap.containsKey(currentWord)){
                // If this word was seen before then calculate distance between when the word was
                //seen last time and i
                int currentDistance = i - wordToIndexMap.get(currentWord);
                int minDistance = Math.min(nearestDistance, currentDistance);
            }
            //Put the index of current location and the current word in the map
            wordToIndexMap.put(currentWord,i);
        }
        return nearestDistance;
    }
/*
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
    }*/
}
