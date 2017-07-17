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

    /*
    Problem: Search a sorted array for first occurance of k.
    Ex. {-14,-10,-2,108,108,243,285,285,285,401} when searching for 108 should return 3
    or searching for 285 should return 6
    Solution:- This is variation of binary search with twist that when you actually find matching
    entry you dont stop instead you keep searching on the left hand side.
     */
    public int searchForFirstK(List<Integer> A, int k){
        int start = 0 ;
        int end = A.size()-1;
        int result = -1;

        while (start <= end){
            int mid = start + (( end -start)/2);
            if(A.get(mid) > k){
                end = mid-1;
            }else if(A.get(mid) == k){
                //This section is the only difference from binary search
                result = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return result;
    }


}
