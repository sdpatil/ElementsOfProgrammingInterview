package com.eip.chapter10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem: Calculate binary tree from preorder and inorder traversal

    Solution: First node in preorder traversal will give us the root node of tree, The root node divides the
 inOrder list into 2 parts, first part is the left sub tree and second part is the right subtree

 We can use this to implement recursive logic
 */
public class BinaryTreeFromPreOrderInorder {

    public BinaryTreeNode<Integer> binaryTreeFromPreOrderInOrder(List<Integer> preOrder, List<Integer> inOrder){
        Map<Integer,Integer> nodeToInorderIdx = new HashMap<>();
        for(int i = 0 ;i < inOrder.size() ;i++){
            nodeToInorderIdx.put(inOrder.get(i),i);
        }
        return binaryTreeFromPreOrderInOrderHelper(preOrder,0,preOrder.size(), 0, inOrder.size(), nodeToInorderIdx);
    }

    public BinaryTreeNode<Integer> binaryTreeFromPreOrderInOrderHelper(List<Integer> preOrder,
                                                                       int preOrderStart,int preOrderEnd
                                                                         ,int inOrderStart,int inOrderEnd,

                                                                       Map<Integer,Integer> nodeToInOrderIndex){
        if(preOrderEnd <= preOrderStart  || inOrderEnd <= inOrderStart)
            return null;

        int rootOrderIndex = nodeToInOrderIndex.get(preOrder.get(preOrderStart));
        int leftSubtreeSize = rootOrderIndex - inOrderStart;

        return new BinaryTreeNode<Integer>(preOrder.get(preOrderStart),
                binaryTreeFromPreOrderInOrderHelper(preOrder,preOrderStart+1, preOrderStart+ leftSubtreeSize+1,
                        inOrderStart, rootOrderIndex,nodeToInOrderIndex),
                binaryTreeFromPreOrderInOrderHelper(preOrder,preOrderStart+ leftSubtreeSize+1, preOrderEnd,
                        rootOrderIndex+1, inOrderEnd,nodeToInOrderIndex)
                );
    }
}
