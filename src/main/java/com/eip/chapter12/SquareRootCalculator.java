package com.eip.chapter12;

/**
 * Created by sunilpatil on 2/21/17.
 */
public class SquareRootCalculator {
    public int squareRoot(int k) {
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
}
