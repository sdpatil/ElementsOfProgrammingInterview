package com.eip.chapter14;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/27/17.
 */
public class IntersectTwoSortedArraysTest {
    IntersectTwoSortedArrays intersectTwoSortedArrays;

    @Before
    public void setup() {
        intersectTwoSortedArrays = new IntersectTwoSortedArrays();
    }

    @Test
    public void simpleTest() {
        List<Integer> firstList = Arrays.asList(2, 3, 3, 5, 5, 6, 7, 7, 8, 12);
        List<Integer> secondList = Arrays.asList(5, 5, 6, 8, 8, 9, 10, 10);

        List<Integer> result = intersectTwoSortedArrays.intersectTwoSortedArrays(firstList, secondList);

        System.out.println("Value of result " + result);
        assert result.size() == 3;
        assert result.get(0) == 5;
        assert result.get(1) == 6;
        assert result.get(2) == 8;
    }
}
