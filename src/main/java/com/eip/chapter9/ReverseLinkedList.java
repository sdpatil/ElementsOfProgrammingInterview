package com.eip.chapter9;

import com.eip.chapter8.ListNode;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class ReverseLinkedList {

    public void printLinkedListInReverse(ListNode<Integer> head) {
        Deque<Integer> nodes = new LinkedList<Integer>();
        while (head != null) {
            nodes.addFirst(head.data);
            head = head.next;
        }

        //  while(!nodes.isEmpty())
        //     System.out.println(nodes.remove());

        Iterator<Integer> descIt = nodes.iterator();
        while (descIt.hasNext())
            System.out.println(descIt.next());
    }
}
