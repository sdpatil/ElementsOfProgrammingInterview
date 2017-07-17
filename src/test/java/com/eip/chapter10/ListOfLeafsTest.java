package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ListOfLeafsTest {
    ListOfLeafs listOfLeafs;
    BinaryTreeNode<String> rootNode;

    @Before
    public void setup(){
        listOfLeafs = new ListOfLeafs();
        rootNode = new BinaryTreeNode<String>("A");
        rootNode.left = new BinaryTreeNode<String>("B");
        rootNode.left.left = new BinaryTreeNode<String>("C");
        rootNode.left.left.left = new BinaryTreeNode<String>("D");
        rootNode.left.left.right = new BinaryTreeNode<String>("E");
        rootNode.left.right = new BinaryTreeNode<String>("F");
        rootNode.left.right.right = new BinaryTreeNode<String>("G");
        rootNode.left.right.right.left = new BinaryTreeNode<String>("H");

        rootNode.right = new BinaryTreeNode<String>("I");
        rootNode.right.left = new BinaryTreeNode<String>("J");
        rootNode.right.left.right = new BinaryTreeNode<String>("K");
        rootNode.right.left.right.left = new BinaryTreeNode<String>("L");
        rootNode.right.left.right.right = new BinaryTreeNode<String>("N");
       // rootNode.right.left.right.left.r = new BinaryTreeNode<String>(401);
        rootNode.right.left.right.left.right = new BinaryTreeNode<String>("M");
        rootNode.right.right = new BinaryTreeNode<String>("O");
        rootNode.right.right.right = new BinaryTreeNode<String>("P");


    }

  /*  @Test
    public void simpleTest(){
        List<BinaryTreeNode<String>> listOfLeaves = listOfLeafs.createListOfLeaves(rootNode);
        System.out.println(listOfLeaves);
    }*/
}

