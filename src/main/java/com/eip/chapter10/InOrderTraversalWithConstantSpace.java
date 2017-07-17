package com.eip.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class InOrderTraversalWithConstantSpace {

    public void inOrderTraversal2(BinaryTree<Integer> tree) {
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

    /*
    Problem: Perform in order traversal of binary tree without using recursion or stack (No space)
     */
    public void inOrderTraversal(BinaryTree<Integer> tree) {
        BinaryTree<Integer> prev = null;
        BinaryTree<Integer> current = tree;
        List<Integer> result = new ArrayList<>();
        while (current != null){
            BinaryTree<Integer> next;
            // If previous node equal to parent means we are in the left ree
            if(current.parent == prev){
                //Start iterating through the left side tree
                if(current.left != null) {
                    next = current.left;
                }else{
                    result.add(current.data);
                    next = ( current.right != null ? current:current.parent);
                }
            }else if(prev == current.left){
                // If previous is current.left that means we just finished going through left node
                // so add current data to list and start moving in right direction
                result.add(current.data);
                next = ( current.right != null ? current:current.parent);
            }else{
                //Done with both right and left sibling so move up
                next = current.parent;
            }
            prev = current;
            current = next;
        }
    }
}