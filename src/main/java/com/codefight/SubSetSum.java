package com.codefight;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/2/17.
 */
public class SubSetSum {
    static class Item{
        public Integer weight;
        public Integer value;

        public Item(Integer weight, Integer value) {
            this.weight = weight;
            this.value = value;
        }
    }

    public int optimumSubjectToCapacity(List<Item> itemList, int capacity){
        int[][] V = new int[itemList.size()][capacity+1];
        for(int[] v:V){
            Arrays.fill(v,-1);
        }
        return optimumSubjectToItemAndCapacity(itemList, itemList.size()-1, capacity,V);
    }

    public int optimumSubjectToItemAndCapacity(List<Item> itemList, int k, int availableCapacity, int[][] v){
        return 0;
    }
}
