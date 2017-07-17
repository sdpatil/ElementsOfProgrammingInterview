package com.eip.chapter8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class EvenOddMergeList {

    /*
        Problem: Given a linked list convert it so that all the even nodes are togher and odd nodes are together
        Ex. 1 -> 2 -> 3 -> 4 -> 5 should be converted to 1 ->3 ->5 -> 2 ->4
        Solution: Basic idea is to divide the even and odd nodes in two halves and keep collecting them
        Once we are done iterating merge them together by first setting next on odd to null and setting
        next on even to head of odd node
     */
    public ListNode<Integer> evenOddMerge(ListNode<Integer> rootNode){
        ListNode<Integer> evenDummyHead = new ListNode<Integer>(0);
        ListNode<Integer> oddDummyHead = new ListNode<Integer>(0);

        List<ListNode<Integer>> tails = Arrays.asList(evenDummyHead,oddDummyHead);
        int turn = 0;
        for(ListNode<Integer> iter = rootNode; iter !=null ; iter = iter.next){
            tails.get(turn).next = iter;
            tails.set(turn, tails.get(turn).next);
            turn = turn^1;
        }
        tails.get(1).next = null;
        tails.get(0).next = oddDummyHead.next;

        return evenDummyHead.next;
    }


    public ListNode<Integer> evenOddMerge2(ListNode<Integer> headNode) {
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
