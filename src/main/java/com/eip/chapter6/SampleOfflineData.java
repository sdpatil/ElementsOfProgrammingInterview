package com.eip.chapter6;

        import java.util.Collections;
        import java.util.List;
        import java.util.Random;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class SampleOfflineData {

    /**
     * We are given set of records and we have select k randomly
     * @param k
     * @param A
     */
    public void randomSample(int k, List<Integer> A){
        /*
        Generate one random number from 0 to A.length, move record at that index to 0th position
        Then generate second number 0 to A.length-1 move it to 1st position,..
         */
        Random random = new Random();
        for(int i = 0 ; i < k ; i++){
            int index = random.nextInt(A.size()-i);
            Collections.swap(A,i,index);
        }
    }

}
