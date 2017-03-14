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
}
