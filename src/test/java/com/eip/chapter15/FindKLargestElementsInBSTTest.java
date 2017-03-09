package com.eip.chapter15;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class FindKLargestElementsInBSTTest {
    FindKLargestElementsInBST findKLargestElementsInBST;
    BSTNode<Integer> rootNode;

    @Before
    public void setup(){
        findKLargestElementsInBST = new FindKLargestElementsInBST();
        rootNode = new BSTNode<Integer>(19);
        rootNode.left = new BSTNode<Integer>(7);
        rootNode.left.left = new BSTNode<Integer>(3);
        rootNode.left.right = new BSTNode<Integer>(11);
        rootNode.left.right.right = new BSTNode<Integer>(17);
        rootNode.left.right.right.left = new BSTNode<Integer>(13);
        rootNode.left.left.left = new BSTNode<Integer>(2);
        rootNode.left.left.right = new BSTNode<Integer>(5);

        rootNode.right = new BSTNode<Integer>(43);
        rootNode.right.left = new BSTNode<Integer>(23);
        rootNode.right.right = new BSTNode<Integer>(47);
        rootNode.right.left.right = new BSTNode<Integer>(37);
        rootNode.right.left.right.left = new BSTNode<Integer>(29);
        rootNode.right.left.right.right = new BSTNode<Integer>(41);
        rootNode.right.left.right.left.right = new BSTNode<Integer>(31);
        rootNode.right.right = new BSTNode<Integer>(47);
        rootNode.right.right.right = new BSTNode<Integer>(53);
    }

    @Test
    public void simpleTest(){
       List<Integer> returnList = findKLargestElementsInBST.findKLargestInBst(rootNode,3);

        System.out.println(returnList);
    }
}
