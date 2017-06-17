package com.eip.chapter6;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class SampleOfflineData {

    public void randomSample(int k, List<Integer> A){
        Random random = new Random();
        for(int i = 0 ; i < k ; i++){
            int index = random.nextInt(A.size()-i);
            Collections.swap(A,i,index);
        }
    }

}
