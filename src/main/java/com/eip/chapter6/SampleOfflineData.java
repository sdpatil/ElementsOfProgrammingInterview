package com.eip.chapter6;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class SampleOfflineData {
    public void randomSampleBruteForce(int k, List<Integer> A){

        Random random = new Random();
        for(int i = 0 ; i < k ; i++){
            System.out.println(A.get(random.nextInt(A.size())));
        }
    }

    public void randomSample(int k, List<Integer> A){

        Random random = new Random();
        for(int i = 0 ; i < k ; i++){
            int index = random.nextInt(A.size()-i);
            Collections.swap(A,i,index);
        }

    }

    public void randomSampleRemove(int k, List<Integer> A){

        Random random = new Random();
        for(int i = 0 ; i < A.size()-k ; i++){
            int index = random.nextInt(A.size()-i);
            System.out.println("Moving index " + (A.size() - index+1) +" output " + A);
            Collections.swap(A,index,A.size()-index+1);
        }

    }
}
