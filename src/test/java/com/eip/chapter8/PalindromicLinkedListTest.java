package com.eip.chapter8;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/15/17.
 */
public class PalindromicLinkedListTest {
    PalindromicLinkedList palindromicLinkedList;

    @Before
    public void setup(){
        palindromicLinkedList = new PalindromicLinkedList();

    }

    @Test
    public void nonPalindromicEvenLinkedListTest(){
        ListNode<Integer> headNode = new ListNode<Integer>(1);
        headNode.next = new ListNode<Integer>(2);
        headNode.next.next = new ListNode<Integer>(3);
        headNode.next.next.next = new ListNode<Integer>(4);
        headNode.next.next.next.next = new ListNode<Integer>(5);
        headNode.next.next.next.next.next = new ListNode<Integer>(6);

        System.out.println("Linked List " + headNode);

        assert !palindromicLinkedList.isPalindrome(headNode);
    }

    @Test
    public void nonPalindromicOddLinkedListTest(){
        ListNode<Integer> headNode = new ListNode<Integer>(1);
        headNode.next = new ListNode<Integer>(2);
        headNode.next.next = new ListNode<Integer>(3);
        headNode.next.next.next = new ListNode<Integer>(4);
        headNode.next.next.next.next = new ListNode<Integer>(5);
        headNode.next.next.next.next.next = new ListNode<Integer>(6);
        headNode.next.next.next.next.next.next = new ListNode<Integer>(7);
        System.out.println("Linked List " + headNode);

        assert !palindromicLinkedList.isPalindrome(headNode);
    }

    @Test
    public void palindromicLinkedListTest(){
        ListNode<Integer> headNode = new ListNode<Integer>(1);
        headNode.next = new ListNode<Integer>(2);
        headNode.next.next = new ListNode<Integer>(3);
        headNode.next.next.next = new ListNode<Integer>(3);
        headNode.next.next.next.next = new ListNode<Integer>(2);
        headNode.next.next.next.next.next = new ListNode<Integer>(1);

        System.out.println("Linked List " + headNode);

        assert palindromicLinkedList.isPalindrome(headNode);
    }

    @Test
    public void palindromicOddLinkedListTest(){
        ListNode<Integer> headNode = new ListNode<Integer>(1);
        headNode.next = new ListNode<Integer>(2);
        headNode.next.next = new ListNode<Integer>(3);
        headNode.next.next.next = new ListNode<Integer>(4);
        headNode.next.next.next.next = new ListNode<Integer>(3);
        headNode.next.next.next.next.next = new ListNode<Integer>(2);
        headNode.next.next.next.next.next.next = new ListNode<Integer>(1);
        System.out.println("Linked List " + headNode);

        assert palindromicLinkedList.isPalindrome(headNode);
    }
}
