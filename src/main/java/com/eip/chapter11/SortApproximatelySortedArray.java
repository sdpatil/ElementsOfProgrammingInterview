package com.eip.chapter11;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Problem: Write a program which takes as input a very long sequence of number and prints
 * the number in sorted order. Each number is at most k away from its correctly sorted position
 *
 */
public class SortApproximatelySortedArray {

    /*
    Solution: Create a PriorityQueue and keep inserting elements in it, when it is has k elements
    then take out min and print it, after that everytime you insert a element take out one from
    PQ and insert it into queue
     */

    public void sortApproximatelySortedData(Iterator<Integer> sequence, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int i = 0; i < k && sequence.hasNext(); i++)
            minHeap.add(sequence.next());

        while (sequence.hasNext()) {
            minHeap.add(sequence.next());
            Integer smallest = minHeap.remove();
            System.out.println(smallest);
        }

        while (!minHeap.isEmpty())
            System.out.println(minHeap.remove());
    }
}
