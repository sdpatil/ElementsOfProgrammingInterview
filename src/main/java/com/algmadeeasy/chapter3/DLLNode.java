package com.algmadeeasy.chapter3;

/**
 * Created by sunilpatil on 3/16/17.
 */
public class DLLNode {
    int data;
     DLLNode prev;
    DLLNode next;

    public DLLNode(int data) {
        this.data = data;
    }

    public DLLNode(int data, DLLNode prev, DLLNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
