package com.eip.chapter13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class ComputeStringDecomposition {

    /*
    Problem: Given a list of words figure out if they can be combined together to form a string that
    is substring of s.
    Given words {"can","apl","ana"} and string "amanaplanacanal", the words combine to make word
    aplanacan which is part of "amanaplanacanal" string starting at char 4

     Solution: First calculate map of word to frequency for all words in wordlist
     Then go through string s, starting at every character to figure out if you can take part of string
     and find it in wordMap, if yes take the word and frequency out of map. If map is empty at end the
     string decomoposition works
     */
    public List<Integer> findAllSubStrings(String s, List<String> wordList) {
        Map<String,Integer> wordToFrequencyCountMap = new HashMap<>();
        for(String word: wordList){
            if(wordToFrequencyCountMap.containsKey(word)){
                wordToFrequencyCountMap.put(word, wordToFrequencyCountMap.get(word)+1);
            }else
                wordToFrequencyCountMap.put(word,1);
        }
        List<Integer> result = new ArrayList<>();
        int unitSize = wordList.get(0).length();
        for(int i = 0 ; i + unitSize * wordList.size() <= s.length() ; i++ ){
            if(matchallWordsInDict(s,wordToFrequencyCountMap,i,wordList.size(),unitSize)){
                result.add(i);
            }
        }
        return result;
    }
    public boolean matchallWordsInDict(String s, Map<String,Integer> wordToFreq, int start, int numOfWords, int unitSize) {
        Map<String,Integer> wordToFrequencyCountMapLocal = new HashMap<>();
        for(int i = start; i < numOfWords; i++){
            String currentWord = s.substring(start+i*unitSize,start+(i+1)*unitSize);
            Integer currentWordFreq = wordToFreq.get(currentWord);
            if(currentWordFreq == null)
                return false;
            increment(currentWord,wordToFrequencyCountMapLocal);
            if(wordToFrequencyCountMapLocal.get(currentWord) > currentWordFreq)
                return false;
        }
        return true;
    }
    public void increment(String word, Map<String,Integer> dict){
        Integer count = dict.get(word);
        if(count == null){
            count = 0;
        }
        count++;
        dict.put(word,count );
    }


    public boolean matchallWordsInDict2(String s, Map<String,Integer> wordToFreq, int start, int numWords, int unitSize){
        Map<String,Integer> currStringToFreq = new HashMap<String, Integer>();
        for (int i = 0 ; i < numWords ;i++){
            String currWord = s.substring(start + i * unitSize, start+(i+1)*unitSize);
            Integer freq = wordToFreq.get(currWord);
            if(freq == null)
                return false;

            increment(currWord, currStringToFreq);
            if(currStringToFreq.get(currWord) > freq){
                return false;
            }
        }
        return true;
    }



    public Map<String,Integer> countWordFrequency(List<String> wordList){
        Map<String,Integer> wordToFrequencyMap = new HashMap<String, Integer>();
        for(String word:wordList){

            if(wordToFrequencyMap.containsKey(word)){
                int currentFrequency = wordToFrequencyMap.get(word);
                wordToFrequencyMap.put(word,currentFrequency+1);
            }else {
                wordToFrequencyMap.put(word,1);
            }
        }
        return wordToFrequencyMap;
    }
}
