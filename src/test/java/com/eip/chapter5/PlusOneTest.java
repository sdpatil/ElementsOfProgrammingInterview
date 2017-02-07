package com.eip.chapter5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class PlusOneTest {
    PlusOne plusOne;

    @Before
    public void setup(){
        plusOne = new PlusOne();
    }
    @Test
    public void testSimple(){
        List<Integer> input = new ArrayList();
        input.add(1);
        input.add(2);
        input.add(3);

        List<Integer> output = plusOne.plusOne(input);
        System.out.println("Output " + output);
        List<Integer> outputT = new ArrayList();
        outputT.add(1);
        outputT.add(2);
        outputT.add(4);

        assert output.equals(outputT);
    }

    @Test
    public void test9InLastDigit(){
        List<Integer> input = new ArrayList();
        input.add(1);
        input.add(2);
        input.add(9);

        List<Integer> output = plusOne.plusOne(input);
        System.out.println("Output " + output);

        List<Integer> outputT = new ArrayList();
        outputT.add(1);
        outputT.add(3);
        outputT.add(0);

        assert output.equals(outputT);
    }

    @Test
    public void testAllNines(){
        List<Integer> input = new ArrayList();
        input.add(9);
        input.add(9);
        input.add(9);

        List<Integer> output = plusOne.plusOne(input);
        System.out.println("Output " + output);

        List<Integer> outputT = new ArrayList();
        outputT.add(1);
        outputT.add(0);
        outputT.add(0);
        outputT.add(0);

        assert output.equals(outputT);
    }
}
