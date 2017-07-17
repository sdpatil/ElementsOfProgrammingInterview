package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class FindSuccessor {
    public BinaryTree<Integer> findSuccessor2(BinaryTree<Integer> node) {
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
    Problem : FInd successor of a node in inorder traversal
     */
    public BinaryTree<Integer> findSuccessor(BinaryTree<Integer> node) {
        BinaryTree<Integer> next = node;
        //If the node has a right child then go to right child and find the first node by following left children

        if(next.right != null){
            next = next.right;
            while (next.left!= null)
                next = next.left;
            return next;
        }
        //If the node does not have right child, then go up the parent chain till the node is not right child of its parent
        while (next.parent != null && next.parent.right == next)
            next = next.parent;

        return next.parent;
    }
}