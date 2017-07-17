package com.eip.chapter18;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/12/17.
 */
public class ScheduleToMinimizeWaitingTime {

    /*
        Problem: Given set of time it takes to complete a task, figure out how you would schedule them to minimize
        waiting time
        Solution: Sort the queries so that the query with minimum time comes first then keep a running count of number
        of queries left * the time to execute current query
     */
    public int minimumTotalWaitingTime(List<Integer> serviceTimes) {
        //sort all the queries
        Collections.sort(serviceTimes);
        int waitingTime = 0;
        for (int i = 0; i < serviceTimes.size() - 1; i++) {
            //How many queries are left
            int numRemainingQueries = serviceTimes.size() - (i + 1);
            // How many queries left * time to execute current query to get delay added to the queries left
            waitingTime = waitingTime + (serviceTimes.get(i) * numRemainingQueries);
        }
        return waitingTime;
    }
}
