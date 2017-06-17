package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/2/17.
 */
public class KnapsackProblemTest {
    KnapsackProblem knapsackProblem;

    @Before
    public void setup(){
        knapsackProblem = new KnapsackProblem();
    }

    @Test
    public void simpleTest(){
        List<KnapsackProblem.Item> itemList = Arrays.asList(
                new KnapsackProblem.Item(2,30),
                new KnapsackProblem.Item(3,50),
                new KnapsackProblem.Item(4,70),
                new KnapsackProblem.Item(5,60)
        );

        int value = knapsackProblem.optimumSubjectToCapacity(itemList,5);
        System.out.println("Value of the result " + value);
        assert value == 80;
    }

    @Test
    public void complexTest(){
        List<KnapsackProblem.Item> itemList = Arrays.asList(
                new KnapsackProblem.Item(4,22),
                new KnapsackProblem.Item(2,20),
                new KnapsackProblem.Item(3,15),
                new KnapsackProblem.Item(5,30),
                new KnapsackProblem.Item(5,24),
                new KnapsackProblem.Item(6,54),
                new KnapsackProblem.Item(9,21),
                new KnapsackProblem.Item(7,32),
                new KnapsackProblem.Item(8,18),
                new KnapsackProblem.Item(10,25)
        );

        int value = knapsackProblem.optimumSubjectToCapacity(itemList,30);
        System.out.println("Value of result " + value);
        assert value ==182;
    }
}
