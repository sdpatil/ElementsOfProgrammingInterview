package com.eip.chapter15;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class BSTree {
    public BSTNode<Integer> searchBST(BSTNode<Integer> root, int key){
        if(root == null || root.data == key )
            return root;

        if(key < root.data)
            return searchBST(root.left, key);
        else
            return searchBST(root.right, key);
    }
}
