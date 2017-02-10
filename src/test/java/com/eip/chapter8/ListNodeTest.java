package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class ListNodeTest {
    LinkedList<Integer> linkedList;

    @Before
    public void setup(){
        linkedList = new LinkedList<Integer>();
    }

    @Test
    public void insertTest(){
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        System.out.println(linkedList);
    }

    @Test
    public void searchTest(){
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        System.out.println(linkedList.search(2));


        assert linkedList.search(2) != null;
        assert linkedList.search(4) == null;

    }

    @Test
    public void deleteTest(){
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        System.out.println(linkedList.search(2));

        linkedList.deleteNode(2);
        System.out.println(linkedList.search(3));

    }
}
