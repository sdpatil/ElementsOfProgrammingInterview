package com.eip.chapter11;

import java.util.*;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class MergeSortedFiles {

    /*
    This class keeps mapping of current value and the fileid/arrayId the value came from
     */
    private static class ArrayEntry{
        public Integer value;
        public Integer arrayId;

        public ArrayEntry( Integer arrayId, Integer value) {
            this.value = value;
            this.arrayId = arrayId;
        }
    }
    /*
    Basic idea here is create a priority queue with one value from each file. Every time you pull item of priority
    queue replenish it with item from same file/array
     */
    public List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays){
        List<Iterator<Integer>> inputIt = new ArrayList<Iterator<Integer>>();
        for(List<Integer> list: sortedArrays)
            inputIt.add(list.iterator());

        //This priority Queue stores elements sorted based on value, it returns entry with lowest value
        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<ArrayEntry>(3, new Comparator<ArrayEntry>() {
            public int compare(ArrayEntry o1, ArrayEntry o2) {
                return Integer.compare(o1.value, o2.value);
            }
        });
        List<Integer> returnList = new ArrayList<Integer>();
        int arrayProcessCount = 0;

        // Insert one element from each of the array/file
        for(int i = 0 ; i < inputIt.size() ;i++) {
            int currentEntry = inputIt.get(i).next();
            minHeap.add(new ArrayEntry(i,currentEntry));
        }

        //Now go through priority queue, pull out one element, find out which array/file that element came from and
        // read next element from that file and add it to priority queue
        while(arrayProcessCount != inputIt.size()){
            if(minHeap.size() >= 0){
                ArrayEntry smallestEntry = minHeap.poll();
                returnList.add(smallestEntry.value);
                Iterator arrayIt = inputIt.get(smallestEntry.arrayId);
                if(arrayIt.hasNext()) {
                    int insertValue = inputIt.get(smallestEntry.arrayId).next();
                    minHeap.add(new ArrayEntry(smallestEntry.arrayId, insertValue));
                }else
                    arrayProcessCount++;
            }
        }
        return returnList;
    }
}
