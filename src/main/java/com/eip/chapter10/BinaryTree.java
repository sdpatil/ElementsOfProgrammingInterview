package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/17/17.
 */
public class BinaryTree<T> {
    public T data;
    BinaryTree<T> parent, left, right;

    public BinaryTree(T data ,BinaryTree<T> p) {
        this.data = data;
        this.parent =p;
    }

    @Override
    public String toString() {
        return ""+data;
                //"{" +left + "." + data + "."+ right +"}"

    }
}
