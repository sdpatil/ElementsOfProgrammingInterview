package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

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
    public void simpleTest(){
        List<List<Integer>> placments = placmentOfQueens.nQueens(4);
        System.out.println(placments);
    }
}
