package com.eip.chapter14;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class MergeTwoSortedArraysTest {
    MergeTwoSortedArrays mergeTwoSortedArrays;

    @Before
    public void setup(){
        mergeTwoSortedArrays = new MergeTwoSortedArrays();
    }

    @Test
    public void simpleTest(){
       int[] first = new int[]{5,13,17,0,0,0,0,0};
       int[] second = new int[]{3,7,11,19};

       mergeTwoSortedArrays.mergeTwoSortedArrays(first,3,second,4);

       System.out.println("Merged Array " + Arrays.toString(first));
    }
}
