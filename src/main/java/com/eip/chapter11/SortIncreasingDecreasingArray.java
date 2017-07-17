package com.eip.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class SortIncreasingDecreasingArray {
    private static final int INCREASING =1;
    private static final int DECREASING =2;

    public List<Integer> sortKIncreasingDecreasingArray(List<Integer> A){
        List<List<Integer>> sortedSubArrays = new ArrayList<List<Integer>>();

        List<Integer> sortedArray = new ArrayList<Integer>();
        sortedArray.add(A.get(0));
        int direction = INCREASING;
        for(int i = 1 ; i < A.size(); i++){
            if(A.get(i) > A.get(i-1) && direction == INCREASING){
                sortedArray.add(A.get(i));
            }else if(A.get(i) < A.get(i-1) && direction == DECREASING ){
                sortedArray.add(A.get(i));
            }else if (A.get(i) < A.get(i-1) && direction == INCREASING){
                direction = DECREASING;
                sortedSubArrays.add(sortedArray);
                sortedArray = new ArrayList<Integer>();
                sortedArray.add(A.get(i));
            }else if (A.get(i) > A.get(i-1) && direction == DECREASING){
                direction = INCREASING;
                sortedSubArrays.add(sortedArray);
                sortedArray = new ArrayList<Integer>();
                sortedArray.add(A.get(i));
            }
        }
        sortedSubArrays.add(sortedArray);

        System.out.println("Sorted Sub Arrays " + sortedSubArrays);
        MergeSortedFiles mergeSortedFiles = new MergeSortedFiles();
        return mergeSortedFiles.mergeSortedArrays(sortedSubArrays);
    }
}
