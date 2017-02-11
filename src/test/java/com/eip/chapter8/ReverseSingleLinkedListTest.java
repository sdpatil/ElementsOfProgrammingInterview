package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class ReverseSingleLinkedListTest {
    ReverseSingleLinkedList reverseSingleLinkedList;

    @Before
    public void setup(){
        reverseSingleLinkedList = new ReverseSingleLinkedList();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> list = new ListNode<Integer>(11, new ListNode<Integer>(3, new ListNode<Integer>(5, new ListNode<Integer>(7, new ListNode<Integer>(2, null)))));

        System.out.println(list);

        ListNode<Integer> returnList = reverseSingleLinkedList.reverseSingleLinkedList(list,2,4);
        System.out.println(returnList);
    }

    @Test
    public void reverseSingleLinkedListTest(){
        ListNode<Integer> list = new ListNode<Integer>(1, new ListNode<Integer>(2, new ListNode<Integer>(3, new ListNode<Integer>(4, new ListNode<Integer>(5, null)))));
        System.out.println(list);

        ListNode<Integer> reversedList = reverseSingleLinkedList.reverseSingleLinkedList(list);
        System.out.println(reversedList);
    }
}
