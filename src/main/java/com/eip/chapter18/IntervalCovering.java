package com.eip.chapter18;

import java.util.*;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class IntervalCovering {
    public static class Interval{
        int left, right;
        public Interval(int left, int right) {
            this.left = left;
            this.right = right;
        }
        @Override
        public String toString() {
            return "Interval{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
    /*
    Problem: Given list of intervals figure out lowest number of visit times that covers all the tasks
    Solution : First sort all the intervals based on right end point. Then add first intervral's right
    time as the first visit time, skip every interval which overlaps that visit time till you find interval
    which does not and add it to visit list
     */
    public List<Integer> findMinimumVisits(List<Interval> intervalList) {
        if(intervalList.isEmpty())
            return Collections.EMPTY_LIST;

        Collections.sort(intervalList, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.right, o2.right);
            }
        });
        int i = 0;
        List<Integer> result = new ArrayList<>();
        int visitTime = intervalList.get(i).right;
        result.add(visitTime);
        for(Interval currentInterval: intervalList){
            if(visitTime < currentInterval.left){
                visitTime = currentInterval.right;
                result.add(visitTime);
            }
        }
        return result;
    }

    /*
    public List<Integer> findMinimumVisits(List<Interval> intervalList){
        if(intervalList.isEmpty())
            return Collections.EMPTY_LIST;


        Collections.sort(intervalList, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.right, o2.right);
            }
        });

        List<Integer> visitTimes = new ArrayList<Integer>();

        Integer visitTime = intervalList.get(0).right;
        visitTimes.add(visitTime);
        for(Interval interval: intervalList){
            if(interval.left >visitTime ){
                visitTime = interval.right;
                visitTimes.add(visitTime);
            }
        }
        return visitTimes;
    }*/

}
