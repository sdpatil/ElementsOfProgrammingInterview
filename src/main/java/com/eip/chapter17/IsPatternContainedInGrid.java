package com.eip.chapter17;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by sunilpatil on 4/4/17.
 */
public class IsPatternContainedInGrid {

    static class Attempt {
        int x;
        int y;
        int offset;

        public Attempt(int x, int y, int offset) {
            this.x = x;
            this.y = y;
            this.offset = offset;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Attempt attempt = (Attempt) o;

            if (x != attempt.x) return false;
            if (y != attempt.y) return false;
            return offset == attempt.offset;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            result = 31 * result + offset;
            return result;
        }
    }

    public boolean isPatternContainedInGrid(List<List<Integer>> grid,
                                            List<Integer> pattern) {
        Set<Attempt> previousAttempt = new HashSet<>();
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).size(); j++) {
                if(isPatternSuffixContainedStartingAtX(i,j,0,grid,pattern,previousAttempt))
                    return true;
            }
        }
        return false;
    }

    private boolean isPatternSuffixContainedStartingAtX(int x, int y, int offset, List<List<Integer>> grid,
                                                        List<Integer> pattern, Set<Attempt> previousAttempts) {
        if (offset == pattern.size()) {
            return true;
        }

        if (x < 0 || x >= grid.size() || y < 0 || y >= grid.get(0).size() || previousAttempts.contains(new Attempt(x, y, offset))) {
            return false;
        }

        if (grid.get(x).get(y).equals(pattern.get(offset))) {
            if (isPatternSuffixContainedStartingAtX(x - 1, y, offset + 1, grid, pattern, previousAttempts))
                return true;
            if (isPatternSuffixContainedStartingAtX(x + 1, y, offset + 1, grid, pattern, previousAttempts))
                return true;
            if (isPatternSuffixContainedStartingAtX(x, y - 1, offset + 1, grid, pattern, previousAttempts))
                return true;
            if (isPatternSuffixContainedStartingAtX(x, y + 1, offset + 1, grid, pattern, previousAttempts))
                return true;

        }
        previousAttempts.add(new Attempt(x, y, offset));
        return false;
    }
}
