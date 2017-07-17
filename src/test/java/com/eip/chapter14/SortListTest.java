package com.eip.chapter14;

import com.eip.chapter8.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/11/17.
 */
public class SortListTest {
    SortList sortList;

    @Before
    public void setup(){
        sortList = new SortList();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> head = new ListNode<Integer>(4);
        head.next = new ListNode<Integer>(3);
        head.next.next = new ListNode<Integer>(5);
        head.next.next.next = new ListNode<Integer>(1);
        head.next.next.next.next = new ListNode<Integer>(2);

        System.out.println(head);
        ListNode<Integer> head2 = sortList.stableSortList(head);
        System.out.println(head2);
    }

    @Test
    public void mergeSortedListTest(){
        ListNode<Integer> first = new ListNode<Integer>(1);
        first.next = new ListNode<Integer>(3);
        first.next.next = new ListNode<Integer>(5);

        ListNode<Integer> second = new ListNode<Integer>(2);
        second.next = new ListNode<Integer>(4);
        second.next.next = new ListNode<Integer>(6);

        ListNode<Integer> result = sortList.mergeTwoSortedLists(first,second);
        while (result != null){
            System.out.println(result.data);
            result = result.next;
        }
    }
}
