package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ConstructFromPreOrderTraversalTest {
    ConstructFromPreOrderTraversal constructFromPreOrderTraversal;

    @Before
    public void setup(){
        constructFromPreOrderTraversal = new ConstructFromPreOrderTraversal();
    }

  /*  @Test
    public void simpleTest(){
        List<String> nodeList = Arrays.asList("H","B","F",null,null,"E","A",null,null,null,"C",null,"D",null,"G","I",null,null,null);
        BinaryTreeNode<String> tree =constructFromPreOrderTraversal.reconstructPreorder(nodeList);
        BTreePrinter.printNode(tree);
        System.out.println(tree);
    }*/
}
