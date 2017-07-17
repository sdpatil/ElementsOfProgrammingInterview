package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class AddListBasedIntegersTest {
    AddListBasedIntegers addListBasedIntegers;

    @Before
    public void setup(){
        addListBasedIntegers = new AddListBasedIntegers();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> L1 = new ListNode<Integer>(3);
        L1.next = new ListNode<Integer>(1);
        L1.next.next = new ListNode<Integer>(4);

        ListNode<Integer> L2 = new ListNode<Integer>(7);
        L2.next = new ListNode<Integer>(0);
        L2.next.next = new ListNode<Integer>(9);

        ListNode<Integer> sum =addListBasedIntegers.addTwoNumbers(L1,L2);
        System.out.println(sum);
    }

    @Test
    public void simple2Test(){
        ListNode<Integer> L1 = new ListNode<Integer>(9);
        L1.next = new ListNode<Integer>(9);
        L1.next.next = new ListNode<Integer>(9);

        ListNode<Integer> L2 = new ListNode<Integer>(9);
        L2.next = new ListNode<Integer>(9);
        L2.next.next = new ListNode<Integer>(9);

        ListNode<Integer> sum =addListBasedIntegers.addTwoNumbers(L1,L2);
        System.out.println(sum);
    }
}
