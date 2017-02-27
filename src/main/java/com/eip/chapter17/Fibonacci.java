package com.eip.chapter17;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 2/24/17.
 */
public class Fibonacci {
    private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public int fibonacci(int n) {

        if (n <= 1)
            return n;
        else if (!cache.containsKey(n)) {
            cache.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        }
        return cache.get(n);
    }

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

    public int fibonacciRecursive(int n){
        if(n <= 1)
            return n;
        else
            return fibonacciNonRecursive(n-1) + fibonacci(n-2);
    }
}
