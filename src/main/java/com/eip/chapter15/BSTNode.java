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

    @Override
    public String toString() {
        return "BSTNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
