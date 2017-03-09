package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class SampleOnlineDataTest {
    SampleOnlineData sampleOnlineData;

    @Before
    public void setup(){
        sampleOnlineData = new SampleOnlineData();
    }

    @Test
    public void simpleTest(){
        List<Integer> packetList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> randomPacketList = sampleOnlineData.onlineRandomSample(packetList.iterator(),3);
        System.out.println(randomPacketList);
    }
}
