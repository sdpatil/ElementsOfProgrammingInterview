package com.alg.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/24/17.
 */
public class GenerateNonAttackingBishops {
    static class Position{
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString() {
            return "Position{" +
                    "row=" + row +
                    ", col=" + col +
                    '}';
        }
    }

    public List<List<Position>> nonAttackingBishops(int n) {
        List<List<Position>> result = new ArrayList<>();
       // nonAttackingBishops(0,0,0,new ArrayList<>());
        return result;
    }

    public void nonAttackingBishops(int n, int row, int col, List<Integer> partialResults
            , List<List<Integer>> result) {

    }
}
