package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class ListPivoting {

    public ListNode<Integer> listPivoting(ListNode<Integer> headNode, int pivot){
        ListNode<Integer> lessHead = new ListNode<Integer>(0,null);
        ListNode<Integer> sameHead = new ListNode<Integer>(0,null);
        ListNode<Integer> greaterHead = new ListNode<Integer>(0,null);


        ListNode<Integer> lessIter = lessHead;
        ListNode<Integer> sameIter =sameHead;
        ListNode<Integer> greaterIter = greaterHead;

        ListNode<Integer> iter = headNode;
        while(iter !=null){
            if(iter.data < pivot){
                lessIter.next = iter;
                lessIter = iter;
            }else if(iter.data > pivot){
                greaterIter.next = iter;
                greaterIter = iter;
            }else{
                sameIter.next = iter;
                sameIter = iter;
            }
            iter = iter.next;
        }
        greaterIter.next = null;
        sameIter.next = greaterHead.next;
        lessIter.next=sameHead.next;

        return lessHead.next;
    }
}
