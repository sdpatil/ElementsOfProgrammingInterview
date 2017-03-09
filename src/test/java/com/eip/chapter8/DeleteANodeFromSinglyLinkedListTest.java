package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class DeleteANodeFromSinglyLinkedListTest {
    DeleteANodeFromSinglyLinkedList deleteANodeFromSinglyLinkedList;
    LinkedList<Integer> linkedList;

    @Before
    public void setup(){
        deleteANodeFromSinglyLinkedList = new DeleteANodeFromSinglyLinkedList();
        linkedList = new LinkedList<Integer>();
    }

    @Test
    public void simpleTest(){
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        System.out.println(linkedList);

        ListNode<Integer> node3 = linkedList.search(3);
        System.out.println(node3);

        deleteANodeFromSinglyLinkedList.deleteFromList(node3);
        System.out.println(linkedList);
        assert node3.data == 4;
        assert node3.next.data==5;
    }
}
