package com.eip.chapter9;

import com.eip.chapter10.BTreePrinter;
import com.eip.chapter10.BinaryTree;
import com.eip.chapter6.BinaryTreeDepthOrder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class BinaryTreeDepthOrderTest {
    BinaryTreeDepthOrder binaryTreeDepthOrder;
    BinaryTree<Integer> rootNode = null;
    @Before
    public void setup(){
        binaryTreeDepthOrder = new BinaryTreeDepthOrder();
        rootNode =new BinaryTree<Integer>(314,null);

        rootNode.left = new BinaryTree<Integer>(6,rootNode);
        rootNode.left.left = new BinaryTree<Integer>(271,rootNode.left);
        rootNode.left.left.left = new BinaryTree<Integer>(28,rootNode.left.left);
        rootNode.left.left.right = new BinaryTree<Integer>(0,rootNode.left.left);
        rootNode.left.right = new BinaryTree<Integer>(561,rootNode.left);
        rootNode.left.right.right = new BinaryTree<Integer>(3,rootNode.left.right);
        rootNode.left.right.right.left = new BinaryTree<Integer>(17,rootNode.left.right.right);

        rootNode.right = new BinaryTree<Integer>(6,rootNode);
        rootNode.right.left = new BinaryTree<Integer>(2,rootNode.right);
        rootNode.right.left.right = new BinaryTree<Integer>(1,rootNode.right.left);
        rootNode.right.left.right.left = new BinaryTree<Integer>(401,rootNode.right.left.right);
        rootNode.right.left.right.left.right = new BinaryTree<Integer>(641,rootNode.right.left.right.left);
        rootNode.right.left.right.right = new BinaryTree<Integer>(257,rootNode.right.left.right);

        rootNode.right.right = new BinaryTree<Integer>(271,rootNode.right);
        rootNode.right.right.right = new BinaryTree<Integer>(28,rootNode.right.right);
    }

    @Test
    public void simpleTest(){
        List<List<Integer>> depthOrderList  = binaryTreeDepthOrder.binaryTreeDepthOrder(rootNode);
        for(List<Integer> depthOrder: depthOrderList)
            System.out.println(depthOrder);

    }
}


