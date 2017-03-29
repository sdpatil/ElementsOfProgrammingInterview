package com.eip.chapter16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/20/17.
 */
public class GeneratePermutation {

    public List<List<Integer>> generatePermutation(List<Integer> A){
        List<List<Integer>> result = new ArrayList();
        directPermutation(0,A,result);
        return result;
    }

    public void directPermutation(int i, List<Integer> A, List<List<Integer>> result){
        if(i == A.size()-1){
            result.add(new ArrayList(A));
            return;
        }

        for(int j = i; j < A.size();++j ){
            Collections.swap(A,i,j);
            directPermutation(i+1,A,result);
            Collections.swap(A,i,j);
        }

    }
}
