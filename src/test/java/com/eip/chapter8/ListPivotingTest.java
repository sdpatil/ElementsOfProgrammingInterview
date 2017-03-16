package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class ListPivotingTest {
    ListPivoting listPivoting;

    @Before
    public void setup() {
        listPivoting = new ListPivoting();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> headNode = new ListNode<Integer>(3);
        headNode.next = new ListNode<Integer>(2);
        headNode.next.next = new ListNode<Integer>(2);
        headNode.next.next.next = new ListNode<Integer>(11);
        headNode.next.next.next.next = new ListNode<Integer>(7);
        headNode.next.next.next.next.next = new ListNode<Integer>(5);
        headNode.next.next.next.next.next.next = new ListNode<Integer>(11);

        System.out.println(headNode);
        ListNode<Integer> returnList = listPivoting.listPivoting(headNode,5);
        System.out.println(returnList);
    }
}
