package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class AddListBasedIntegers {

    public ListNode<Integer> addTwoNumbers(ListNode<Integer> L1, ListNode<Integer> L2){

        ListNode<Integer> dummyHead = new ListNode<Integer>(0,null);
        int carry =0;

        ListNode<Integer> returnList = dummyHead;
        while(L1 != null || L2 != null){

            int sum =  carry;
            if(L1 != null){
                sum = sum + L1.data;
                L1 = L1.next;
            }
            if(L2 != null){
                sum = sum + L2.data;
                L2 = L2.next;
            }

            returnList.next = new ListNode<Integer>(sum %10);
            carry = sum /10;
            returnList = returnList.next;
        }
        if(carry > 0){
            returnList.next = new ListNode<Integer>(carry,null);
        }
        return dummyHead.next;
    }
}