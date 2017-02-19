package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class SumRootToLeafPathsTest {
    SumRootToLeafPaths sumRootToLeafPaths;

    @Before
    public void setup(){
        sumRootToLeafPaths = new SumRootToLeafPaths();
    }

    @Test
    public void simpleTest(){
        BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<Integer>(1);
        rootNode.left =new BinaryTreeNode<Integer>(0);
        rootNode.right =new BinaryTreeNode<Integer>(1);

        rootNode.left.left =new BinaryTreeNode<Integer>(0);
        rootNode.left.left.left =new BinaryTreeNode<Integer>(0);
        rootNode.left.left.right =new BinaryTreeNode<Integer>(1);

        rootNode.left.right =new BinaryTreeNode<Integer>(1);
        rootNode.left.right.right =new BinaryTreeNode<Integer>(1);
        rootNode.left.right.right.left =new BinaryTreeNode<Integer>(0);

        rootNode.right.left = new BinaryTreeNode<Integer>(0);
        rootNode.right.left.right = new BinaryTreeNode<Integer>(0);
        rootNode.right.left.right.left = new BinaryTreeNode<Integer>(1);
        rootNode.right.left.right.right = new BinaryTreeNode<Integer>(0);
        rootNode.right.left.right.left.right = new BinaryTreeNode<Integer>(1);

        rootNode.right.right = new BinaryTreeNode<Integer>(0);
        rootNode.right.right.right = new BinaryTreeNode<Integer>(0);

        System.out.println("Total Sum " +sumRootToLeafPaths.sumRootToLeaf(rootNode));
    }
}
