package com.eip.chapter14;

import com.eip.chapter8.ListNode;
import com.eip.chapter8.MergeSortedList;

import java.util.List;

/**
 * Created by sunilpatil on 3/11/17.
 */
public class SortList {

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
        return MergeSortedList.mergeTwoSortedLinkedLists1(stableSortList(L),stableSortList(slow));
    }

    public ListNode<Integer> mergeSortList(ListNode<Integer> L){
        if(L == null || L.next == null)
            return L;

        ListNode<Integer> preSlow = null , slow =L, fast = L;
        while ( fast != null && fast.next != null){
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preSlow.next = null;

        return mergeTwoSortedLists(mergeSortList(L), mergeSortList(slow));
    }

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
