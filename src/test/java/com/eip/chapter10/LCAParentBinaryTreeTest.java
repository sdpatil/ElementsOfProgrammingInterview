package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/17/17.
 */
public class LCAParentBinaryTreeTest {
    LCAParentBinaryTree lcaParentBinaryTree;
    BinaryTree<Integer> rootNode ;

    @Before
    public  void setup(){
        lcaParentBinaryTree = new LCAParentBinaryTree();
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
       assert  lcaParentBinaryTree.lca(rootNode.right,rootNode.left).equals(rootNode);
    }

    @Test
    public void simple2Test(){
        assert lcaParentBinaryTree.lca(rootNode.left.right.right.left,rootNode.left.left.left).equals(rootNode.left);

        assert lcaParentBinaryTree.lca(rootNode.right.left.right.left.right,rootNode.right.left.right.right).equals(rootNode.right.left.right);
    }
}
