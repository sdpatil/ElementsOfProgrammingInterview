package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 6/16/17.
 */
public class GeneratePrime {
    /*
        First create a binary array of 1 to n everything set to true. Then for first  0 and 1 mark them
        as non prime. After that check first value in the boolean array which is 2 mark all its multiples
        false, After that loop pick next number to see if its prime if yes mark all its prime to false,..
     */
    public static List<Integer> generatePrimes(int n){
        List<Integer> primes = new ArrayList<>();
        List<Boolean> isPrime = new ArrayList(Collections.nCopies(n+1,true));
        isPrime.set(0,false);
        isPrime.set(1,false);
        for(int i = 2; i <= n ; i++){
            if(isPrime.get(i)){
                primes.add(i);
                for(int j = i; j <=n ; j= j+i){
                    isPrime.set(j,false);
                }
            }
        }
        return primes;
    }

    public static void main(String[] argv){
        System.out.println(generatePrimes(10));
    }
}
