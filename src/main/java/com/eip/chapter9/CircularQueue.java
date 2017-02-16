package com.eip.chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class CircularQueue {
    private int head =0, tail = 0, numQueueElements = 0;
    private Integer[] entries;
    private static final int SCALE_FACTOR =2;

    public CircularQueue(int capacity){
        entries = new Integer[capacity];
    }

    public void enqueue(Integer x){
        if(numQueueElements == entries.length){
            Collections.rotate(Arrays.asList(entries), -head);
            head = 0;
            tail = numQueueElements;
            entries = Arrays.copyOf(entries,numQueueElements*SCALE_FACTOR);
        }
        entries[tail] =x;
        tail = (tail +1) %entries.length;
        ++numQueueElements;
    }

    public Integer dequeue(){
        if(numQueueElements != 0){
            --numQueueElements;
            Integer ret = entries[head];
            head = (head +1) %entries.length;
            return ret;
        }
        throw new NoSuchElementException("Dequeue called on empty queue");
    }

    public int size(){
        return numQueueElements;
    }
}
