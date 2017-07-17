package com.eip.chapter8;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class TestForCyclicity {

    /*
        Problem:- Given a linked list find if it has a cycle if yes, return start of cycle
        Solution:- Use a slow and fast pointer, faster pointer should advance at twice the rate
         of slow pointer. if they meet then that means there is a cycle

         Once cycle is found, reset slow to head and move slow and fast pointer at the same
         speed. The point at which both meet is start of cycle
     */
    public ListNode<Integer> hasCycle(ListNode<Integer> head) {
        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;
        while (fast !=null && fast.next != null){
            slow = slow.next;   // Advance one node
            fast = fast.next.next; // Advance two nodes
            if(slow == fast){ //Found cycle, reset slow to head
                slow = head;
                while (slow != fast){ // When two nodes meet thats the start of cycle
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}