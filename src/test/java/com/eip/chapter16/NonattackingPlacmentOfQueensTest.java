package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/22/17.
 */
public class NonattackingPlacmentOfQueensTest {
    NonattackingPlacmentOfQueens placmentOfQueens;

    @Before
    public void setup(){
        placmentOfQueens = new NonattackingPlacmentOfQueens();
    }

    @Test
    public void simple4QueensTest(){
        List<List<Integer>> placments = placmentOfQueens.nQueens(4);
        System.out.println(placments);
        assert placments.size() ==2;
        assert   placments.get(0).equals(Arrays.asList(1,3,0,2));
        assert   placments.get(1).equals(Arrays.asList(2,0,3,1));
    }

    @Test
    public void simple5QueensTest(){
        List<List<Integer>> placments = placmentOfQueens.nQueens(5);
        System.out.println(placments);
        assert placments.size() ==10;

    }
}
