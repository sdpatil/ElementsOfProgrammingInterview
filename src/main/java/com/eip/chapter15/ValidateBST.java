package com.eip.chapter15;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class ValidateBST {
    /*
    public boolean isBinaryTreeBST(BSTNode<Integer> root){
        return areKeysInRange(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean areKeysInRange(BSTNode<Integer> root, Integer lower, Integer upper){
        if(root == null)
            return true;

        if(root.data < lower || root.data > upper)
            return false;

        return areKeysInRange(root.left,lower,root.data) &&
                areKeysInRange(root.right, root.data,upper);
    }
*/

    /**
     * Problem : Check if binary tree is a valid BST
     *
     * Solution: Basic idea is that value of node should be more than its left child and less than its right child
     * so at every iteration send a value based on that to child node
     */
    public boolean isBinaryTreeBST(BSTNode<Integer> root) {
        return isBinaryTreeBSTHelper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public boolean isBinaryTreeBSTHelper(BSTNode<Integer> root, int min, int max){
        if(root == null)
            return true;

        if(root.data < min || root.data > max)
            return false;

        return isBinaryTreeBSTHelper(root.left,min, root.data) || isBinaryTreeBSTHelper(root.right,root.data, max);
    }
}
