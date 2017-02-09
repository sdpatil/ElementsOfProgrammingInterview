package com.eip.chapter8;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class LinkedList<T> {
    private ListNode<T> head;

    public ListNode<T> search(ListNode<T> l,T key){

        while(l!= null){
            if(l.data == key)
                return l;
            l = l.next;
        }
        return null;
    }

    public void insert(T data){
        if(head == null){
            head = new ListNode<T>(data);
        }else {
            ListNode l = head;
            while (l.next != null)
                l = l.next;
            l.next = new ListNode(data);
        }
    }
}
