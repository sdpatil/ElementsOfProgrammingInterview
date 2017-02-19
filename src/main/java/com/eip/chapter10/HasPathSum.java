package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class HasPathSum {
    public boolean hasPathSum(BinaryTreeNode<Integer> rootNode, int targetSum) {
        return hasPathSumHelper(rootNode, targetSum, 0);
    }

    public boolean hasPathSumHelper(BinaryTreeNode<Integer> rootNode, int targetSum, int currentPathSum) {
        if (rootNode == null)
            return false;
        currentPathSum = currentPathSum + rootNode.data;
        if ( rootNode.left == null && rootNode.right == null)
            return currentPathSum == targetSum ;
        else {
            return hasPathSumHelper(rootNode.left, targetSum, currentPathSum) || hasPathSumHelper(rootNode.right, targetSum, currentPathSum);

        }

    }
}
