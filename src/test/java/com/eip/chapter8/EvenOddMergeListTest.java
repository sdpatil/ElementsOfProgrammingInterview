package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class EvenOddMergeListTest {
    EvenOddMergeList evenOddMergeList;

    @Before
    public void setup(){
        evenOddMergeList = new EvenOddMergeList();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> headNode = new ListNode<Integer>(1);
        headNode.next = new ListNode<Integer>(2);
        headNode.next.next = new ListNode<Integer>(3);
        headNode.next.next.next = new ListNode<Integer>(4);
        headNode.next.next.next.next = new ListNode<Integer>(5);
        headNode.next.next.next.next.next = new ListNode<Integer>(6);

        System.out.println("Before " + headNode);
        ListNode<Integer> newHead = evenOddMergeList.evenOddMerge2(headNode);
        System.out.println("After " + newHead);

        assert newHead.data == 1;
    }
}
