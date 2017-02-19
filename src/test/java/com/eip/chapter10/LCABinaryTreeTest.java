package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/17/17.
 */
public class LCABinaryTreeTest {

    LCABinaryTree lcaBinaryTree;
    BinaryTreeNode<Integer> rootNode;
    @Before
    public void setup(){
        lcaBinaryTree = new LCABinaryTree();

        rootNode = new BinaryTreeNode<Integer>(314);
        rootNode.left = new BinaryTreeNode<Integer>(6);
        rootNode.right = new BinaryTreeNode<Integer>(60);
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
    }

    @Test
    public void simpleTest(){
        assert lcaBinaryTree.computeLCA(rootNode,rootNode.left, rootNode.right).equals(rootNode);
    }

    @Test
    public void simple2Test(){
        assert lcaBinaryTree.computeLCA(rootNode,rootNode.left.right.right.left, rootNode.left.left.left).equals(rootNode.left);
    }

    @Test
    public void simple3Test(){
        assert lcaBinaryTree.computeLCA(rootNode,rootNode.left.right.right.left, rootNode.right.left.right.left.right).equals(rootNode);
    }
}
