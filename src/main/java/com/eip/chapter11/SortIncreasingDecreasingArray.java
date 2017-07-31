package com.eip.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Sort an increasing decreasing array. Increasing, decreasing array means if the elements are continuously
 * increasing upto certain index
 */
public class SortIncreasingDecreasingArray {
    private static final int INCREASING =1;
    private static final int DECREASING =2;

    /*
    Extract set of sorted arrays and then merge them together
     */
    public List<Integer> sortKIncreasingDecreasingArray(List<Integer> A){
        List<List<Integer>> sortedSubArrays = new ArrayList<List<Integer>>();

        List<Integer> sortedArray = new ArrayList<Integer>();
        sortedArray.add(A.get(0));
        int direction = INCREASING;
        for(int i = 1 ; i < A.size(); i++){
            if(A.get(i) > A.get(i-1) && direction == INCREASING){
                //This element is greater than last and direction is increasing so keep adding
                sortedArray.add(A.get(i));
            }else if(A.get(i) < A.get(i-1) && direction == DECREASING ){
                //This element is less than last and direction is decreading so keep adding
                sortedArray.add(A.get(i));
            }else if (A.get(i) < A.get(i-1) && direction == INCREASING){
                //Direction is changing so add current subarray to sortedASubArray and create new subarray
                direction = DECREASING;
                sortedSubArrays.add(sortedArray);
                sortedArray = new ArrayList<Integer>();
                sortedArray.add(A.get(i));
            }else if (A.get(i) > A.get(i-1) && direction == DECREASING){
                //Direction is changing so add current subarray to sortedASubArray and create new subarray
                direction = INCREASING;
                sortedSubArrays.add(sortedArray);
                sortedArray = new ArrayList<Integer>();
                sortedArray.add(A.get(i));
            }
        }
        sortedSubArrays.add(sortedArray);

        System.out.println("Sorted Sub Arrays " + sortedSubArrays);
        MergeSortedFiles mergeSortedFiles = new MergeSortedFiles();
        //Now we have set of sorted sub arrays merge them

        return mergeSortedFiles.mergeSortedArrays(sortedSubArrays);
    }
}
