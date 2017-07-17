package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class BinaryTreeNode<T> {
    public T data;
    public int size;
    public BinaryTreeNode<T> left,right;


    public int depth;
    public int inOrder;

    public BinaryTreeNode<T> rightSibling;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public BinaryTreeNode(T data, BinaryTreeNode<T> leftSubTree, BinaryTreeNode<T> rightSubtree) {
        this.data = data;
        this.left = leftSubTree;
        this.right = rightSubtree;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
