package com.eip.chapter15;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by sunilpatil on 3/1/17.
 */
public class FindFirstGreaterThanKTest {
    BSTNode<Integer> rootNode;
    FindFirstGreaterThanK findFirstGreaterThanK;
    @Before
    public void setup(){
        findFirstGreaterThanK = new FindFirstGreaterThanK();
        rootNode = new BSTNode<Integer>(19);
        rootNode.left = new BSTNode<Integer>(7);
        rootNode.left.left = new BSTNode<Integer>(3);
        rootNode.left.right = new BSTNode<Integer>(11);
        rootNode.left.right.right = new BSTNode<Integer>(17);
        rootNode.left.right.right.left = new BSTNode<Integer>(13);
        rootNode.left.left.left = new BSTNode<Integer>(2);
        rootNode.left.left.right = new BSTNode<Integer>(5);

        rootNode.right = new BSTNode<Integer>(43);
        rootNode.right.left = new BSTNode<Integer>(23);
        rootNode.right.right = new BSTNode<Integer>(47);
        rootNode.right.left.right = new BSTNode<Integer>(37);
        rootNode.right.left.right.left = new BSTNode<Integer>(29);
        rootNode.right.left.right.right = new BSTNode<Integer>(41);
        rootNode.right.left.right.left.right = new BSTNode<Integer>(31);
        rootNode.right.right = new BSTNode<Integer>(47);
        rootNode.right.right.right = new BSTNode<Integer>(53);
    }

    @Test
    public void simpleTest(){
        BSTNode<Integer> greaterNode = findFirstGreaterThanK.findFirstGreaterThanK(rootNode,23);
        assert greaterNode.data == 29;
    }

    @Test
    public void greaterThanLargetTest(){
        BSTNode<Integer> greaterNode = findFirstGreaterThanK.findFirstGreaterThanK(rootNode,53);
        assert greaterNode == null;
    }

    @Test
    public void greaterThanRightTest(){
        BSTNode<Integer> greaterNode = findFirstGreaterThanK.findFirstGreaterThanK(rootNode,32);
        assert greaterNode.data == 37;
    }


    boolean tripletSum(int x, int[] a) {
        Arrays.sort(a);
        int l = a.length;
        for(int i = 0 ; i < l ;i++){
            for(int j = i+1 ; j < l; j++){
                int currentSum = a[i] + a[j];
                if( j+1 < l-1 && Arrays.binarySearch(a, j+1, l-1, x - currentSum) >= 0)
                    return true;
            }
        }
        return false;
    }

    boolean checkPalindrome(String inputString) {
        char[] c = inputString.toCharArray();
        int start = 0;
        int end = c.length -1;
        while(start < end){
            if(c[start] != c[end]){
                return false;
            }
            start++;
            end --;
        }
        return true;
    }
}
