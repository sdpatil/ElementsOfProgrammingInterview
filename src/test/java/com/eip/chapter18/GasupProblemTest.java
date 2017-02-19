package com.eip.chapter18;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class GasupProblemTest {
    GasupProblem gasupProblem;

    @Before
    public void setup(){
        gasupProblem = new GasupProblem();
    }

    @Test
    public void simpleTest(){
        List<Integer> gallonsList = Arrays.asList(50,20,5,30,25,10,10);
        List<Integer> distanceList = Arrays.asList(900,600,200,400,600,200,100);
        System.out.println(gasupProblem.findAmpleCity(gallonsList,distanceList));
    }
}
