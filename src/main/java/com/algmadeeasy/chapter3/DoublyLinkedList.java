package com.algmadeeasy.chapter3;

/**
 * Created by sunilpatil on 3/16/17.
 */
public class DoublyLinkedList {

    private DLLNode head;
    private DLLNode tail;
    private int length;

    public DoublyLinkedList(){
        head = new DLLNode(Integer.MIN_VALUE,null,null);
        tail = new DLLNode(Integer.MIN_VALUE,head,null);
        length = 0;
    }

    public int getLength(){
        return length;
    }

    public void insert(int data){
        DLLNode temp = new DLLNode(data);
        temp.next = head;
        head.prev = temp;
        head = temp;

    }
}
