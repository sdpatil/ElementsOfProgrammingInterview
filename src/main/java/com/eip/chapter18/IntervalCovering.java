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

    public List<Integer> findMinimumVisits(List<Interval> intervalList){
        if(intervalList.isEmpty())
            return Collections.EMPTY_LIST;

        System.out.println("Before sorting " + intervalList);

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

        System.out.println("After sorting " + intervalList);

        return visitTimes;
    }

}
