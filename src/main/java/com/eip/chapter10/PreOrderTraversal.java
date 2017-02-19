package com.eip.chapter10;

import java.util.List;
import java.util.Stack;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class PreOrderTraversal {
    public void preOrderTraversal(BinaryTreeNode<Integer> binaryTreeNode) {
        Stack<BinaryTreeNode<Integer>> stack = new Stack<BinaryTreeNode<Integer>>();
        stack.push(binaryTreeNode);

        while(!stack.isEmpty()){
            BinaryTreeNode<Integer> curr = stack.pop();
            if(curr != null){
                System.out.print(curr.data +" ");
                stack.push(curr.right);
                stack.push(curr.left);
            }
        }
    }
}
