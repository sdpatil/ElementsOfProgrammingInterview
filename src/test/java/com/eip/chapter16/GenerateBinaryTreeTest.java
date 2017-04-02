package com.eip.chapter16;

import com.eip.chapter15.BSTNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 4/1/17.
 */
public class GenerateBinaryTreeTest {
    GenerateBinaryTree generateBinaryTree;

    @Before
    public void setup(){
        generateBinaryTree = new GenerateBinaryTree();
    }

    @Test
    public void simpleTest(){
        List<BSTNode<Integer>> rootList= generateBinaryTree.generateAllBinaryTrees(3);

        for(BSTNode<Integer> root: rootList){
            System.out.println(root);
        }
    }
}
