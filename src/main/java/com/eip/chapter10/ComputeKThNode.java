package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class ComputeKThNode {

    public BinaryTreeNode<Integer> findKthNodeBinaryTree(BinaryTreeNode<Integer> tree, int k){
        BinaryTreeNode<Integer> iter = tree;
        while(iter !=null){
            int leftSize = iter.left != null ? iter.left.size:0;
            if(leftSize + 1 < k){
                k-= (leftSize+1);
                iter = iter.right;
            }else if(leftSize == k-1)
                return iter;
            else{
                iter = iter.left;
            }
        }
        return null;
    }
}
