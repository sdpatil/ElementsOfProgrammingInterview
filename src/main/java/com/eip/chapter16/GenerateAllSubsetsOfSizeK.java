package com.eip.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class GenerateAllSubsetsOfSizeK {
    /*
        Problem: Generate all subsets of size k
        Ex. given n = 5 and k =2 generate [1, 2] [1, 3] [1, 4] [1, 5] [2, 3] [2, 4] [2, 5] [3, 4] [3, 5] [4, 5]

        Solution: This is backtracking problem in which you pass start index + 1 to next iteration of backtrack
     */
    public List<List<Integer>> combination(int n, int k){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n,k,1,result, new ArrayList<>());
        return result;
    }

    public void backtrack(int n, int k, int startIndex, List<List<Integer>> result,
                          List<Integer> partialList){
        if(k == partialList.size()) {
            result.add(new ArrayList<>(partialList));
            return;
        }
        for(int i = startIndex ;i <= n; i++){
            partialList.add(i);
            backtrack(n,k,i+1,result,partialList);
            partialList.remove(partialList.size()-1);
        }
    }

  /*  public List<List<Integer>> combination(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        combination(n, k, 0, new ArrayList(), result);
        return result;
    }

    public void combination(int n, int k, int startIndex,   List<Integer> partialList,
                            List<List<Integer>> result) {
        if (k == partialList.size()) {
            result.add(new ArrayList<>(partialList));
            return;
        }
        for(int j = startIndex; j < n; j++){
            partialList.add(j+1);
            combination(n,k,j+1,partialList,result);
            partialList.remove(partialList.size()-1);
        }
    }*/


}
