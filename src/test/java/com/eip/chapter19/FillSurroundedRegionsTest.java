package com.eip.chapter19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class FillSurroundedRegionsTest {
    FillSurroundedRegions problem = new FillSurroundedRegions();

    @Test
    public void simpleTest(){
        List<List<Character>> board = new ArrayList<>();
        board.add(Arrays.asList('B','B','B','B'));
        board.add(Arrays.asList('W','B','W','B'));
        board.add(Arrays.asList('B','W','W','B'));
        board.add(Arrays.asList('B','B','B','B'));

        for(List<Character> row: board)
            System.out.println(row);

        problem.fillSurroundedRegions(board);
        System.out.println();
        for(List<Character> row: board)
            System.out.println(row);
    }

    @Test
    public void simple2Test(){
        List<List<Character>> board = new ArrayList<>();
        board.add(Arrays.asList('B','B','B','B'));
        board.add(Arrays.asList('B','W','W','B'));
        board.add(Arrays.asList('B','W','W','B'));
        board.add(Arrays.asList('B','W','B','B'));

        for(List<Character> row: board)
            System.out.println(row);

        problem.fillSurroundedRegions(board);
        System.out.println();
        for(List<Character> row: board)
            System.out.println(row);
    }
}
