package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class HeightBalanced {
    private static class BalanceStatusWithHeight {
        public boolean isBalanced;
        private int height;
        public BalanceStatusWithHeight(boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
        @Override
        public String toString() {
            return "BalanceStatusWithHeight{" +
                    "isBalanced=" + isBalanced +
                    ", height=" + height +
                    '}';
        }
    }

    public boolean isBalanced(BinaryTreeNode<Integer> tree) {
        return checkBalanced(tree).isBalanced;
    }

    public BalanceStatusWithHeight checkBalanced(BinaryTreeNode<Integer> treeNode) {
        if (treeNode == null) { // If this is end return balanced true and height 1
            return new BalanceStatusWithHeight(true, 1);
        }
        //Check if left child is balanced
        BalanceStatusWithHeight leftBalance = checkBalanced(treeNode.left);
        if (!leftBalance.isBalanced)
            return leftBalance;
        //Check if right child is balanced
        BalanceStatusWithHeight rightBalance = checkBalanced(treeNode.right);
        if (!rightBalance.isBalanced)
            return rightBalance;

        // Is there a difference of more than one between heights of right and left child tree, if yes that means
        // tree is not balanced
        boolean isBalanced = Math.abs(leftBalance.height - rightBalance.height) <= 1;
        //Pickup the max height and return it
        int height = Math.max(leftBalance.height, rightBalance.height) + 1;
        return new BalanceStatusWithHeight(isBalanced, height);
    }
}
