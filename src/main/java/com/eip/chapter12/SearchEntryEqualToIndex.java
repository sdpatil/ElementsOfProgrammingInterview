package com.eip.chapter12;

import java.util.List;

/**
 * Created by sunilpatil on 2/20/17.
 */
public class SearchEntryEqualToIndex {

    public int searchEntryEqualToItsIndex(List<Integer> A){
        int left = 0;
        int right = A.size()-1;
        while(left < right){
            int mid = left + ( (right -left)/2);
            int difference = A.get(mid) - mid;
            if(difference == 0){
                return mid;
            }else if (A.get(mid) < mid){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }
}
