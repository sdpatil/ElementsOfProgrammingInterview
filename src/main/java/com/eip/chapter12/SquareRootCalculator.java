package com.eip.chapter12;

/**
 * Created by sunilpatil on 2/21/17.
 */
public class SquareRootCalculator {
    public int squareRoot2(int k) {
        int left = 0;
        int right = k;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            int midSquared = mid*mid;
            if (midSquared <= k) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return (int)left-1;
    }

    /**
     *  Problem is given a integer find largest integer whose square is less than or equal to k
     *  Ex. Given 16 return 4 or given 15 return 3
     *
     * Solution :- Basic idea is if square of a number x is less than k then no number less than  x would
     * be the answer same way if square of x is more than k then you can ignore all nubmbers more than x.
     * You can use binary search to solve this problem
     */
    public int squareRoot(int k) {
        if (k <= 1)
            return k;

        int start = 0;
        int end = k;
        int answer = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //Since we need to deal with approximation (Not exact match we dont have == condition in search
            if (mid <= k / mid) {
                start = mid + 1;
                answer = mid;
            } else
                end = mid - 1;
        }
        return answer;
    }
}
