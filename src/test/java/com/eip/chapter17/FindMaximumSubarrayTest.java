package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/24/17.
 */
public class FindMaximumSubarrayTest {
    FindMaximumSubarray findMaximumSubarray;

    @Before
    public void setup(){
        findMaximumSubarray = new FindMaximumSubarray();
    }

    @Test
    public void simpleTest(){
        List<Integer> numberList = Arrays.asList(904,40,523,12,-335,-385,-124,481,-31);
        assert findMaximumSubarray.findMaximumSubarrayDP(numberList) == 1479;
    }
}
