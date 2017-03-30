package com.eip.chapter15;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/29/17.
 */
public class BinarySearchTreeTest {
    BinarySearchTree binarySearchTree;

    @Before
    public void setup(){
        binarySearchTree = new BinarySearchTree();
    }

    @Test
    public void insertSimpleTest(){
        binarySearchTree.insert(10);
        binarySearchTree.insert(8);
        binarySearchTree.insert(12);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);

        System.out.println("Root " + binarySearchTree);
    }
}
