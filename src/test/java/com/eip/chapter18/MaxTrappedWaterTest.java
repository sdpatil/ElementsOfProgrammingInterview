package com.eip.chapter18;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class MaxTrappedWaterTest {
    MaxTrappedWater maxTrappedWater = null;

    @Before
    public void setup(){
        maxTrappedWater = new MaxTrappedWater();
    }

    @Test
    public void simpleTest(){
        List<Integer> heights = Arrays.asList(1,2,1,3,4,4,5,6,2,1,3,1,3,2,1,2,4,1);
        int maxWater = maxTrappedWater.getMaxTrappedWater(heights);
        System.out.println("Max trapped water " + maxWater);

    }
}
