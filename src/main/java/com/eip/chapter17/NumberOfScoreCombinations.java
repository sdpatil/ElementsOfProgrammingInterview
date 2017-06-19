package com.eip.chapter17;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/25/17.
 */
public class NumberOfScoreCombinations {

    /**
     * Basic question is if you have three plays {1,2,3} how many ways you can combine them to make total score of 5.
     * create a dp table with rows equal to number of individual score and columns equal to total score,
     * Then for every column check if
     * [1, 0, 0, 0, 0, 0]
     [1, 1, 1, 1, 1, 1]
     [1, 1, 2, 2, 3, 3]
     [1, 1, 2, 3, 4, 5]
     *
     */
    public int numOfCombinationsForFinalScore(int finalScore, int[] indivdiualPlayScore) {
        int[][] dpTable = new int[indivdiualPlayScore.length+1][finalScore+1];
        for(int i = 0 ; i < dpTable.length; i++ )
            dpTable[i][0] =1;

        for(int row = 1 ; row < dpTable.length ; row++){
            for(int column = 1; column < dpTable[0].length ; column++){
                //If the current play is less than score then you cant use it
                if(column < indivdiualPlayScore[row-1])
                    dpTable[row][column] = dpTable[row-1][column];
                else{
                    // If the current play score is less than total then total number of combinations is number of
                    //combinations without this play plus number of combinations
                    dpTable[row][column] = dpTable[row-1][column] +
                            dpTable[row][column-indivdiualPlayScore[row-1]];
                }
            }
        }
        printDPTable(dpTable);
        return dpTable[indivdiualPlayScore.length][finalScore];
    }

    private void printDPTable(int[][] dpTable){
        for(int[] dpRow: dpTable)
            System.out.println(Arrays.toString(dpRow));
    }
        public int numOfCombinationsForFinalScore2(int finalScore, int[] indivdiualPlayScore) {
        int[][] numCombinationsForScore = new int[indivdiualPlayScore.length][finalScore + 1];
        for (int i = 0; i < indivdiualPlayScore.length; i++) {
            numCombinationsForScore[i][0] = 1;
            for (int j = 1; j <= finalScore; ++j) {
                int withoutThisPlay = 0;
                if (i-1 >= 0) {
                    withoutThisPlay = numCombinationsForScore[i - 1][j];
                }
                int withThisPlay = 0;
                if (j >= indivdiualPlayScore[i])
                    withThisPlay = numCombinationsForScore[i][j - indivdiualPlayScore[i]];
                numCombinationsForScore[i][j] = withThisPlay + withoutThisPlay;
            }
        }
        return numCombinationsForScore[indivdiualPlayScore.length - 1][finalScore];
    }
}
