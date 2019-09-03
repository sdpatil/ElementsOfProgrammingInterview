package com.leetcode;

public class Problem69 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int answer = 0;
        int startIndex = 1;
        int endIndex = x;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if ( middleIndex <= x / middleIndex ) {
                answer = middleIndex;
                startIndex = middleIndex + 1;
            } else
                endIndex = middleIndex - 1;
        }
        return answer;
    }

}
