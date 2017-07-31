package com.eip.chapter8;

/**
 * Problem: Given 2 sorted linked lists, merge them
 */
public class MergeSortedList {

    public static ListNode<Integer> mergeTwoSortedLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2){
        ListNode<Integer> dummyNode = new ListNode<Integer>(0,null);
        ListNode<Integer> current = dummyNode;

        while(l1 != null && l2  != null){
             if(l1.data > l2.data) {
                current.next = l2;
                l2 = l2.next;
            }else{
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        current.next = l1 != null ? l1 :l2;
        return dummyNode.next;
    }
}
