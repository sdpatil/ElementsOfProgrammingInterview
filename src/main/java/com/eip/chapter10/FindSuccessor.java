package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class FindSuccessor {
    public BinaryTree<Integer> findSuccessor(BinaryTree<Integer> node){
        BinaryTree<Integer> returnNode = node;

        if(returnNode.right != null) {
            returnNode = returnNode.right;
            while(returnNode.left != null)
                returnNode = returnNode.left;
            return returnNode;
        }

        while ( returnNode.parent != null && returnNode.parent.right == returnNode)
            returnNode = returnNode.parent;

        return returnNode.parent;
    }
}
