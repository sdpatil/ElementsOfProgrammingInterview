package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by sunilpatil on 6/16/17.
 */
public class ComputeRandomPermutation {
    public  List<Integer> computeRandomPermutation(int n){
        List<Integer> result = new ArrayList<>(n);
        for(int i = 0 ; i < n ; i++){
            result.add(i);
        }
        randomSample(n,result);

        return result;
    }

    public void randomSample(int k, List<Integer> A){
        Random random = new Random();
        for(int i = 0 ; i < k ; i++){
            int index = random.nextInt(A.size()-i);
            Collections.swap(A,i,index);
        }
    }

}
