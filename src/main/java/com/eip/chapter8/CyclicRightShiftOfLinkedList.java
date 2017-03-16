package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class CyclicRightShiftOfLinkedList {

    public ListNode<Integer> cyclicallyRightShiftList(ListNode<Integer> head, int K){
        ListNode<Integer> fastPointer = head;
        ListNode<Integer> newHead = null;
        int counter = 0;
        while(counter < K-1) {
            fastPointer = fastPointer.next;
            counter = counter+1;
        }

        newHead = fastPointer.next;
        ListNode<Integer> tempHead = newHead;

        fastPointer.next = null;

        while(tempHead.next !=null){
            tempHead = tempHead.next;
        }
        tempHead.next = head;
        return newHead;
    }
}
