package com.eip.chapter11;

import java.util.*;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class TopkLongString {

    public List<String> topK(int k, Iterator<String> iter){
        PriorityQueue<String> minHeap = new PriorityQueue<String>(k,new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        while(iter.hasNext()){
            minHeap.add(iter.next());
         //   if(minHeap.size() > k)
         //       minHeap.poll();
        }

        return new ArrayList<String>(minHeap);
    }
}
