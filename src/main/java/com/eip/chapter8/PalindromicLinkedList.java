package com.eip.chapter8;

import java.util.Stack;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class PalindromicLinkedList {

    public boolean isPalindrome(ListNode<Integer> head){
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
