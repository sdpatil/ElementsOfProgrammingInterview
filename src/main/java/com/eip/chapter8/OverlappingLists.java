package com.eip.chapter8;

import java.util.List;

/**
 * Created by sunilpatil on 3/8/17.
 */
public class OverlappingLists {

    public ListNode<Integer> overlappingNoCycleLists(ListNode<Integer> first, ListNode<Integer> second){
        int firstLength = length(first);
        int secondLength = length(second);
        int max = Math.max(firstLength,secondLength);
        if(firstLength> secondLength){
            first = advancedList(first, max-secondLength);
        }else if(firstLength < secondLength){
            second = advancedList(second, max-firstLength);
        }
        System.out.println("After advancing first " + first );
        System.out.println("After advancing second " + second );
        while (first != null && second != null){
            if(first == second)
                return first;
            first = first.next;
            second = second.next;
        }
        return null;
    }

    ListNode<Integer> advancedList(ListNode<Integer> head, int adv){
        int counter = 0;
        ListNode<Integer> next = head;
        while(counter < adv){
            next = next.next;
            counter++;
        }
        return next;
    }

     int length(ListNode<Integer> node){
        int length = 0;
        ListNode<Integer> next = node;
        while(next != null){
            length = length+1;
            next = next.next;
        }
        return length;

    }
}
