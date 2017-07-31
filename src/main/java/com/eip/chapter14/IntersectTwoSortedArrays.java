package com.eip.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem:- Write a program that takes as input two sorted arrays and returns a new array containing elements
 * that are present in both of the input arrays. The input may also contain duplicates, and dont copy duplicates
 */
public class IntersectTwoSortedArrays {
    public List<Integer> intersectTwoSortedArrays(List<Integer> A, List<Integer> B) {
        List<Integer> returnList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            //Is element of A smaller than element of B, increment A counter
            if (A.get(i) < B.get(j)) {
                i++;
            } else if (A.get(i) > B.get(j)) {
                //If element of B is smaller than element of A, increment B counter
                j++;
            } else {
                //Both are same, so check if this element is already copied into result if not copy it
                if (i == 0 || A.get(i) != A.get(i - 1))
                    returnList.add(A.get(i));
                i++;
                j++;
            }
        }
        return returnList;
    }
}
