package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class BinaryTreeFromPreOrderInorderTest {
    BinaryTreeFromPreOrderInorder binaryTreeFromPreOrderInorder;

    @Before
    public void setup(){
        binaryTreeFromPreOrderInorder = new BinaryTreeFromPreOrderInorder();
    }
/*
    @Test
    public void simpleTest(){
        BinaryTreeNode<String> aNode = new BinaryTreeNode<String>("A");
        BinaryTreeNode<String> bNode = new BinaryTreeNode<String>("B");
        BinaryTreeNode<String> cNode = new BinaryTreeNode<String>("C");
        BinaryTreeNode<String> dNode = new BinaryTreeNode<String>("D");
        BinaryTreeNode<String> eNode = new BinaryTreeNode<String>("E");
        BinaryTreeNode<String> fNode = new BinaryTreeNode<String>("F");
        BinaryTreeNode<String> gNode = new BinaryTreeNode<String>("G");
        BinaryTreeNode<String> hNode = new BinaryTreeNode<String>("H");
        BinaryTreeNode<String> iNode = new BinaryTreeNode<String>("I");

        List<BinaryTreeNode<String>> inOrderList = Arrays.asList(
                fNode,bNode,aNode,eNode,hNode,cNode,dNode,iNode,gNode
                );

        List<BinaryTreeNode<String>> preOrderList = Arrays.asList(
                hNode,bNode,fNode,eNode,aNode,cNode,dNode,gNode,iNode
        );

        binaryTreeFromPreOrderInorder.binaryTreeFromPreorderInorder(preOrderList,inOrderList);
    }*/
}
