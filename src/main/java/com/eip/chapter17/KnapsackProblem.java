package com.eip.chapter17;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/2/17.
 */
public class KnapsackProblem {
    public static class Item {
        public Integer value;
        public Integer weight;

        public Item(Integer weight, Integer value) {
            this.value = value;
            this.weight = weight;
        }
    }

    public int optimumSubjectToCapacity(List<Item> itemList, int capacity) {
        int[][] V = new int[itemList.size()+1][capacity+1];
        for(int availableItems = 0; availableItems <= itemList.size() ; availableItems++){
            for(int availableCapacity = 0; availableCapacity <= capacity; availableCapacity++){
                if(availableItems == 0 || availableCapacity ==0 ){
                    V[availableItems][availableCapacity] =0;
                    continue;
                }
                if(availableCapacity - itemList.get(availableItems-1).weight >=0){
                    int valueWithOutCurrentItem = V[availableItems-1][availableCapacity];
                    int valueWithCurrentItem = V[availableItems-1][availableCapacity-itemList.get(availableItems-1).weight] + itemList.get(availableItems-1).value;
                    V[availableItems][availableCapacity] = Math.max(valueWithCurrentItem,valueWithOutCurrentItem);
                }else{
                    V[availableItems][availableCapacity] = V[availableItems-1][availableCapacity];
                }
            }
        }
        return V[itemList.size()][capacity];
    }

 //  public int optimumSubjectToItemAndCapacity(List<Integer> itemList, int capacity)
}
