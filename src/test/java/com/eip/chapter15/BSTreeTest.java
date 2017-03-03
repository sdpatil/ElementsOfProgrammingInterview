package com.eip.chapter15;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class BSTreeTest {
    BSTNode<Integer> root = new BSTNode<Integer>(10);
    BSTree bsTree;

    @Before
    public void setup() {
        bsTree = new BSTree();
        root.left = new BSTNode<Integer>(5);
        root.right = new BSTNode<Integer>(15);

        root.left.right = new BSTNode<Integer>(7);
        root.left.left = new BSTNode<Integer>(2);

        root.right.left = new BSTNode<Integer>(13);
        root.right.right = new BSTNode<Integer>(20);

        System.out.println(root);
    }

    @Test
    public void searchTest() {
        assert bsTree.searchBST(root, 7).data == 7;
        assert bsTree.searchBST(root, 17) == null;

    }
}
