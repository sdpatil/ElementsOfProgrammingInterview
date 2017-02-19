package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/17/17.
 */
public class LCABinaryTree {

    private static class Status {
        public int numTargetNodes;
        public BinaryTreeNode<Integer> ancestor;

        public Status(int numTargetNodes, BinaryTreeNode<Integer> ancestor) {
            this.numTargetNodes = numTargetNodes;
            this.ancestor = ancestor;
        }
    }


    public BinaryTreeNode<Integer> computeLCA(BinaryTreeNode<Integer> root,
                                              BinaryTreeNode<Integer> node0,
                                              BinaryTreeNode<Integer> node1) {
        return lcaHelper(root, node0, node1).ancestor;
    }

    public Status lcaHelper(BinaryTreeNode<Integer> root,
                            BinaryTreeNode<Integer> node0,
                            BinaryTreeNode<Integer> node1) {

        if (root == null)
            return new Status(0, null);

        Status leftResult = lcaHelper(root.left, node0, node1);
        if (leftResult.numTargetNodes == 2)
            return leftResult;

        Status rightResult = lcaHelper(root.right, node0, node1);
        if (rightResult.numTargetNodes == 2)
            return rightResult;

        int numTargetNodes = leftResult.numTargetNodes + rightResult.numTargetNodes;
        if (root == node0)
            numTargetNodes = numTargetNodes + 1;
        else if (root == node1)
            numTargetNodes = numTargetNodes + 1;

        return new Status(numTargetNodes, numTargetNodes == 2 ? root : null);
    }
}
