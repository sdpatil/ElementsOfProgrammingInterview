package com.eip.chapter8;

/**
 * Problem: Implement an algorithm to delete a node in the middle of a single linked list,
 * given only access to that node.
 EXAMPLE
 Input: the node ‘c’ from the linked list a->b->c->d->e
 Result: nothing is returned, but the new linked list looks like a->b->d->e
 * Solution :- Copy content of the next node (both data and next into current node that way effectively deleting
 * next node
 */
public class DeleteANodeFromSinglyLinkedList {
    public void deleteFromList(ListNode<Integer> nodeToDelete){
        nodeToDelete.data = nodeToDelete.next.data;
        nodeToDelete.next = nodeToDelete.next.next;
    }
}
