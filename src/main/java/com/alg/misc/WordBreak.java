package com.alg.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by sunilpatil on 3/24/17.
 */
public class WordBreak {

    public List<String> wordBreak(String s, HashSet<String> hs){
        List<String> result =new ArrayList<String>();
        wordBreak(0,result,s,hs);
        return result;
    }

    public List<String> wordBreak( int k, List<String> wordList,String s, HashSet<String > hs){
        if(k == s.length()-1){
            return wordList;
        }
        boolean found = false;
        for(int j = s.length(); j > k; j--){
            String word = s.substring(k,j);
            if(hs.contains(word)){
                found = true;
                wordList.add(word);
                wordBreak( j,wordList,s,hs);
            }
        }
        if(found == false)
            return null;
        else
            return wordList;
    }
}
