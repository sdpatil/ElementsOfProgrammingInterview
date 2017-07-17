package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class CyclicRightShiftOfLinkedList {

    /*
        Problem is to right shift the linked list in cyclic fashion
        Ex. 1->2->3->4->5 right shifting by 2 should give us 3->4->5->1->2
     */
    public ListNode<Integer> cyclicallyRightShiftList(ListNode<Integer> head, int K) {
        int length = 0;
        ListNode<Integer> tailNode = head;
        while (tailNode.next != null){
            tailNode = tailNode.next;
            length++;
        }
        System.out.println("Length of the linked list is " + length);
        // This is to deal with situation if K is larger than n, modulo will bring it
        // to value below length
        K = K %length;

        //Connect tail to head so the linked list becomes cyclic.
        tailNode.next = head;
        //Now figure out how many nodes have to be shifted
        int stepsToHead = length-K;
        int counter = 0;
        //Iterate till you find out where to break cycle based on number of steps
        while (counter++ < stepsToHead){
            tailNode = tailNode.next;
        }
        //Now we know the new tail location, so first store the new head
        ListNode<Integer> returnNode = tailNode.next;
        //Set newTail.next =null so that cycle breaks
        tailNode.next = null;
        return returnNode;
    }

    public ListNode<Integer> cyclicallyRightShiftList2(ListNode<Integer> head, int K){
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
