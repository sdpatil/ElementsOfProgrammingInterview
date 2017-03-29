package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class GenerateThePowerSetTest {
    GenerateThePowerSet generateThePowerSet;

    @Before
    public void setup(){
        generateThePowerSet = new GenerateThePowerSet();
    }

    @Test
    public void simpleTest(){
        List<Integer> inputList = Arrays.asList(0,1,2);
        List<List<Integer>> resultList = generateThePowerSet.generatePowerSet(inputList);
        System.out.println("Result list " + resultList);


    }

    @Test
    public void simple2Test(){
        List<Integer> inputList = Arrays.asList(0,0,1,2);
        List<List<Integer>> resultList = generateThePowerSet.generatePowerSet(inputList);
        System.out.println("Result list " + resultList);


    }
}
