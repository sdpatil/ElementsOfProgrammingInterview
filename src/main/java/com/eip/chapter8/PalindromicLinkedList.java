package com.eip.chapter8;

import java.util.Stack;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class PalindromicLinkedList {

    /*
    Problem: Check whether a linked list is palindromic
    Solution:- First use two pointers to find middle of the list, break the list into 2 parts and revserse
    second part. Now start compairing first and reverse of reverse of second part, if they dont match
    its not palindromic string
     */
    public boolean isPalindrome(ListNode<Integer> head) {
        //First step is to find the middle point
        ListNode<Integer> slow = head, fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = ReverseSingleLinkedList.reverseSingleLinkedList(slow);
        while (secondHalf != null && firstHalf != null){
            if(secondHalf.data != firstHalf.data)
                return false;
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode<Integer> head){
        Stack<Integer> stack = new Stack<Integer>();
        ListNode<Integer> slowPointer = head;
        ListNode<Integer> fastPointer = head;

        while (fastPointer != null && fastPointer.next != null){
            stack.push(slowPointer.data);
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        if(fastPointer!= null )
            if(fastPointer.next  == null)
                slowPointer = slowPointer.next;

        while(!stack.isEmpty()){
            int stackData = stack.pop();
            if(stackData != slowPointer.data)
                return false;
            slowPointer = slowPointer.next;
        }

        return true;
    }
}
