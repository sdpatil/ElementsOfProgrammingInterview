package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class TestForCyclicityTest {
    TestForCyclicity testForCyclicity;

    @Before
    public void setup(){
        testForCyclicity = new TestForCyclicity();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> head = new ListNode<Integer>(1);
        head.next = new ListNode<Integer>(2);
        head.next.next = new ListNode<Integer>(3);
        head.next.next.next = new ListNode<Integer>(4);
        head.next.next.next.next = new ListNode<Integer>(5);
        head.next.next.next.next.next = new ListNode<Integer>(6);

        assert testForCyclicity.hasCycle(head) == null;


        head.next.next.next= head;
        System.out.println("" + head);
        assert testForCyclicity.hasCycle(head) == head;

    }
}
