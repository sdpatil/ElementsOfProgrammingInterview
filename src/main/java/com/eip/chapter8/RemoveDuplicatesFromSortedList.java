package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class RemoveDuplicatesFromSortedList {

    /*
       Problem: Remove duplicates from sorted linked list
        */
    public void removeDuplicates2(ListNode<Integer> header) {
        ListNode<Integer> iter = header;

        // At every node iterate to find out next distnct node and point current.next to that node
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


}
