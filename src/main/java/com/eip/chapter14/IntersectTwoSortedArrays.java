package com.eip.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/27/17.
 */
public class IntersectTwoSortedArrays {
    public List<Integer> intersectTwoSortedArrays(List<Integer> A, List<Integer> B) {
        List<Integer> returnList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) < B.get(j)) {
                i++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                if (i == 0 || A.get(i) != A.get(i - 1))
                    returnList.add(A.get(i));
                i++;
                j++;
            }
        }
        return returnList;
    }
}
