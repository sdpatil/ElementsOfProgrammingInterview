package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class RemoveDuplicatesFromSortedListTest {
    RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    @Before
    public void setup(){
        removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> header = new ListNode<Integer>(1);
        header.next = new ListNode<Integer>(2);
        header.next.next = new ListNode<Integer>(3);
        header.next.next.next = new ListNode<Integer>(3);
        header.next.next.next.next = new ListNode<Integer>(5);
        header.next.next.next.next.next = new ListNode<Integer>(6);

        System.out.println(header);
        System.out.println("Before remove duplicate " +removeDuplicatesFromSortedList.length(header));

        removeDuplicatesFromSortedList.removeDuplicates(header);

        System.out.println(header);
        System.out.println("After remove duplicate " +removeDuplicatesFromSortedList.length(header));
    }

    @Test
    public void complexTest(){
        ListNode<Integer> header = new ListNode<Integer>(2);
        header.next = new ListNode<Integer>(2);
        header.next.next = new ListNode<Integer>(3);
        header.next.next.next = new ListNode<Integer>(5);
        header.next.next.next.next = new ListNode<Integer>(7);
        header.next.next.next.next.next = new ListNode<Integer>(11);
        header.next.next.next.next.next.next = new ListNode<Integer>(11);

        System.out.println(header);
        System.out.println("Before remove duplicate " +removeDuplicatesFromSortedList.length(header));

        removeDuplicatesFromSortedList.removeDuplicates(header);

        System.out.println(header);
        System.out.println("After remove duplicate " +removeDuplicatesFromSortedList.length(header));
    }
}
