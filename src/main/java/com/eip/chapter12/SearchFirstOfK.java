package com.eip.chapter12;

import java.util.List;

/**
 * Created by sunilpatil on 2/20/17.
 */
public class SearchFirstOfK {
    public int searchFirstOfK(List<Integer> A, int k){
        int left = 0;
        int right = A.size() -1;
        int result = -1;
        while(left <= right){
            int mid = left + ((right - left)/2);
            if(A.get(mid) > k){
                right = mid-1;
            }else if(A.get(mid) == k){
                result = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return result;
    }
}
