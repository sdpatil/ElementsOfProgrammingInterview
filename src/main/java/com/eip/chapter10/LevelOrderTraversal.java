package com.eip.chapter10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class LevelOrderTraversal {

    public static void levelOrderTraversal(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> node = queue.poll();
            //Print current node
            System.out.print(node.data +" ");
            // Add left child to queue if its not empty
            if(node.left!= null){
                queue.add(node.left);
            }
            //Add right child to queue if its not empty
            if(node.right != null)
                queue.add(node.right);
        }
    }



    public static void main(String[] argv){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
        root.left = new BinaryTreeNode<Integer>(3);
        root.left.left = new BinaryTreeNode<Integer>(1);
        root.left.right = new BinaryTreeNode<Integer>(2);
        root.right = new BinaryTreeNode<Integer>(7);
        root.right.left = new BinaryTreeNode<Integer>(6);
        root.right.right = new BinaryTreeNode<Integer>(8);
        levelOrderTraversal(root);
    }
    /**
     *          1
     *    2
     */
}
