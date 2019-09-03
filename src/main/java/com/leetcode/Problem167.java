package com.leetcode;

import java.util.Arrays;

public class Problem167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int secondIndex = Arrays.binarySearch(numbers,
                    i + 1,
                    numbers.length,
                    target - numbers[i]);
            if (secondIndex > 0) {
                return new int[]{i + 1, secondIndex + 1};
            }
        }
        throw new IllegalArgumentException("No second index found");
    }
}
