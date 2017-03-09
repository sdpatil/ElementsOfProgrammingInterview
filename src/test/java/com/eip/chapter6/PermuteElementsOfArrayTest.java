package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class PermuteElementsOfArrayTest {
    PermuteElementsOfArray permuteElementsOfArray;

    @Before
    public void setup() {
        permuteElementsOfArray = new PermuteElementsOfArray();
    }

    @Test
    public void simpleTest() {
        List<Integer> perm = Arrays.asList(2, 0, 1, 3);
        List<Character> A = Arrays.asList('a', 'b', 'c', 'd');
        permuteElementsOfArray.applyPermutations(perm, A);

        assert A.get(0) == 'b';
        assert A.get(1) == 'c';
        assert A.get(2) == 'a';
        assert A.get(3) == 'd';
    }
}
