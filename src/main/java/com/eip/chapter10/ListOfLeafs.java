package com.eip.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ListOfLeafs {

    public List<BinaryTreeNode<String>> createListOfLeaves(BinaryTreeNode root){
       List<BinaryTreeNode<String>> returnList = new ArrayList<BinaryTreeNode<String>>();
        createListOfLeavesHelper(root, returnList);
       return returnList;
    }

    public void createListOfLeavesHelper(BinaryTreeNode<String> root, List<BinaryTreeNode<String>> list){
        if(root == null)
            return;
        createListOfLeavesHelper(root.left,list);
        if(root.right == null && root.left == null)
            System.out.println(root.data);
        createListOfLeavesHelper(root.right,list);
    }
}
