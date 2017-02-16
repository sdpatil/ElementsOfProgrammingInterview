package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class BinaryTreeSymmetric {

    public boolean isSymmetric(BinaryTreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(BinaryTreeNode subtree0, BinaryTreeNode subtree1) {
        if (subtree0 == null && subtree1 == null)
            return true;
        else if (subtree0 != null && subtree1 != null) {
            return subtree0.data == subtree1.data
                    && isSymmetric(subtree0.left, subtree1.right)
                    && isSymmetric(subtree0.right, subtree1.left);
        }
        return false;
    }
}
