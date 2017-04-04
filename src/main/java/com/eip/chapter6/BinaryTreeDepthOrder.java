package com.eip.chapter6;

import com.eip.chapter10.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class BinaryTreeDepthOrder {

    static final class BinaryTreeDepth{
        int depth;
        BinaryTree<Integer> binaryTree;

        public BinaryTreeDepth(int depth, BinaryTree<Integer> binaryTree) {
            this.depth = depth;
            this.binaryTree = binaryTree;
        }
    }

    public List<List<Integer>> binaryTreeDepthOrder(BinaryTree rootTree){
        List<List<Integer>> depthOrderList = new ArrayList<>();

        Queue<BinaryTreeDepth> binaryTreeQueue = new LinkedList<>();

        binaryTreeQueue.add(new BinaryTreeDepth(0, rootTree));
        while (!binaryTreeQueue.isEmpty()){
            BinaryTreeDepth binaryTreeDepth = binaryTreeQueue.poll();
            if(depthOrderList.size() <= binaryTreeDepth.depth || depthOrderList.get(binaryTreeDepth.depth) == null)
                depthOrderList.add(new ArrayList<>());
            depthOrderList.get(binaryTreeDepth.depth).add(binaryTreeDepth.binaryTree.data);
            if(binaryTreeDepth.binaryTree.left != null)
                binaryTreeQueue.add(new BinaryTreeDepth(binaryTreeDepth.depth+1,binaryTreeDepth.binaryTree.left));
            if(binaryTreeDepth.binaryTree.right != null)
                binaryTreeQueue.add(new BinaryTreeDepth(binaryTreeDepth.depth+1,binaryTreeDepth.binaryTree.right));
        }
        return depthOrderList;
    }
}
