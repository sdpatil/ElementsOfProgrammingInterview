package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class SumRootToLeafPaths {

    public int sumRootToLeaf2(BinaryTreeNode<Integer> tree) {
       return sumRootToLeaf2(tree, "");
    }

    public int sumRootToLeaf2(BinaryTreeNode<Integer> tree, String path) {
        if (tree.left == null && tree.right == null) {
            path = path + "" + tree.data;
            System.out.println("Found leaf node return path " + Integer.parseInt(path, 2));
              return Integer.parseInt(path,2);
        } else {
            path = path + "" + tree.data;
            int sum = 0;
            if (tree.left != null)
               sum =sum+ sumRootToLeaf2(tree.left, path);
            if (tree.right != null)
                sum = sum + sumRootToLeaf2(tree.right, path);
            return sum;
        }
    }

    public int sumRootToLeaf(BinaryTreeNode<Integer> tree){
        return sumRootToLeafHelper(tree,0);
    }

    public int sumRootToLeafHelper(BinaryTreeNode<Integer> tree, int partialPathSum){
        if(tree == null)
            return 0;
        partialPathSum = partialPathSum*2+tree.data;
        if(tree.left == null && tree.right == null){
            return partialPathSum;
        }

        return sumRootToLeafHelper(tree.left,partialPathSum) + sumRootToLeafHelper(tree.right,partialPathSum);
    }
}
