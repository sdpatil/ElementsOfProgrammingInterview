package com.eip.chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

/**
 * Problem: Impelment a Queue using Circular array
 *
 * Solution:- Basic idea is keep a head and tail element every time you enqueue tail goes up by 1 and
 * every time you dequeue head goes up by 1. Since this is circular array take modulo of num of elements
 * in the queue by entries.length to find out actual location of the element to enqueue or dequeue
 */
public class CircularQueue {
    private int head =0, tail = 0, numQueueElements = 0;
    private Integer[] entries;

    public CircularQueue(int capacity){
        this.entries = new Integer[capacity];
    }

    public void enqueue(int x){
        // The array of entries is full so resize the array
        if(numQueueElements == entries.length){
            //First rotate the array so that all elements appear in order
            Collections.rotate(Arrays.asList(entries), -head);
            head =0;
            tail = numQueueElements;
            //Double size of the array
            entries = Arrays.copyOf(entries, numQueueElements*2);
        }
        entries[tail] =x;
        tail = (tail+1) % entries.length;
        ++numQueueElements;
    }

    public int dequeue(){
        if(numQueueElements != 0){
            --numQueueElements;
            Integer ret = entries[head];
            head = (head+1) %entries.length;
            return ret;
        }
        throw new NoSuchElementException();
    }
}
