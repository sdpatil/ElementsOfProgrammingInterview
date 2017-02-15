package com.eip.chapter11;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class MedianOfOnlineData {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;


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
