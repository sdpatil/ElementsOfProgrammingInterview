package com.eip.chapter15;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/29/17.
 */
public class BuildMinHeightBSTFromSortedArrayTest {
    BuildMinHeightBSTFromSortedArray buildMinHeightBSTFromSortedArray;

    @Before
    public void setup(){
        buildMinHeightBSTFromSortedArray = new BuildMinHeightBSTFromSortedArray();
    }

    @Test
    public void simpleTest(){
        List<Integer> A = Arrays.asList(2,3,5,7,11,13,17,19,23);
        BSTNode<Integer> root = buildMinHeightBSTFromSortedArray.buildMinHeightBSTFromSortedArray(A);
        System.out.println(root);

    }
}
