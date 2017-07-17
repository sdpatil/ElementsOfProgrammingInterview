package com.eip.chapter9;

import java.util.Stack;

/**
 * Problem: Calculate jump order of a linked list
 * Solution: Maintain a stack of next nodes, every time you pull element from stack
 * push its next node on the stack first before its jump node. Also everytime you pull
 * node from stack use it to calculate its jump order
 */
public class JumpOrder {
    private static class PostingListNode{
        int order = -1;
        PostingListNode jump;
        PostingListNode next;
    }

    public void setJumpOrder(PostingListNode L){

        Stack<PostingListNode> stack = new Stack<>();
        int order = 0;
        stack.push(L);
        while (!stack.isEmpty()){
            PostingListNode current = stack.pop();
            if(current != null && current.order == -1){
                current.order = order++;
                stack.push(current.next);
                stack.push(current.jump);
            }
        }
    }

}
