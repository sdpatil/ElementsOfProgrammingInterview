package com.eip.chapter11;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class MedianOfOnlineDataTest {
    MedianOfOnlineData medianOfOnlineData;

    @Before
    public void setup(){
        medianOfOnlineData = new MedianOfOnlineData();
    }

    @Test
    public void simpleTest(){
        List<Integer> inputList = Arrays.asList(1,0,3,5,2,0,1);
        medianOfOnlineData.onlineMedian(inputList.iterator());
    }
}
