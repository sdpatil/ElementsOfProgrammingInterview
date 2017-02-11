package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class MergeSortedListTest {
    MergeSortedList mergeSortedList;

    @Before
    public void setup(){
        mergeSortedList = new MergeSortedList();
    }

    @Test
    public void simpleTest(){
        ListNode<Integer> first = new ListNode(2, new ListNode<Integer>(5, new ListNode<Integer>(7,null)));
        assert first.getLength() == 3;
        System.out.println(first);
        ListNode<Integer> second = new ListNode(3, new ListNode<Integer>(11,null));
        assert second.getLength() == 2;
        System.out.println(second);

        ListNode<Integer> mergedList = mergeSortedList.mergeTwoSortedLinkedLists(first,second);
        assert mergedList.getLength() == 5;
        System.out.println(mergedList);

    }
}
