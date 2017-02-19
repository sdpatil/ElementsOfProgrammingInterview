package com.eip.chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class InOrderTraversal {

    public void inOrderTraversal(BinaryTreeNode<Integer> binaryTreeNode) {
        BinaryTreeNode<Integer> currentNode = binaryTreeNode;

        Stack<BinaryTreeNode<Integer>> binaryTreeNodeStack = new Stack<BinaryTreeNode<Integer>>();
        binaryTreeNodeStack.add(binaryTreeNode);

        while (!binaryTreeNodeStack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                binaryTreeNodeStack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = binaryTreeNodeStack.pop();
                System.out.println(currentNode.data);
                currentNode = currentNode.right;
            }

        }
    }
}
