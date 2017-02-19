package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class HeightBalancedTest {
    HeightBalanced heightBalanced;

    BinaryTreeNode<Integer> rootNode;

    @Before
    public void setup(){
        heightBalanced = new HeightBalanced();

    }

    @Test
    public void unbalancedTreeTest(){
        rootNode = new BinaryTreeNode<Integer>(314);
        rootNode.left = new BinaryTreeNode<Integer>(6);
        rootNode.right = new BinaryTreeNode<Integer>(6);
        rootNode.left.left = new BinaryTreeNode<Integer>(271);
        rootNode.left.left.left = new BinaryTreeNode<Integer>(28);
        rootNode.left.left.right = new BinaryTreeNode<Integer>(0);
        rootNode.left.right = new BinaryTreeNode<Integer>(561);
        rootNode.left.right.right = new BinaryTreeNode<Integer>(3);
        rootNode.left.right.right.left = new BinaryTreeNode<Integer>(17);

        rootNode.right.left = new BinaryTreeNode<Integer>(2);
        rootNode.right.left.right = new BinaryTreeNode<Integer>(1);
        rootNode.right.left.right.left = new BinaryTreeNode<Integer>(401);
        rootNode.right.left.right.right = new BinaryTreeNode<Integer>(257);
        rootNode.right.left.right.left = new BinaryTreeNode<Integer>(401);
        rootNode.right.left.right.left.right = new BinaryTreeNode<Integer>(641);
        rootNode.right.right = new BinaryTreeNode<Integer>(271);
        rootNode.right.right.right = new BinaryTreeNode<Integer>(28);

        System.out.println(" heightBalanced -> " +heightBalanced.checkBalanced(rootNode));
        assert !heightBalanced.isBalanced(rootNode);
    }

    @Test
    public void balancedTreeTest(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(314);
        root.left = new BinaryTreeNode<Integer>(6);
        root.right = new BinaryTreeNode<Integer>(6);
        root.left.right = new BinaryTreeNode<Integer>(2);
        root.right.left = new BinaryTreeNode<Integer>(2);


        assert heightBalanced.isBalanced(root);
    }

}
