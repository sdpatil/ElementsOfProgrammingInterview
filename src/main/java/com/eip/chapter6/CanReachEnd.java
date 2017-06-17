package com.eip.chapter6;

import java.util.List;

/**
 * Created by sunilpatil on 3/6/17.
 */
public class CanReachEnd {

    /**
     * Check if you can reach to the end of the array by either moving further n steps
     * @param maxAdvanceSteps
     * @return
     */
    public boolean canReachEnd(List<Integer> maxAdvanceSteps){
        int furthestReachSoFar = 0;

        int lastIndex = maxAdvanceSteps.size()-1;

        // At every step check if i could reach this far using furthestReachSoFar < lastIndex. If yes check
        // if adding current step would take me further than what i have seen so far, if yes remember the max
        // i could reach
        for(int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastIndex; i++){
            int advanceTo = i + maxAdvanceSteps.get(i);
            furthestReachSoFar = Math.max(furthestReachSoFar, advanceTo);
        }

        return furthestReachSoFar >= lastIndex;
    }
}
