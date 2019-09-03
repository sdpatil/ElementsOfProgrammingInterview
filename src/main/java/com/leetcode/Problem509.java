package com.leetcode;

public class Problem509 {
    public int fibSimple(int N) {
        if (N <= 1)
            return N;
        return fib(N - 1) + fib(N - 2);
    }

    public int fib(int N) {
        if (N <= 1)
            return N;
        return memorization(N);
    }

    public int memorization(int N){
        int[] memorize = new int[N+1];
        memorize[1] = 1;
        for(int i =2 ; i <= N ; i++ ){
            memorize[i] = memorize[i-1] + memorize[i-2];
        }
        return memorize[N];
    }
}
