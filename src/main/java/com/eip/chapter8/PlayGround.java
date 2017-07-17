package com.eip.chapter8;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class PlayGround {

    public static void main(String[] argv){
        ListNode<Integer> head = new ListNode<Integer>(1);
        head.next = new ListNode<Integer>(2);
        head.next.next = new ListNode<Integer>(3);
        head.next.next.next =new ListNode<Integer>(4);
        head.next.next.next.next =new ListNode<Integer>(5);
        printList(head);
        ListNode<Integer> newHead = reverseLinkedList(head);;
        System.out.println();
        printList(newHead);

    }

    private static ListNode<Integer> reverseLinkedList(ListNode<Integer> head){
        ListNode<Integer> dummyHead = new ListNode<Integer>(0,head);
        //Get length of the
        int length = getLength(dummyHead);

        ListNode<Integer> subListHead = dummyHead;
        ListNode<Integer> subListIter = subListHead.next;

        int reverseCount = 1;
        while (length > ++reverseCount){
            ListNode<Integer> temp = subListIter.next;
            subListIter.next = temp.next;
            temp.next = subListHead.next;
            subListHead.next = temp;

        }
        return dummyHead.next;
    }

    private static void printList(ListNode<Integer> node){
        ListNode<Integer> next = node;
        while(next!=null){
            System.out.print(next.data +" ");
            next = next.next;
        }

    }

    public static int getLength(ListNode<Integer> head){
        int count = 0;
        while (head!= null){
            head = head.next;
            count++;
        }
        return count;
    }

}
