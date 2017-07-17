package com.eip.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ListOfLeafs {

    /*
    public List<BinaryTreeNode<String>> createListOfLeaves(BinaryTreeNode root) {
        List<BinaryTreeNode<String>> returnList = new ArrayList<BinaryTreeNode<String>>();
        createListOfLeavesHelper(root, returnList);
        return returnList;
    }

    public void createListOfLeavesHelper(BinaryTreeNode<String> root, List<BinaryTreeNode<String>> list) {
        if (root == null)
            return;
        createListOfLeavesHelper(root.left, list);
        if (root.right == null && root.left == null)
            System.out.println(root.data);
        createListOfLeavesHelper(root.right, list);
    }
*/
    /*
    Problem: Create list of leaf nodes in left to right order

    Solution: In the basic tree traversal check if both left and right child are null, if yes
    add it to return list
     */
    public List<BinaryTreeNode<Integer>> createListOfLeaves(BinaryTreeNode<Integer> root) {
        List<BinaryTreeNode<Integer>> resultList = new ArrayList<>();
        createListOfLeavesHelper(root,resultList);
        return resultList;
    }

    public void createListOfLeavesHelper(BinaryTreeNode<Integer> root,
                                                            List<BinaryTreeNode<Integer>> nodeList) {
        if(root != null){
            if(root.left == null && root.right == null){
                nodeList.add(root);
            }else{
                createListOfLeavesHelper(root.left,nodeList);
                createListOfLeavesHelper(root.right,nodeList);
            }
        }

    }
}