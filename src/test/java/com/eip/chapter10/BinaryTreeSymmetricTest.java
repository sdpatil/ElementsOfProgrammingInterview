package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class BinaryTreeSymmetricTest {
    BinaryTreeSymmetric binaryTreeSymmetric;

    @Before
    public void setup(){
        binaryTreeSymmetric = new BinaryTreeSymmetric();
    }

    @Test
    public void positiveTest(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(314);
        root.left = new BinaryTreeNode<Integer>(6);
        root.right = new BinaryTreeNode<Integer>(6);

        assert  binaryTreeSymmetric.isSymmetric(root);

        root.left.right = new BinaryTreeNode<Integer>(2);
        root.right.left = new BinaryTreeNode<Integer>(2);

        assert  binaryTreeSymmetric.isSymmetric(root);

        root.left.right.right = new BinaryTreeNode<Integer>(3);
        root.right.left.left = new BinaryTreeNode<Integer>(3);

        assert binaryTreeSymmetric.isSymmetric(root);
    }

    @Test
    public void negativeTest(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(314);
        root.left = new BinaryTreeNode<Integer>(6);
        root.right = new BinaryTreeNode<Integer>(6);

        assert  binaryTreeSymmetric.isSymmetric(root);

        root.left.right = new BinaryTreeNode<Integer>(561);
        root.right.left = new BinaryTreeNode<Integer>(2);

        assert  !binaryTreeSymmetric.isSymmetric(root);

        root.left.right.right = new BinaryTreeNode<Integer>(3);
        root.right.left.left = new BinaryTreeNode<Integer>(1);

        assert !binaryTreeSymmetric.isSymmetric(root);
    }

    @Test
    public void negative2Test(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(314);
        root.left = new BinaryTreeNode<Integer>(6);
        root.right = new BinaryTreeNode<Integer>(6);

        assert  binaryTreeSymmetric.isSymmetric(root);

        root.left.right = new BinaryTreeNode<Integer>(561);
        root.right.left = new BinaryTreeNode<Integer>(561);

       // assert  binaryTreeSymmetric.isSymmetric(root);

        root.left.right.right = new BinaryTreeNode<Integer>(3);

        assert !binaryTreeSymmetric.isSymmetric(root);
    }
}
