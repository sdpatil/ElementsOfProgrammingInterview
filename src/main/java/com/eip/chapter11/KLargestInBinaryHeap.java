package com.eip.chapter11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Problem: Given a max-heap represented as an array, design an algorithm that computes the k largest
 * elements stored in the max-heap. You cannot modify heap.
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
    /*
    Basic idea here is the entry at 0th location is biggest and is bigger than both its children
    So we insert entry at 0 index into a priority queue, then every time we take out element from PQ we add
    both its children to the PQ. The element that bubbles to top would be the max
     */
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
