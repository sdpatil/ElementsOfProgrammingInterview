package com.eip.chapter8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class EvenOddMergeList {

    public ListNode<Integer> evenOddMerge2(ListNode<Integer> headNode) {
        if(headNode == null)
            return headNode;

        ListNode<Integer> evenDummyHead = new ListNode<Integer>(0,null);
        ListNode<Integer> oddDummyHead = new ListNode<Integer>(0,null);

        List<ListNode<Integer>> tails = Arrays.asList(evenDummyHead,oddDummyHead);
        int turn = 0;
        for(ListNode<Integer> iterm = headNode; iterm != null ; iterm = iterm.next){
            tails.get(turn).next = iterm;
            tails.set(turn, tails.get(turn).next);
            turn ^=1;
        }

        tails.get(1).next = null;
        tails.get(0).next = oddDummyHead.next;
        return evenDummyHead.next;
    }
    public ListNode<Integer> evenOddMerge(ListNode<Integer> headNode) {
        ListNode<Integer> tempNode = headNode;
        ListNode<Integer> oddHead = tempNode;
        tempNode = tempNode.next;
        ListNode<Integer> evenHead = tempNode;
        tempNode = tempNode.next;
        boolean isOdd = true;
        ListNode<Integer> originalEvenNode = evenHead;

        while (tempNode != null) {
            if (isOdd) {
                oddHead.next = tempNode;
                oddHead = oddHead.next;
                isOdd = false;
            } else {
                evenHead.next = tempNode;
                evenHead = evenHead.next;
                isOdd = true;
            }
            tempNode = tempNode.next;
        }
        oddHead.next = originalEvenNode;
        return headNode;
    }
}
