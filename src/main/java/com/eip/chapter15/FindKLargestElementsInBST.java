package com.eip.chapter15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class FindKLargestElementsInBST {

    public List<Integer> findKLargestInBst(BSTNode<Integer> tree, int k) {
        List<Integer> returnList = new ArrayList<Integer>();
        inOrderTraversal(tree, returnList);
        System.out.println(returnList);
        return returnList.subList(returnList.size() - (k ), returnList.size() );
    }

    public void inOrderTraversal(BSTNode<Integer> tree, List<Integer> nodeList) {
        if (tree == null)
            return;
        inOrderTraversal(tree.right, nodeList);
        nodeList.add(tree.data);
        inOrderTraversal(tree.left, nodeList);
    }
}
