package com.eip.chapter10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by sunilpatil on 2/17/17.
 */
public class LCAParentBinaryTree {

    public BinaryTree<Integer> lca(BinaryTree<Integer> node0,
                                   BinaryTree<Integer> node1) {
        int depth0 = getDepth(node0);
        int depth1 = getDepth(node1);

        if(depth1 > depth0){
            BinaryTree<Integer> temp = node0;
            node0 = node1;
            node1 = temp;
        }

        int depthDiff = Math.abs(depth0 - depth1);
        while(depthDiff --> 0)
            node0 = node0.parent;

        while(node0 != node1){
            node0 = node0.parent;
            node1 = node1.parent;
        }
        return node0;
    }

    public int getDepth(BinaryTree<Integer> node) {
        int depth = 0;
        while (node.parent != null) {
            ++depth;
            node = node.parent;

        }
        return depth;
    }


    public BinaryTree<Integer> lca2(BinaryTree<Integer> node0,
                                    BinaryTree<Integer> node1) {
        List<BinaryTree<Integer>> firstPathList = new ArrayList<BinaryTree<Integer>>();
        leafToParenPath(node0, firstPathList);
        System.out.println("FirstPathList " + firstPathList);
        List<BinaryTree<Integer>> secondPathList = new ArrayList<BinaryTree<Integer>>();
        leafToParenPath(node1, secondPathList);
        System.out.println("secondPathList " + secondPathList);

        int firstSize = firstPathList.size() - 1;
        int secondSize = secondPathList.size() - 1;

        while (firstPathList.get(firstSize).equals(secondPathList.get(secondSize))) {
            firstSize--;
            secondSize--;
        }

        return firstPathList.get(firstSize + 1);
    }

    private List<BinaryTree<Integer>> leafToParenPath(BinaryTree<Integer> node, List<BinaryTree<Integer>> pathList) {
        if (node == null)
            return pathList;
        pathList.add(node);
        return leafToParenPath(node.parent, pathList);
    }
}
