package com.eip.chapter10;

import java.util.*;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class ComputeRightSiblingTree {

    public void constructRightSibling(BinaryTreeNode<String> treeNode){
        BinaryTreeNode<String> leftStart = treeNode;

        while(leftStart != null && leftStart.left != null){
            populateLowerLevelNextField(leftStart);
            leftStart = leftStart.left;
        }
    }

    private void populateLowerLevelNextField(BinaryTreeNode<String> startNode){

        BinaryTreeNode<String> iter = startNode;
        while(iter != null){
            iter.left.rightSibling = iter.right;
            if(iter.rightSibling != null){
                iter.right.rightSibling = iter.rightSibling.left;
            }
            iter = iter.rightSibling;
        }
    }
    public void constructRightSibling2(BinaryTreeNode<String> treeNode){
        HashMap<Integer,List<BinaryTreeNode<String>>> depthOfNodesMap = new HashMap<Integer, List<BinaryTreeNode<String>>>();
        depthHelper(treeNode,depthOfNodesMap,0,0);

        Iterator<List<BinaryTreeNode<String>>> valuesIt = depthOfNodesMap.values().iterator();
        while(valuesIt.hasNext()){
            List<BinaryTreeNode<String>> currentValue = valuesIt.next();
            Collections.sort(currentValue, new Comparator<BinaryTreeNode<String>>() {
                public int compare(BinaryTreeNode<String> o1, BinaryTreeNode<String> o2) {
                    return Integer.compare(o1.inOrder, o2.inOrder);
                }
            });
            for(int i = 0; i < currentValue.size() -1; i++){
                currentValue.get(i).rightSibling = currentValue.get(i+1);
            }
        }
        System.out.println(depthOfNodesMap);
     }

    public void depthHelper(BinaryTreeNode<String> treeNode,
                            HashMap<Integer,List<BinaryTreeNode<String>>> depthOfNodesMap,
                            int depth,
                            int accessCount ){
        if(treeNode == null){
            return;
        }

        accessCount = accessCount+1;
        treeNode.inOrder = accessCount;
        if(depthOfNodesMap.get(depth) == null){
            depthOfNodesMap.put(depth,new ArrayList<BinaryTreeNode<String>>());
        }
        depthOfNodesMap.get(depth).add(treeNode);

        if(treeNode.left != null) {
            depthHelper(treeNode.left,depthOfNodesMap, depth+1, accessCount);
        }

        if(treeNode.right != null)
            depthHelper(treeNode.right,depthOfNodesMap, depth+1, accessCount);

    }
}
