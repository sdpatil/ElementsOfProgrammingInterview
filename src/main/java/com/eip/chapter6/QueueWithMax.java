package com.eip.chapter6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class QueueWithMax<T extends Comparable<T>> {
    private Queue<T> entries = new LinkedList<T>();
    private Deque<T> candidatesForMax = new LinkedList<T>();

    public void enqueue(T data) {
        entries.add(data);
        while (!candidatesForMax.isEmpty()){
            if(candidatesForMax.getLast().compareTo(data) >=0) {
                break;
            }
            candidatesForMax.removeLast();

        }
        candidatesForMax.addLast(data);
    }

    public T dequeue() {
        if(!entries.isEmpty()) {
            T data = entries.remove();
            if(candidatesForMax.getFirst().equals(data))
                candidatesForMax.removeFirst();
            return data;
        }
        throw new NoSuchElementException("Empty Queue");
    }

    public T max() {
        if(!candidatesForMax.isEmpty())
            candidatesForMax.getFirst();
        throw new NoSuchElementException("Empty Queue");
    }
}
