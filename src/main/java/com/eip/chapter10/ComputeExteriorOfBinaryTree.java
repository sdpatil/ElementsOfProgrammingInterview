package com.eip.chapter10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ComputeExteriorOfBinaryTree {

    public List<BinaryTreeNode<String>> exteriorBinaryTree(BinaryTreeNode<String> tree){
        List<BinaryTreeNode<String>> returnList = new ArrayList<BinaryTreeNode<String>>();

        createListOfLeavesHelper(tree,returnList);
        addLeftSide(tree,returnList);
        addRightSide(tree,returnList);

        System.out.println("ReturnList " + returnList);
        return returnList;
    }

    public void createListOfLeavesHelper(BinaryTreeNode<String> root, List<BinaryTreeNode<String>> list){
        if(root == null)
            return;
        createListOfLeavesHelper(root.left,list);
        if(root.right == null && root.left == null) {
            list.add(root);
            System.out.println("Leaf Node" +root.data);
        }
        createListOfLeavesHelper(root.right,list);
    }

    public void addLeftSide(BinaryTreeNode<String> root, List<BinaryTreeNode<String>> list){
        if(root == null)
            return;
        if(list.contains(root) ==false) {
            list.add(root);
        }
        addLeftSide(root.left,list);
    }

    public void addRightSide(BinaryTreeNode<String> root, List<BinaryTreeNode<String>> list){
        if(root == null)
            return;
        if(list.contains(root) ==false)
            list.add(root);
        addLeftSide(root.right,list);
    }
}
