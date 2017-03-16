package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class CyclicRightShiftOfLinkedListTest {
    CyclicRightShiftOfLinkedList cyclicRightShiftOfLinkedList;

    @Before
    public void setup(){
        cyclicRightShiftOfLinkedList = new CyclicRightShiftOfLinkedList();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> headNode = new ListNode<Integer>(2);
        headNode.next = new ListNode<Integer>(3);
        headNode.next.next = new ListNode<Integer>(5);
        headNode.next.next.next = new ListNode<Integer>(3);
        headNode.next.next.next.next = new ListNode<Integer>(2);

        System.out.println("Before " + headNode);
        ListNode<Integer> newHead = cyclicRightShiftOfLinkedList.cyclicallyRightShiftList(headNode,2);
        System.out.println("After " + newHead);

        assert newHead.data == 5;

    }

    @Test
    public void simple2Test(){
        ListNode<Integer> headNode = new ListNode<Integer>(1);
        headNode.next = new ListNode<Integer>(2);
        headNode.next.next = new ListNode<Integer>(3);
        headNode.next.next.next = new ListNode<Integer>(4);
        headNode.next.next.next.next = new ListNode<Integer>(5);

        System.out.println(headNode);

        ListNode<Integer> newHead = cyclicRightShiftOfLinkedList.cyclicallyRightShiftList(headNode,2);
        System.out.println(newHead);

        assert newHead.data == 3;

    }
}
