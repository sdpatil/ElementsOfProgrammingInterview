package com.eip.chapter17;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class NumberOfMovesToClimbStairs {
    public int numberOfWaysToTop(int top, int maximumStep){
        return computeNumberOfWaysToH(top,maximumStep,new int[top+1]);
    }

    private int computeNumberOfWaysToH(int n, int maximumSteps, int[] numberOfWays){
        if(n <=1)
            return 1;

        if(numberOfWays[n] ==0){
            for(int i = 1; i <= maximumSteps && n-i >=0;++i){
                numberOfWays[n] += computeNumberOfWaysToH(n-i, maximumSteps,numberOfWays);
            }
        }
        return numberOfWays[n];
    }

    public int computeNumberOfWays(int n, int maximumSteps){
        if(n < 0 || maximumSteps <=0)
            return 0;

        if(n==0)
            return 1;

        return computeNumberOfWays(n,maximumSteps-1) + computeNumberOfWays(n-1,maximumSteps);
    }

    /*
    You are climbing a stair case. It takes n steps to reach to the top.Each time you can either climb 1 or 2 steps.
    In how many distinct ways can you climb to the top?

     Basic idea is that clibm stairs is very similar
     */
    public int climbStairs(int n) {
        int first = 0;
        int second = 1;
        int temp = 0;
        System.out.print(first +" " + second +" ");
        for(int i = 0 ; i < n -2 ; i++ ){
            temp = first+second;
            System.out.print(temp +" ");
            first = second;
            second = temp;
        }
        return temp;
    }


}
