package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class RemoveDuplicatesFromSortedList {
    public void removeDuplicates(ListNode<Integer> header){
        ListNode<Integer> next = header;

        ListNode<Integer> nextNode = next.next;
        while(next != null){
            while(nextNode!= null && next.data == nextNode.data)
                nextNode = nextNode.next;
            next.next = nextNode;
            next = nextNode;

            //nextNode = next.next;
        }
    }

    int length(ListNode<Integer> node){
        int length = 0;
        ListNode<Integer> next = node;
        while(next != null){
            length = length+1;
            next = next.next;
        }
        return length;
    }
}
