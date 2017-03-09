package com.eip.chapter8;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class LinkedList<T> {
    private ListNode<T> head;

    public ListNode<T> search(T key){
        ListNode l = head;
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

    public void insertAfter(T fKey, T newKey){
        if(head == null){
            head = new ListNode<T>(newKey);
        }else{
            ListNode l = head;
            while(l.next != null){
                if(l.data == fKey){
                    ListNode newNode = new ListNode(newKey);
                    newNode.next = l.next;
                    l.next = newNode;
                }
            }
        }
    }

    public void deleteNode(T key){
        if(head == null)
            return;
        if(head.data == key){
            head = head.next;
            return;
        }
        ListNode l = head;
        while(l.next != null){
            if(l.next.data == key){
                l.next = l.next.next;
            }
        }
    }

    public int size(){
        int size = 1;
        ListNode next = head;
        while(next != null){
            size = size+1;
            next = next.next;
        }
        return size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
