package com.eip.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class GenerateAllSubsetsOfSizeK {

    public List<List<Integer>> combination(int n, int k) {
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
    }

    public List<List<Integer>> combination2(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        combination2(n, k, 1, new ArrayList(), result);
        return result;
    }

    public void combination2(int n, int k, int offset,   List<Integer> partialList,
                            List<List<Integer>> result) {
        if (k == partialList.size()) {
            result.add(new ArrayList<>(partialList));
            return;
        }
        final int numRemaining = k - partialList.size();
        for(int i = offset; i <= n && numRemaining <= n-i+1; ++i){
            partialList.add(i);
            combination(n,k,i+1,partialList,result);
            partialList.remove(partialList.size()-1);
        }
    }
}
