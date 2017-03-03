package com.eip.chapter15;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class ValidateBST {
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
}
