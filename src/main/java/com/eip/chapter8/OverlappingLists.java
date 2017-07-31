package com.eip.chapter8;


/**
 * Created by sunilpatil on 3/8/17.
 */
public class OverlappingLists {

    /*
        Problem:- Check if two linked lists are overlapping with each other
        Solution:- Basic idea is that,if two lists overlap with each other then they will have same end point.

        1) Calculate length of both lists
        2) Find out which node is longer and by how much, advance in longer node by those many steps
        3) Now start advancing in both longer and shorter node at same speed, if you find intersection then
            thats the intersection point
     */
    public ListNode<Integer> overlappingNoCycleLists(ListNode<Integer> first, ListNode<Integer> second) {
        int lengthOfFirst = getLength(first);
        int lengthOfSecond = getLength(second);

        ListNode<Integer> longer, shorter;
        if(lengthOfFirst > lengthOfSecond){
            longer = first;
            shorter = second;
        }else{
            longer = second;
            shorter = first;
        }

        int diff = Math.abs(lengthOfFirst-lengthOfSecond);
        while (diff-- > 0){
            longer = longer.next;
        }

        while (longer != null && shorter !=null){
            if(longer == shorter)
                return longer;
            longer = longer.next;
            shorter = shorter.next;
        }
        return null;
    }

    //Calculate length of list
    public int getLength(ListNode<Integer> head){
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }
        return count;
    }
}
