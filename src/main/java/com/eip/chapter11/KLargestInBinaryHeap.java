package com.eip.chapter11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class KLargestInBinaryHeap {

    private static class HeapEntry{
        Integer index;
        Integer value;

        public HeapEntry(Integer index, Integer value) {
            this.index = index;
            this.value = value;
        }
    }

    public List<Integer> kLargestInBinaryHeap(List<Integer> A, int k){
        List<Integer> returnList = new ArrayList<Integer>();
        PriorityQueue<HeapEntry> maxHeap = new PriorityQueue<HeapEntry>(16, new Comparator<HeapEntry>() {
            public int compare(HeapEntry o1, HeapEntry o2) {
                return Integer.compare(o2.value, o1.value);
            }
        });
        maxHeap.add(new HeapEntry(0,A.get(0)));
        for(int i = 0 ; i < k;i++){
            HeapEntry nextEntry = maxHeap.poll();
            returnList.add(nextEntry.value);

            Integer leftChildIndex = nextEntry.index *2 +1;
            if(leftChildIndex < A.size()){
                maxHeap.add(new HeapEntry(leftChildIndex,A.get(leftChildIndex)));
            }
            Integer rightChildIndex = nextEntry.index *2 +2;
            if(rightChildIndex < A.size()){
                maxHeap.add(new HeapEntry(rightChildIndex,A.get(rightChildIndex)));
            }
        }
        return returnList;
    }
}
