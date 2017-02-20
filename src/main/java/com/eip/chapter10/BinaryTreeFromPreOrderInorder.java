package com.eip.chapter10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunilpatil on 2/19/17.
 */
public class BinaryTreeFromPreOrderInorder {

    public BinaryTreeNode<String> binaryTreeFromPreorderInorder(
            List<String> preorder, List<String> inorder){
        Map<String,Integer> nodeToInorderIdx = new HashMap<String,Integer>();
        for(int i = 0 ; i < inorder.size();i++){
            nodeToInorderIdx.put(inorder.get(i),i);
        }
        return null;
    }

    public BinaryTreeNode<String> binaryTreeFromPreorderInorderHelper(
            List<Integer> preOrder, int preOrderStart, int preOrderEnd,
            int inOrderStart, int inOrderEnd,
            Map<String,Integer> nodeToInorderIdIndex){
                if( preOrderEnd <= preOrderStart || inOrderEnd <= inOrderStart)
                    return null;
                Integer rootInorderIdx = nodeToInorderIdIndex.get(preOrder.get(preOrderStart));
                int leftSubtreeSize = rootInorderIdx - inOrderStart;

                return null;
    }

}
