package com.eip.chapter18;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/12/17.
 */
public class ScheduleToMinimizeWaitingTimeTest {
    ScheduleToMinimizeWaitingTime scheduleToMinimizeWaitingTime;

    @Before
    public void setup(){
        scheduleToMinimizeWaitingTime = new ScheduleToMinimizeWaitingTime();
    }

    @Test
    public void simpleTest(){
        List<Integer> taskList = Arrays.asList(2,5,1,3);

        assert scheduleToMinimizeWaitingTime.minimumTotalWaitingTime(taskList) ==10;
    }
}
