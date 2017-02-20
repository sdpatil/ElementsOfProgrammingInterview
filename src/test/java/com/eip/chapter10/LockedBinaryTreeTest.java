package com.eip.chapter10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class LockedBinaryTreeTest {
    LockedBinaryTree root;

    @Before
    public void setup() {
        root = new LockedBinaryTree(314, null);

        root.left = new LockedBinaryTree(6, root);
        root.left.left = new LockedBinaryTree(271, root.left);
        root.left.left.left = new LockedBinaryTree(28, root.left.left);
        root.left.left.right = new LockedBinaryTree(6, root.left.left);
        root.left.right = new LockedBinaryTree(561, root.left);
        root.left.right.right = new LockedBinaryTree(3, root.left.right);
        root.left.right.right.left = new LockedBinaryTree(17, root.left.right);

        root.right = new LockedBinaryTree(6, root);
    }

    @Test
    public void simpleTest() {
        assert root.left.left.lock();

        //All the descendants are locked
        assert root.left.left.isLocked();
        assert !root.left.lock();
        assert !root.lock();

        //All the childrens are locked
        assert !root.left.left.left.lock();
        assert !root.left.left.right.lock();

        //Parent siblings are not locked
        //  assert root.right.lock();

        assert root.left.right.lock();

    }
}
