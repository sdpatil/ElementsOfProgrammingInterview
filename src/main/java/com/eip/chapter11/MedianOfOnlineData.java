package com.eip.chapter11;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Problem: YOu want to compute the running median of sequence of numbers.
 */
public class MedianOfOnlineData {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    /*
    Solution: Maintain minimum and maximum heap, min heap keeps the upper half of number and the max heap
    keeps lower half of the number. If the minHeap and maxHeap size are same median is peek of both heaps
    divided by 2. If they are not same median is minHeap top
     */

    public void onlineMedian(Iterator<Integer> sequence){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(DEFAULT_INITIAL_CAPACITY, Collections.<Integer>reverseOrder());

        while(sequence.hasNext()){
            int x = sequence.next();

            if(minHeap.isEmpty()){
                minHeap.add(x);
            }else{
                if( x >= minHeap.peek())
                    minHeap.add(x);
                else
                    maxHeap.add(x);
            }

            if(minHeap.size() > maxHeap.size()+1){
                maxHeap.add(minHeap.remove());
            }else if(maxHeap.size() > minHeap.size()){
                minHeap.add(maxHeap.remove());
            }

            if(minHeap.size() == maxHeap.size()){
                System.out.println((minHeap.peek() + maxHeap.peek())*0.5);
            }else{
                System.out.println(minHeap.peek());
            }
        }
    }
}
