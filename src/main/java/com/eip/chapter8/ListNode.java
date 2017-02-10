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

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public int getLength(){
        int length = 1;
        ListNode current = next;
        while(current != null){
            length = length+1;
            current = current.next;
        }
            return length;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
