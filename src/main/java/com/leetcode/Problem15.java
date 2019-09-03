package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i + 1]) {
                int target = -1 * nums[i];
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    if (nums[start] + nums[end] == target) {
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1])
                            start++;
                        while (start < end && nums[end] == nums[end - 1])
                            end--;
                        start++;
                        end--;
                    } else if (nums[start] + nums[end] > target) {
                        end--;
                    } else {
                        start++;
                    }

                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2; i++){
            //Skip duplicates of the first element
            if(i == 0 || (nums[i] != nums[i+1])) {
                int j = i + 1;
                int k = nums.length - 1;
                int target = -1 * nums[i];
                while (j < k) {
                    if (nums[j] + nums[k] == target){
                        result.add(Arrays.asList(i,j,k));
                        while (j < k && nums[j] == nums[j+1])
                            j++;
                        while (j < k && nums[k] == nums[k-1])
                            k--;
                        j++;
                        k--;
                    }else if(nums[j] + nums[k] > target) {
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
