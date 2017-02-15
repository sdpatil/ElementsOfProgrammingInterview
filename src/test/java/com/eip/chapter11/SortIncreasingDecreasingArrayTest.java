package com.eip.chapter11;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class SortIncreasingDecreasingArrayTest {
    SortIncreasingDecreasingArray sortIncreasingDecreasingArray;

    @Before
    public void setup(){
        sortIncreasingDecreasingArray = new SortIncreasingDecreasingArray();
    }

    @Test
    public void simpleTest(){
        List<Integer> inputList = Arrays.asList(57,131,493,294,221,339,418,452,442,190);
        System.out.println(inputList);
        List<Integer> returnList = sortIncreasingDecreasingArray.sortKIncreasingDecreasingArray(inputList);
        System.out.println(returnList);
    }

}
