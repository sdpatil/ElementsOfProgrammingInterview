package com.eip.chapter9;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class JumpOrder {
    private static class PostingListNode{
        int order = -1;
        PostingListNode jump;
        PostingListNode next;
    }

    public void setJumpOrder(PostingListNode L){
        setJumpOrder(L,0);
    }

    public int setJumpOrder(PostingListNode L, int order){
        if(L != null && L.order != -1 ){
            L.order = order++;
            order = setJumpOrder(L.jump,order);
            order = setJumpOrder(L.next, order);
        }
        return order;
    }
}
