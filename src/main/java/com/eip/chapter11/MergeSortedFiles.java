package com.eip.chapter11;

import java.util.*;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class MergeSortedFiles {

    private static class ArrayEntry{
        public Integer value;
        public Integer arrayId;

        public ArrayEntry( Integer arrayId, Integer value) {
            this.value = value;
            this.arrayId = arrayId;
        }
    }

    public List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays){

        List<Iterator<Integer>> inputIt = new ArrayList<Iterator<Integer>>();
        for(List<Integer> list: sortedArrays)
            inputIt.add(list.iterator());

        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<ArrayEntry>(3, new Comparator<ArrayEntry>() {
            public int compare(ArrayEntry o1, ArrayEntry o2) {
                return Integer.compare(o1.value, o2.value);
            }
        });
        List<Integer> returnList = new ArrayList<Integer>();
        int arrayProcessCount = 0;

        for(int i = 0 ; i < inputIt.size() ;i++) {
            int currentEntry = inputIt.get(i).next();
            minHeap.add(new ArrayEntry(i,currentEntry));
        }

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
