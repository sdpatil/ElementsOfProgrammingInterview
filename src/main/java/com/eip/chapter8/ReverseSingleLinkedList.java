package com.eip.chapter8;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class ReverseSingleLinkedList {

    /*
        Problem: Reverse a singly linked list from certain star to end point
        Solution:-
     */
    public ListNode<Integer> reverseSingleLinkedList(ListNode<Integer> list, int start, int finish){
        if(start == finish)
            return list;

        ListNode<Integer> dummyHead = new ListNode<Integer>(0, list);
        ListNode<Integer> sublistHead = dummyHead;
        int k = 0;
        while (k++ < start){
            sublistHead = sublistHead.next;
        }

        ListNode<Integer> subListIter = sublistHead.next;
        while (start++ < finish){
            ListNode<Integer> temp = subListIter.next;
            subListIter.next = temp.next;
            temp.next= sublistHead.next;
            sublistHead.next = temp;
        }

        return dummyHead.next;
    }

    /*
    Problem :- Reverse a singly linked list
    Solution: - Create head and tail node and use them to reverse stuff.
     */
    public static ListNode<Integer> reverseSingleLinkedList(ListNode<Integer> list){
        ListNode<Integer> dummyHead = new ListNode<Integer>(0, list);
        int length = dummyHead.getLength();

        int reverseCount =1;
        ListNode<Integer> subListHead = dummyHead;

        ListNode<Integer> subListIter = subListHead.next;

        while (length > ++reverseCount){
            ListNode<Integer> temp = subListIter.next;
            subListIter.next = temp.next;
            temp.next = subListHead.next;
            subListHead.next = temp;

        }
        return dummyHead.next;
    }


    public ListNode<Integer> reverseSingleLinkedList2(ListNode<Integer> list){
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
