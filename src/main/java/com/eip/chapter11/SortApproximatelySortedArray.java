package com.eip.chapter11;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class SortApproximatelySortedArray {

    public void sortApproximatelySortedData2(Iterator<Integer> sequence, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();

        while (sequence.hasNext()) {
            Integer n = sequence.next();
            maxHeap.add(n);

            if (maxHeap.size() == k) {
                System.out.println(maxHeap.remove());
            }
        }
        while (!maxHeap.isEmpty())
            System.out.println(maxHeap.remove());
    }

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
