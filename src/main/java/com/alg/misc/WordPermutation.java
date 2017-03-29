package com.alg.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/24/17.
 */
public class WordPermutation {

    public List<String> permutation(String s){
        List<String> results = new ArrayList<>();
        permutation(s.toCharArray(),0, results);
        return results;
    }

    public void permutation(char[] c, int i, List<String> result){
        if(c.length -1 == i){
            result.add(new String(c));
        }

        for(int j = i ;j < c.length ; j++){
            swap(c,i,j);
            permutation(c,i+1,result);
            swap(c,i,j);
        }
    }

    private void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
