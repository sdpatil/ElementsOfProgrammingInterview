package com.eip.chapter15;

import javax.swing.tree.TreeNode;

/**
 * Created by sunilpatil on 3/29/17.
 */
public class BinarySearchTree {
    private BSTNode<Integer> root = null;

    public boolean insert(Integer key) {
        if (root == null) {
            root = new BSTNode<Integer>(key);
        } else {
            BSTNode<Integer> curr = root;
            BSTNode<Integer> parent = curr;
            while (curr != null) {
                parent = curr;
                int cmp = Integer.compare(key, curr.data);
                if (cmp < 0)
                    curr = curr.left;
                else if (cmp > 0)
                    curr = curr.right;
                else {
                    return false;
                }
            }

            if (Integer.compare(key, parent.data) < 0) {
                parent.left = new BSTNode<Integer>(key);
            } else {
                parent.right = new BSTNode<Integer>(key);
            }
        }
        return true;
    }

    public boolean delete(Integer key) {
        BSTNode<Integer> curr = root;
        BSTNode<Integer> parent = null;
        while (curr != null && Integer.compare(key, curr.data) != 0) {
            parent = curr;
            int cmp = Integer.compare(key, curr.data);
            if (cmp < 0)
                curr = curr.left;
            else
                curr = curr.right;
        }
        //Did not find the node
        if (curr == null)
            return false;

        BSTNode<Integer> keyNode = curr;
        if (keyNode.right != null) {
            BSTNode<Integer> rKeyNode = keyNode.right;
            BSTNode<Integer> rParent = keyNode;
            while (rKeyNode.left != null) {
                rParent = rKeyNode;
                rKeyNode = rKeyNode.left;
            }
            keyNode.data = rKeyNode.data;
            if (rParent.left == rKeyNode)
                rParent.left = rKeyNode.right;
            else
                rParent.right = rKeyNode.right;

            rKeyNode.right = null;
        }else{
            if(root == keyNode){
                root = keyNode.left;
                keyNode.left = null;
            }else{
                if(parent.left == keyNode){
                    parent.left= keyNode.left;
                }else{
                    parent.right = keyNode.left;
                }
                keyNode.left = null;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
