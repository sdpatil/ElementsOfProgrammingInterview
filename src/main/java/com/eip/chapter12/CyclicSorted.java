package com.eip.chapter12;

import java.util.List;

/**
 * Created by sunilpatil on 2/21/17.
 */
public class CyclicSorted {

    public int searchSmallest(List<Integer> A) {
        int left = 0;
        int right = A.size() - 1;
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (A.get(mid) > A.get(right)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println("Returning value " + left);
        return left;
    }
}
