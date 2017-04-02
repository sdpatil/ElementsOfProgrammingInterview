package com.eip.chapter16;

import com.eip.chapter15.BSTNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 4/1/17.
 */
public class GenerateBinaryTree {
    public List<BSTNode<Integer>> generateAllBinaryTrees(int numNodes){
        List<BSTNode<Integer>> returnList = new ArrayList<>();
        if(numNodes == 0){
            returnList.add(null);
        }

        for(int numLeftTreeNodes = 0; numLeftTreeNodes < numNodes ;++numLeftTreeNodes){
            int numRightNodes = numNodes -1 -numLeftTreeNodes;
            List<BSTNode<Integer>> leftSubTree = generateAllBinaryTrees(numLeftTreeNodes);
            List<BSTNode<Integer>> rightSubTree = generateAllBinaryTrees(numRightNodes);

            for(BSTNode<Integer> left: leftSubTree){
                for(BSTNode<Integer> right: rightSubTree){
                    returnList.add(new BSTNode<Integer>(0, left,right));
                }
            }
        }
        return returnList;
    }

}
