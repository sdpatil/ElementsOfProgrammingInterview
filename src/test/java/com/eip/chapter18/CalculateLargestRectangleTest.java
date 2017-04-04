package com.eip.chapter18;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class CalculateLargestRectangleTest {
    CalculateLargestRectangle calculateLargestRectangle;

    @Before
    public void setup(){
        calculateLargestRectangle = new CalculateLargestRectangle();
    }

    @Test
    public void simpleTest(){
        List<Integer> heightsList = Arrays.asList(1,4,2,5,6,3,2,6,6,5,2,1,3);
        int rectangleSize = calculateLargestRectangle.calculateLargestRectangle(heightsList);
        System.out.println("Rectangle Size " + rectangleSize);
    }
}
