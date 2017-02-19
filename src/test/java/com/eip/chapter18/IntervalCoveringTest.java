package com.eip.chapter18;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class IntervalCoveringTest {
    IntervalCovering intervalCovering;

    @Before
    public void setup(){
        intervalCovering = new IntervalCovering();
    }

    @Test
    public void simpleTest(){
        List<IntervalCovering.Interval> intervalList = new ArrayList<IntervalCovering.Interval>();
        intervalList.add(new IntervalCovering.Interval(1,2));
        intervalList.add(new IntervalCovering.Interval(2,3));
        intervalList.add(new IntervalCovering.Interval(3,4));
        intervalList.add(new IntervalCovering.Interval(2,3));
        intervalList.add(new IntervalCovering.Interval(3,4));
        intervalList.add(new IntervalCovering.Interval(4,5));

        List<Integer> visitTimeList = intervalCovering.findMinimumVisits(intervalList);
        System.out.println(visitTimeList);
        assert visitTimeList.size() == 2;
        assert visitTimeList.get(0) ==2;
        assert visitTimeList.get(1) ==4;

    }

    @Test
    public void simpleTest2(){
        List<IntervalCovering.Interval> intervalList = new ArrayList<IntervalCovering.Interval>();
        intervalList.add(new IntervalCovering.Interval(0,3));
        intervalList.add(new IntervalCovering.Interval(2,6));
        intervalList.add(new IntervalCovering.Interval(3,4));
        intervalList.add(new IntervalCovering.Interval(6,9));


        List<Integer> visitTimeList = intervalCovering.findMinimumVisits(intervalList);
        System.out.println(visitTimeList);
        assert visitTimeList.size() ==2;
        assert visitTimeList.get(0) == 3;
        assert visitTimeList.get(1) == 9;


    }
}
