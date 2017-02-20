package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class LockedBinaryTree {
    private Integer data;
    public LockedBinaryTree parent, left, right;
    private boolean locked;
    private int numLockedDescendant = 0;

    public LockedBinaryTree(Integer data, LockedBinaryTree parent) {
        this.data = data;
        this.parent = parent;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean lock() {
        if (numLockedDescendant > 0 || locked == true)
            return false;

        for (LockedBinaryTree curr = parent; curr != null; curr = curr.parent) {
            if (curr.isLocked())
                return false;
        }
        locked = true;
        for (LockedBinaryTree curr = parent; curr != null; curr = curr.parent) {
            curr.numLockedDescendant++;
        }

        return true;
    }

    public void unlock(LockedBinaryTree tree) {
        if (locked) {
            locked = false;
            for (LockedBinaryTree curr = parent; curr != null; curr = curr.parent) {
                curr.numLockedDescendant--;
            }
        }
    }

    @Override
    public String toString() {
        return "LockedBinaryTree{" +
                "data=" + data +
                '}';
    }
}
