package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class RemoveKThLast {
    public ListNode<Integer> removeKthLast(ListNode<Integer> head, int k){
        int counter = 0;
        ListNode<Integer> nextNode = head;
        ListNode<Integer> deleteNode = head;
        while(counter <= k+1 && nextNode != null){
            counter = counter+1;
            nextNode = nextNode.next;
        }

        while(nextNode != null){
            nextNode = nextNode.next;
            deleteNode = deleteNode.next;
        }
        ListNode<Integer> returnNode = deleteNode.next;
        deleteNode.next = deleteNode.next.next;

        return returnNode;
    }
}
