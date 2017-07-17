package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class RemoveDuplicatesFromSortedList {
    /*
    Problem: Remove duplicates from sorted linked list
     */
    public void removeDuplicates(ListNode<Integer> header) {
        ListNode<Integer> next = header;

        while (next !=null && next.next != null){
            if(next.data == next.next.data)
                next.next = next.next.next;
            next = next.next;
        }
    }

    public void removeDuplicates2(ListNode<Integer> header) {
        ListNode<Integer> iter = header;

        // At every node iterate to find out next distnct node and point current.next to tha node
        while (iter != null){
            ListNode<Integer> distinct = iter.next;
            // Iterate through nodes till you find next distinct node
            while (distinct != null && iter.data == distinct.data ){
                distinct = distinct.next;
            }
            //Point node.next to distinct node
            iter.next = distinct;
            iter = iter.next;
        }
    }

    /*
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
    }*/

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
