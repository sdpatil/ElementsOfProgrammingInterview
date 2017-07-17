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


}
