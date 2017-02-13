package com.eip.chapter18;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/12/17.
 */
public class ScheduleToMinimizeWaitingTime {

    public int minimumTotalWaitingTime(List<Integer> serviceTimes){
        Collections.sort(serviceTimes);
        int waitingTime = 0;
        for(int i = 0; i < serviceTimes.size()-1;i++){
            int numRemainingQueries = serviceTimes.size()- (i+1);
            waitingTime = waitingTime + ( serviceTimes.get(i) * numRemainingQueries);
        }
        System.out.println("Waiting time " + waitingTime);
        return waitingTime;
    }
}
