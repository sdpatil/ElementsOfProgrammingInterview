package com.eip.chapter10;

/**
 * Created by sunilpatil on 2/16/17.
 */
public class HeightBalanced {
    private static class BalanceStatusWithHeight{
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

    public boolean isBalanced(BinaryTreeNode<Integer> tree){
        return checkBalanced(tree).isBalanced;
    }

    public BalanceStatusWithHeight checkBalanced(BinaryTreeNode<Integer> treeNode){
        if(treeNode == null){
            return new BalanceStatusWithHeight(true,1);
        }

        BalanceStatusWithHeight leftBalance = checkBalanced(treeNode.left);
        if(!leftBalance.isBalanced)
            return leftBalance;
        BalanceStatusWithHeight rightBalance = checkBalanced(treeNode.right);
        if(!rightBalance.isBalanced)
            return rightBalance;

        boolean isBalanced = Math.abs(leftBalance.height -rightBalance.height) <= 1;
        int height = Math.max(leftBalance.height, rightBalance.height)+1;
        return new BalanceStatusWithHeight(isBalanced,height);
    }
}
