package com.eip.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class InOrderTraversalWithConstantSpace {

    public void inOrderTraversal(BinaryTree<Integer> tree) {
        BinaryTree<Integer> prev = null, curr = tree;
        List<Integer> result = new ArrayList<Integer>();
        while (curr != null) {
            BinaryTree<Integer> next = null;
            if (curr.parent == prev) {

                if (curr.left != null) {
                    next = curr.left;
                } else {
                    result.add(curr.data);
                    next = (curr.right != null) ? curr.right : curr.parent;
                }
            } else if (curr.left == prev) {
                result.add(curr.data);
                next = (curr.right != null) ? curr.right : curr.parent;
            } else {
                next = curr.parent;
            }
            prev = curr;
            curr = next;
        }

        for (Integer i : result)
            System.out.println(i);
    }


    public BinaryTree<Integer> findSuccessor(BinaryTree<Integer> node) {
        BinaryTree<Integer> returnNode = node;

        if (returnNode.right != null) {
            returnNode = returnNode.right;
            while (returnNode.left != null)
                returnNode = returnNode.left;
            return returnNode;
        }

        while (returnNode.parent != null && returnNode.parent.right == returnNode)
            returnNode = returnNode.parent;

        return returnNode.parent;
    }
}
