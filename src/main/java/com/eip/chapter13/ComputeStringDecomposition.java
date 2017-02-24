package com.eip.chapter13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class ComputeStringDecomposition {

    public List<Integer> findAllSubStrings(String s, List<String> wordList){
        Map<String,Integer> wordToFreq = new HashMap<String, Integer>();
        for(String word: wordList)
            increment(word,wordToFreq);

        int unitSize = wordList.get(0).length();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i + unitSize * wordList.size() <= s.length();++i){
            if(matchallWordsInDict(s,wordToFreq,i, wordList.size(),unitSize)){
                result.add(i);
            }
        }
        return result;
    }

    public boolean matchallWordsInDict(String s, Map<String,Integer> wordToFreq, int start, int numWords, int unitSize){
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


    public void increment(String word, Map<String,Integer> dict){
        Integer count = dict.get(word);
        if(count == null){
            count = 0;
        }
        count++;
        dict.put(word,count );
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
