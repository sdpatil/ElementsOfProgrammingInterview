package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class GenerateAllSubsetsOfSizeKTest {
    GenerateAllSubsetsOfSizeK generateAllSubsetsOfSizeK;

    @Before
    public void setup(){
        generateAllSubsetsOfSizeK = new GenerateAllSubsetsOfSizeK();
    }

    @Test
    public void simpleTest(){
       List<List<Integer>> resultList = generateAllSubsetsOfSizeK.combination(5,2);
       for(List<Integer> result:resultList)
           System.out.println(result);

       assert resultList.size() == 10;
    }

    @Test
    public void simple2Test(){
        List<List<Integer>> resultList = generateAllSubsetsOfSizeK.combination(5,3);
        for(List<Integer> result:resultList)
            System.out.println(result);

        assert resultList.size() == 10;
    }
}
