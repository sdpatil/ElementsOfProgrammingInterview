package com.eip.chapter6;

import java.util.List;

/**
 * Created by sunilpatil on 3/6/17.
 */
public class CanReachEnd {

    public boolean canReachEnd(List<Integer> maxAdvanceSteps){
        int furthestReachSoFar = 0;

        int lastIndex = maxAdvanceSteps.size()-1;
        for(int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastIndex; i++){
            int advanceTo = i + maxAdvanceSteps.get(i);
            furthestReachSoFar = Math.max(furthestReachSoFar, advanceTo);
        }

        return furthestReachSoFar >= lastIndex;
    }
}
