package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class TestForCyclicity {
    public ListNode<Integer> hasCycle(ListNode<Integer> head){
        ListNode<Integer> fast = head;
        ListNode<Integer> slow =head;

        while (fast != null && fast.next!=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("Found cycle " + slow.data);
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        System.out.println("Did not find cycle");

        return null;
    }
}
