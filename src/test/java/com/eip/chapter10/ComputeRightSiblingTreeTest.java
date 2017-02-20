package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ComputeRightSiblingTreeTest {
    ComputeRightSiblingTree computeRightSiblingTree;
    BinaryTreeNode<String> rootNode;

    @Before
    public void setup(){
        computeRightSiblingTree = new ComputeRightSiblingTree();
        rootNode = new BinaryTreeNode<String>("A");
        rootNode.left = new BinaryTreeNode<String>("B");
        rootNode.left.left = new BinaryTreeNode<String>("C");
        rootNode.right = new BinaryTreeNode<String>("D");
        rootNode.right.left = new BinaryTreeNode<String>("E");
        rootNode.right.right = new BinaryTreeNode<String>("G");
        rootNode.right.left.left = new BinaryTreeNode<String>("F");
        rootNode.right.right.left = new BinaryTreeNode<String>("H");
        rootNode.right.right.right = new BinaryTreeNode<String>("I");

    }

    @Test
    public void simpleTest(){
        computeRightSiblingTree.constructRightSibling2(rootNode);
        assert rootNode.left.left.rightSibling.equals(rootNode.right.left);
        assert rootNode.right.left.rightSibling.equals(rootNode.right.right);
        assert rootNode.right.right.rightSibling == null;

    }
}
