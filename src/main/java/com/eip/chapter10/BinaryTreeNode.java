package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class BinaryTreeNode<T> {
    public T data;
    public int size;
    public BinaryTreeNode<T> left,right;

    public BinaryTreeNode(T data) {
        this.data = data;
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
