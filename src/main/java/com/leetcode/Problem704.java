package com.leetcode;

public class Problem704 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (nums[middleIndex] == target)
                return middleIndex;
            else if (nums[middleIndex] < target)
                startIndex = middleIndex + 1;
            else
                endIndex = middleIndex - 1;
        }
        return -1;
    }


}
