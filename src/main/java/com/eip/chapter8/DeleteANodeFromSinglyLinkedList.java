package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class DeleteANodeFromSinglyLinkedList {
    public void deleteFromList(ListNode<Integer> nodeToDelete){
        nodeToDelete.data = nodeToDelete.next.data;
        nodeToDelete.next = nodeToDelete.next.next;
    }
}
