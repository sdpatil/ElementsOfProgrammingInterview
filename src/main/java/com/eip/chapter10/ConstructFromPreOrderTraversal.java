package com.eip.chapter10;

import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ConstructFromPreOrderTraversal {
    private Integer subtreeIdx;
/*
    public BinaryTreeNode<String> reconstructPreorder(List<String> preOrder){
        subtreeIdx = 0;
        return reconstructPreOrderSubtree(preOrder);
    }

    private BinaryTreeNode<String> reconstructPreOrderSubtree(List<String> preOrderList){
        String subTreeKey = preOrderList.get(subtreeIdx);
        ++subtreeIdx;
        if(subTreeKey == null)
            return null;

        BinaryTreeNode<String> leftSubTree = reconstructPreOrderSubtree(preOrderList);
        BinaryTreeNode<String> rightSubTree = reconstructPreOrderSubtree(preOrderList);
        return new BinaryTreeNode<String>(subTreeKey,leftSubTree,rightSubTree);
    }*/

    /*


        Solution
     */

    /*
        Problem: Given pre order traversal data of a binary tree where null markers are used when a node is empty
        construct binary tree
        {"H","B","F",null,null,"E","A",null,null,null,"C",null,"D",null,"G","I",null,null,null}
                       H
              / \
             /   \
            /     \
           /       \
          /         \
         /           \
        /             \
       /               \
       B               C
      / \               \
     /   \               \
    /     \               \
   /       \               \
   F       E               D
          /                 \
         /                   \
         A                   G
                            /
                            I
        Solution: In preorder traversal first comes root then left tree followed by its left tree until we hit null
        then right child. we can use this to make recursive calls like this
     */
    public BinaryTreeNode<String> reconstructPreorder(List<String> preOrder) {
        subtreeIdx = 0;
        return reconstructPreorderHelper(preOrder);
    }

    public BinaryTreeNode<String> reconstructPreorderHelper(List<String> preOrder) {
        String subTreeKey = preOrder.get(subtreeIdx);
        subtreeIdx++;
        //Found null marker so return
        if(subTreeKey == null)
            return null;
        // Create left child
        BinaryTreeNode leftChild = reconstructPreorderHelper(preOrder);
        //Create right child
        BinaryTreeNode rightChild = reconstructPreorderHelper(preOrder);
        return new BinaryTreeNode<String>(subTreeKey,leftChild,rightChild);
    }
}