package com.eip.chapter15;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class BSTNode<T> {
    public T data;
    public BSTNode<T> left, right;

    public BSTNode(T data) {
        this.data = data;
    }

    public BSTNode(T data, BSTNode left, BSTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "BSTNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
