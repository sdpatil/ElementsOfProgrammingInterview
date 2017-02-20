package com.eip.chapter10;

import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ConstructFromPreOrderTraversal {
    private Integer subtreeIdx;

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
    }
}
