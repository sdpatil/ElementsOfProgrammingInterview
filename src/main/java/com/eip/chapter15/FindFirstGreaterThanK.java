package com.eip.chapter15;

/**
 * Created by sunilpatil on 3/1/17.
 */
public class FindFirstGreaterThanK {

    public BSTNode<Integer> findFirstGreaterThanK(BSTNode<Integer> root, int k){
        BSTNode<Integer> subtree = root;
        BSTNode<Integer> firstSoFar = null;
        while (subtree != null){
            if(subtree.data > k){
                firstSoFar = subtree;
                subtree = subtree.left;
            }else {
                subtree = subtree.right;
            }
        }

        return firstSoFar;
    }
}
