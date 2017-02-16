package com.eip.chapter9;

import com.eip.chapter8.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class ReverseLinkedListTest {
    ReverseLinkedList reverseLinkedList;

    @Before
    public void setup(){
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> head = new ListNode<Integer>(4,new ListNode<Integer>(3, new ListNode<Integer>(2,new ListNode<Integer>(1,null))));
        System.out.println(head);
        reverseLinkedList.printLinkedListInReverse(head);
    }
}
