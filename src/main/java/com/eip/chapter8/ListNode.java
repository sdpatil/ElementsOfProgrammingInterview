package com.eip.chapter8;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class ListNode<T> {
    public T data;
    public ListNode<T> next;

    public ListNode(T data) {
        this.data = data;

    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
