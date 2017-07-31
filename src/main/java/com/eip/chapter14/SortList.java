package com.eip.chapter14;

import com.eip.chapter8.ListNode;
import com.eip.chapter8.MergeSortedList;

import java.util.List;

/**
 * Problem: Use merge sort two sort a linked list
 */
public class SortList {

    //This method takes a list using 2 pointers it breaks the list into 2 parts and then calls itself
    //for both first and second part, passing the result to mergeTwoSortedLists
    public ListNode<Integer> stableSortList(ListNode<Integer> L){
        if(L == null || L.next == null)
            return L;

        ListNode<Integer> preSlow =null;
        ListNode<Integer> slow = L;
        ListNode<Integer> fast = L;
        while(fast!= null && fast.next != null){
            preSlow = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        preSlow.next =null;
        return mergeTwoSortedLists(stableSortList(L),stableSortList(slow));
    }

    // This method takes care of merging two sorted lists
    public ListNode<Integer> mergeTwoSortedLists(ListNode<Integer> first, ListNode<Integer> second){
        ListNode<Integer> dummyNode =new ListNode<Integer>(0);
        ListNode nextNode = dummyNode;
        while(first !=null && second != null ){
            if(first.data < second.data){
                nextNode.next = first;
                first = first.next;
            }else {
             nextNode.next = second;
             second = second.next;
            }
            nextNode = nextNode.next;

        }
           nextNode.next = first != null ? first: second;
        return dummyNode.next;
    }
}
