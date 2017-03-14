package com.eip.chapter14;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/11/17.
 */
public class FindSalaryCapTest {
    FindSalaryCap findSalaryCap;

    @Before
    public void setup(){
        findSalaryCap = new FindSalaryCap();
    }

    @Test
    public void simpleTest(){
        List<Double> salaryList = Arrays.asList(90.0,30.0,100.0,40.0,20.0);

        double salaryCap = findSalaryCap.findSalaryCap(210,salaryList);

        System.out.println("Salary Cap " + salaryCap);
        assert salaryCap == 60;

    }
}
