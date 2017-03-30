package com.eip.chapter15;

import java.util.List;

/**
 * Created by sunilpatil on 3/29/17.
 */
public class BuildMinHeightBSTFromSortedArray {

    public BSTNode<Integer> buildMinHeightBSTFromSortedArray(List<Integer> A){

        return buildMinHeightBSTFromSortedArray(A,0, A.size());
    }

    public BSTNode<Integer> buildMinHeightBSTFromSortedArray(List<Integer> A, int start , int end){
        if(start>= end){
            return null;
        }
        int mid = start + ((end-start)/2);
        return new BSTNode(A.get(mid), buildMinHeightBSTFromSortedArray(A,start, mid)
                , buildMinHeightBSTFromSortedArray(A,mid+1, end));
    }
}
