package com.eip.chapter17;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Calculate fibonacci sequence number for given number n
 */
public class Fibonacci {
    private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

    //Basic brute force recursion
    public int fibonacciRecursive(int n){
        if(n <= 1)
            return n;
        else
            return fibonacciNonRecursive(n-1) + fibonacci(n-2);
    }

    //This is memorized version
    public int fibonacci(int n) {

        if (n <= 1)
            return n;
        else if (!cache.containsKey(n)) {
            cache.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        }
        return cache.get(n);
    }

    //This is DP solution for fibonacci number
    public int fibonacciNonRecursive(int n) {
        if (n <= 1)
            return n;
        int fMinus2 = 0;
        int fMinus1 = 1;
        int nextNumber = 0;
        for (int i = 2; i <= n; i++) {
            nextNumber = fMinus2 + fMinus1;
            fMinus2 = fMinus1;
            fMinus1 = nextNumber;
        }
        return nextNumber;
    }
}
