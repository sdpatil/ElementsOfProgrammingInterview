package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class RemoveKThLast {


    /*
        Problem: Given a linked list delete kth node from end
        Solution: Use two pointers first is ahead of second by k nodes.
        Once first reaches end, second will point to node that should be deleted

     */
    public ListNode<Integer> removeKthLast(ListNode<Integer> head, int k) {
        int counter = 0;
        ListNode<Integer> dummyHead = new ListNode<Integer>(0,head);
        //First node should be k steps ahead of first
        ListNode<Integer> firstNode = dummyHead.next;
        while (k-- >= 0 ){
            firstNode = firstNode.next;
        }
        //Move both first and second pointer together
        ListNode<Integer> second =dummyHead.next;
        while (firstNode !=null){
            firstNode = firstNode.next;
            second = second.next;
        }
        //Return the node that is deleted
        ListNode<Integer> result = second.next;
        second.next = second.next.next;
        return result;
    }
}