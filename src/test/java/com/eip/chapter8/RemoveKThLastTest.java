package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class RemoveKThLastTest {
    RemoveKThLast removeKThLast;

    @Before
    public void setup(){
        removeKThLast = new RemoveKThLast();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> header = new ListNode<Integer>(1);
        header.next = new ListNode<Integer>(2);
        header.next.next = new ListNode<Integer>(3);
        header.next.next.next = new ListNode<Integer>(4);
        header.next.next.next.next = new ListNode<Integer>(5);

        System.out.println(header);

        ListNode<Integer> removedNode =removeKThLast.removeKthLast(header,2);
        assert removedNode.data ==3;

        System.out.println("After deleting kth node " + header);
    }
}
