package com.eip.chapter8;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class ReverseSingleLinkedList {

    public ListNode<Integer> reverseSingleLinkedList(ListNode<Integer> list, int start, int end){
        if(start == end)
            return list;

       // ListNode<Integer> dummyHead =
        return null;
    }

    public ListNode<Integer> reverseSingleLinkedList(ListNode<Integer> list){
        ListNode<Integer> dummyHead = new ListNode<Integer>(0,list);
        int length = dummyHead.getLength();


        ListNode<Integer> reversedTail = null;
        ListNode<Integer> reversedHead = dummyHead.next;

        int reverseCount = 1;
        while (length > reverseCount){
            System.out.println("Entering loop reversedHead " +reversedHead + " reverseTail " + reversedTail);

            ListNode<Integer> temp = reversedHead.next;
            reversedHead.next = reversedTail;
            reversedTail = reversedHead;
            reversedHead = temp;
            System.out.println("Exiting loop reversedHead " +reversedHead + " reverseTail " + reversedTail);
            reverseCount++;
        }

        return reversedTail;
    }
}
