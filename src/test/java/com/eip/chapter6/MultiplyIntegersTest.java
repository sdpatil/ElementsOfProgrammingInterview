package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class MultiplyIntegersTest {
    MultiplyIntegers multiplyIntegers;

    @Before
    public void setup() {
        multiplyIntegers = new MultiplyIntegers();
    }

    @Test
    public void twoDigitMultiplicationTest() {
        List<Integer> num1 = Arrays.asList(3, 4);
        List<Integer> num2 = Arrays.asList(1, 2);

        List<Integer> result = multiplyIntegers.multiply(num1, num2);
        System.out.println(result);
        assert result.size() == 3;
        assert result.get(0) == 4;
        assert result.get(1) == 1;
        assert result.get(2) == 8;


    }
}
