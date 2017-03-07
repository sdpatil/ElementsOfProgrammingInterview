package com.algdesignmanual.chapter8;

import java.util.Arrays;

/**
 * Created by sunilpatil on 3/3/17.
 */
public class Binomial {
    public static void main(String[] argv){
        Binomial binomial = new Binomial();

        System.out.println(binomial.binomialCrud(6,2));

        System.out.println(binomial.pascals(6,2));
    }

    /**
     * n!/((n−k)!k!)
     * @param n
     * @return
     */
    public int binomialCrud(int n, int k){
        int mFact =  factorial(n);
        int nkFact = factorial(n-k);
        int kFact = factorial(k);
        System.out.printf("mFact -> %d nkFact -> %d kFact -> %d \n",mFact,nkFact,kFact);
        return (mFact/(nkFact*kFact));
    }

    public int factorial(int n){
        if(n <= 1)
            return 1;
        int result = n* factorial(n-1);
        return result;
    }

    public int pascals(int n,int m){
        int[][] pascals = new int[n+1][n+1];
        pascals[0][0] =1;
        pascals[1][0] =1;
        pascals[1][1] =1;
        printTwoDArray(pascals);
        for(int i = 2; i<=n; i++){
            pascals[i][0] =1;
            pascals[i][i] =1;
            for(int j = 1; j < i; j++)
                pascals[i][j] = pascals[i-1][j-1] + pascals[i-1][j];
            printTwoDArray(pascals);
        }

        return pascals[n][m];
    }

    private void printTwoDArray(int[][] A){
        System.out.println("***********");
        for(int[] a: A)
            System.out.println(Arrays.toString(a));
    }
}
