package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class BinaryTreeSymmetric {

    /*
    Binary tree is symmetric if you fold it in middle the right and left is same. or mirror image of each other
     */
    public boolean isSymmetric(BinaryTreeNode root) {
        //Call isSymmetric on left and right child
        return isSymmetric(root.left, root.right);
    }

    /*
      Check if the 2 nodes that are supplied are mirror images of each other
     */
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
