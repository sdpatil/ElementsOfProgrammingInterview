package com.algdesignmanual.chapter8;

/**
 * Created by sunilpatil on 3/3/17.
 */
public class Fibonacci {
    public static void main(String[] argv){
        Fibonacci fibonacci = new Fibonacci();
       System.out.println(fibonacci.factorial(5));

    }

    public int fibonacci(int n){
        if(n<2)
            return n;
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] =1;

        for(int i = 2; i <= n; i++)
            fib[i] = fib[i-1] + fib[i-2];
        return fib[n];
    }

    public int fibonacci2(int n){
        if(n<2)
            return n;
        int back1 = 0;
        int back2 = 1;

        for(int i = 2; i <= n;i++){
            int newResult = back1+back2;
            back1 = back2;
            back2 = newResult;
        }
        return back1+back2;
    }

    public int factorial(int n){
        if(n <= 1)
            return 1;
        int result = n* factorial(n-1);
        return result;
    }


}
