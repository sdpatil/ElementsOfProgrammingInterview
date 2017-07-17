package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class ListPivoting {

    /*
        Problem : Given a linked list and a pivot rearrange the linked list so that all the nodes
        with value less than pivot come first, then all the nodes with value equal to pivot followed by
        all the nodes with value greater than pivot
        Ex. 3 ->2 ->7 ->11 ->7 ->5 ->11 and pivot 7 should get converted to
         3 -> 2 ->5 -> 7 ->7 ->11 ->11

     */
    public ListNode<Integer> listPivoting(ListNode<Integer> headNode, int pivot) {
        //Create 3 different dummy heads one each for less, equal and greater
        ListNode<Integer> lessHead = new ListNode<Integer>(0,null);
        ListNode<Integer> equalHead = new ListNode<Integer>(0,null);
        ListNode<Integer> greaterHead = new ListNode<Integer>(0,null);

        ListNode<Integer> lessIter = lessHead;
        ListNode<Integer> equalIter = equalHead;
        ListNode<Integer> greaterIter = greaterHead;

        // Divide the linked list nodes into 3 parts depending on the value
        ListNode<Integer> iter = headNode;
        while (iter !=null){
            if(iter.data < pivot){
                lessIter.next = iter;
                lessIter = iter;
            }else if(iter.data > pivot){
                greaterIter.next = iter;
                greaterIter= iter;
            }else{
                equalIter.next = iter;
                equalIter = iter;
            }
            iter = iter.next;
        }
        //Combine the three parts into 1
        greaterIter.next = null;
        equalIter.next = greaterHead.next;
        lessIter.next = equalHead.next;
        return lessHead.next;
    }

    public ListNode<Integer> listPivoting2(ListNode<Integer> headNode, int pivot){
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
