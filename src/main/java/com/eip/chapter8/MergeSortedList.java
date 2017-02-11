package com.eip.chapter8;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class MergeSortedList {
    public ListNode<Integer> mergeTwoSortedLinkedLists1(ListNode<Integer> l1, ListNode<Integer> l2){
        ListNode<Integer> dummyNode = new ListNode<Integer>(0,null);
        ListNode<Integer> current = dummyNode;

        while(l1 != null || l2  != null){
            if(l1 == null){
             current.next = l2;
             l2 = l2.next;
            }else if(l2 == null) {
                current.next = l1;
                l1 = l1.next;
            }else if(l1.data > l2.data) {
                current.next = l2;
                l2 = l2.next;
            }else{
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }

        return dummyNode.next;
    }

    public ListNode<Integer> mergeTwoSortedLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2){
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
