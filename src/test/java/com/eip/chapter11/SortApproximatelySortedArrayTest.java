package com.eip.chapter11;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class SortApproximatelySortedArrayTest {
    SortApproximatelySortedArray sortApproximatelySortedArray;

    @Before
    public void setup(){
        sortApproximatelySortedArray =new SortApproximatelySortedArray();
    }

    @Test
    public void simpleTest(){
        List<Integer> sequence = Arrays.asList(3,-1,2,6,4,5,8);
        sortApproximatelySortedArray.sortApproximatelySortedData(sequence.iterator(),2);
    }
}
