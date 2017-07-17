package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 4/2/17.
 */
public class SudokuSolverTest {
    SudokuSolver sudokuSolver;

    @Before
    public void setup() {
        sudokuSolver = new SudokuSolver();
    }

    @Test
    public void simpleTest() {
       List<List<Integer>> puzzle = new ArrayList<>();
       puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        puzzle.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));



        sudokuSolver.solveSudoku(puzzle);

        System.out.println("**********");
        for (List<Integer> row : puzzle)
            System.out.println(row);
    }
/*
    @Test
    public void simpleTest() {
        int[][] puzzle = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}

        };
        for (int[] row : puzzle)
            System.out.println(Arrays.toString(row));
        sudokuSolver.solveSudoku(puzzle);

        System.out.println("**********");
        for (int[] row : puzzle)
            System.out.println(Arrays.toString(row));
    }

    @Test
    public void simpleTest2() {
        int[][] puzzle = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        for (int[] row : puzzle)
            System.out.println(Arrays.toString(row));
        sudokuSolver.solve(puzzle);

        System.out.println("**********");
        for (int[] row : puzzle)
            System.out.println(Arrays.toString(row));
    }*/
}
