package com.eip.chapter17;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/25/17.
 */
public class NumberOfScoreCombinations {

    public int numOfCombinationsForFinalScore(int finalScore, int[] indivdiualPlayScore) {
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
