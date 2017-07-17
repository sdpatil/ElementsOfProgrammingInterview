package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class OverlappingListsTest {
    OverlappingLists overlappingLists;

    @Before
    public void setup(){
        overlappingLists = new OverlappingLists();
    }

    @Test
    public void lengthTest(){
        ListNode<Integer> first = new ListNode<Integer>(1);
        first.next = new ListNode<Integer>(2);
        first.next.next = new ListNode<Integer>(3);
        first.next.next.next = new ListNode<Integer>(4);
        first.next.next.next.next = new ListNode<Integer>(5);
        first.next.next.next.next.next = new ListNode<Integer>(6);
        first.next.next.next.next.next.next = new ListNode<Integer>(7);
        System.out.println("First List " + first);
        System.out.println("First List size " + overlappingLists.getLength(first));

        ListNode<Integer> second = new ListNode<Integer>(2);
        second.next = first.next.next.next.next.next;

        System.out.println("Second List " + second);
        System.out.println("Second List size " + overlappingLists.getLength(second));
    }

    @Test
    public void overlappingNoCycleListsTest(){
        ListNode<Integer> first = new ListNode<Integer>(1);
        first.next = new ListNode<Integer>(2);
        first.next.next = new ListNode<Integer>(3);
        first.next.next.next = new ListNode<Integer>(4);
        first.next.next.next.next = new ListNode<Integer>(5);
        first.next.next.next.next.next = new ListNode<Integer>(6);
        first.next.next.next.next.next.next = new ListNode<Integer>(7);

        ListNode<Integer> second = new ListNode<Integer>(2);
        second.next = first.next.next.next.next.next;

        ListNode<Integer> commonHead = overlappingLists.overlappingNoCycleLists(first,second);
        assert commonHead.data == 6;
    }

    @Test
    public void overlappingNoCycleListsNegativeTest(){
        ListNode<Integer> first = new ListNode<Integer>(1);
        first.next = new ListNode<Integer>(2);
        first.next.next = new ListNode<Integer>(3);
        first.next.next.next = new ListNode<Integer>(4);
        first.next.next.next.next = new ListNode<Integer>(5);
        first.next.next.next.next.next = new ListNode<Integer>(6);
        first.next.next.next.next.next.next = new ListNode<Integer>(7);

        ListNode<Integer> second = new ListNode<Integer>(2);
        second.next = first.next.next.next.next.next;

        ListNode<Integer> commonHead = overlappingLists.overlappingNoCycleLists(first,second);
        assert commonHead.data == 6;
    }
}
