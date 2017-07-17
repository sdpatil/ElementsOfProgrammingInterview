package com.eip.chapter10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ComputeExteriorOfBinaryTree {

    public List<BinaryTreeNode<String>> exteriorBinaryTree(BinaryTreeNode<String> tree){
        List<BinaryTreeNode<String>> result = new LinkedList<>();
        if(tree!= null){
            result.add(tree);
            result.addAll(leftBoundaryAndLeaves(tree.left, true));
            result.addAll(rightBoundaryAndLeaves(tree.right, true));

        }
        return result;
    }

    public List<BinaryTreeNode<String>> leftBoundaryAndLeaves(BinaryTreeNode<String> subTreeRoot,
                                                               boolean isBoundary){
        List<BinaryTreeNode<String>> result = new LinkedList<>();
        if(subTreeRoot != null){
            if(isBoundary || isLeaf(subTreeRoot))
                result.add(subTreeRoot);

            result.addAll(leftBoundaryAndLeaves(subTreeRoot.left,isBoundary));
            result.addAll(leftBoundaryAndLeaves(subTreeRoot.right,isBoundary && subTreeRoot.left == null));
        }
        return result;
    }

    public List<BinaryTreeNode<String>> rightBoundaryAndLeaves(BinaryTreeNode<String> subTreeRoot,
                                                               boolean isBoundary){
        List<BinaryTreeNode<String>> result = new LinkedList<>();
        if(subTreeRoot != null){
            result.addAll(rightBoundaryAndLeaves(subTreeRoot.left,isBoundary && subTreeRoot.right == null));
            result.addAll(leftBoundaryAndLeaves(subTreeRoot.right,isBoundary));
            if(isBoundary || isLeaf(subTreeRoot))
                result.add(subTreeRoot);


        }
        return result;
    }

    public boolean isLeaf(BinaryTreeNode<String> tree){
        return tree.left == null && tree.right == null;
    }
}
