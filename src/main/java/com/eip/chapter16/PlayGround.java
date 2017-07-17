package com.eip.chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by spatil30 on 2/10/2017.
 */
public class PlayGround {

    public static void main(String[] argv) {
        int[] nums = {10,1,2,7,6,1,5};
        PlayGround playGround =new PlayGround();
        System.out.println(playGround.generateBalancedParen(2));
    }

    public List<List<Integer>> combinationSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,result,new ArrayList<>(),0,target);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList, int start, int remain){
        if(remain <0)
            return;
        else if(remain == 0){
            result.add(new ArrayList<>(tempList));
        }else{

            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
                tempList.add(nums[i]);
                backtrack(nums,result, tempList, i + 1, remain - nums[i] );
                tempList.remove(tempList.size() - 1);
            }
        }
    }


    public List<List<Integer>> combination(int n, int k){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n,k,result, new ArrayList<>(),1);
        return result;
    }

    public void backtrack(int n, int k, List<List<Integer>> result, List<Integer> tempList, int startIndex){
        if(tempList.size() == k)
            result.add(new ArrayList<>(tempList));
        for(int i = startIndex; i <= n ; i ++){
            tempList.add(i);
            backtrack(n,k,result,tempList,i+1);
            tempList.remove(tempList.size()-1);
        }
    }

    public List<String> generateBalancedParen(int n){
        List<String> result = new ArrayList<>();
        backtrack(result,n,n,"");
        return result;
    }

    public void backtrack(List<String> result, int leftParen, int rightParen, String tempString){
        if(leftParen == 0 && rightParen ==0) {
            result.add(tempString);
            return;
        }
        if(leftParen >0){
            backtrack(result,leftParen-1,rightParen,tempString+"(");
        }
        if(rightParen > leftParen){
            backtrack(result,leftParen,rightParen-1,tempString+")");

        }
    }

}
