package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class SampleOfflineDataTest {
    SampleOfflineData sampleOfflineData;

    @Before
    public void setup() {
        sampleOfflineData = new SampleOfflineData();
    }

    @Test
    public void simpleTest() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10);
        System.out.println("Input " + input);
        sampleOfflineData.randomSample(3, input);
        System.out.println("output " + input);

    }

    @Test
    public void sampleMoreThanHalfSize() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10);
        System.out.println("Input " + input);
        sampleOfflineData.randomSampleRemove(7, input);
        System.out.println("output " + input);

    }
}
