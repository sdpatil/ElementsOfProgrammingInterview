package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class TreeTraversal<T> {

    public void inorderTraversal(BinaryTreeNode<T> root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.println("Node data " + root.data);
            inorderTraversal(root.right);
        }
    }

    public void preorderTraversal(BinaryTreeNode<T> root){
        if(root != null){
            System.out.println("Node data " + root.data);
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }
    }

    public void postorderTraversal(BinaryTreeNode<T> root){
        if(root != null){
            inorderTraversal(root.left);
            inorderTraversal(root.right);
            System.out.println("Node data " + root.data);
        }
    }

    public int height(BinaryTreeNode<T> root){
        if(root != null){
            int leftTreeHeight = height(root.left);
            int rightTreeHeight = height(root.right);
            return Math.max(leftTreeHeight,rightTreeHeight)+1;
        }
        return 0;
    }
}
