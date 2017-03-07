package com.eip.chapter6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/6/17.
 */
public class AllPrimesToNumber {
    public List<Integer> generatePrimes(int n){
        List<Integer> primeList = new ArrayList<Integer>();
        List<Boolean> isPrime = new ArrayList<Boolean>(Collections.nCopies(n+1,true));
        isPrime.set(0,false);
        isPrime.set(1,false);

        for(int i = 2; i < n ;i++){
            if(isPrime.get(i)){
                primeList.add(i);
                for(int j = i; j < n ; j = j+i)
                    isPrime.set(j,false);
            }
        }

        return primeList;
    }
}
