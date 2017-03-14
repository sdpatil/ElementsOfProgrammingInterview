package com.eip.chapter14;

import com.eip.chapter8.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/11/17.
 */
public class SortListTest {
    SortList sortList;

    @Before
    public void setup(){
        sortList = new SortList();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> head = new ListNode<Integer>(4);
        head.next = new ListNode<Integer>(3);
        head.next.next = new ListNode<Integer>(5);
        head.next.next.next = new ListNode<Integer>(1);
        head.next.next.next.next = new ListNode<Integer>(2);

        System.out.println(head);
        ListNode<Integer> head2 = sortList.stableSortList(head);
        System.out.println(head2);
    }
}
