package com.eip.chapter17;

import java.util.ArrayList;
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

    public static void main(String[] argv) {
        List<Item> itemList = Arrays.asList(
                new Item(1, 1),
                new Item(3, 4),
                new Item(4, 5),
                new Item(5, 7)
        );

        KnapsackProblem problem = new KnapsackProblem();
        int result = problem.optimumSubjectToCapacity(itemList, 7);
        System.out.println("Result " + result);
    }

    /**
     If you had 4 items (weight:1,value:1),(weight:3,value:4),(weight:4,value:5),(weight:5,value:7) and want to pickup
     max weight of 7
        Create DP table of [numberofItems+1][capacity+1]
     Now check what would get more value, choosing this weight or ignoring this weight using following formula
     if(column < weight[row-1])
        dptable[row][column] = dptable[row-1][column]
     else
        dptable[row][column] = Math.max( dpTable[row-1][column] ,without this weight
            value[row-1] + dptable[row-1][column-weight[row-1] with this weight
     )
     [0, 0, 0, 0, 0, 0, 0, 0]
     [0, 1, 1, 1, 1, 1, 1, 1]
     [0, 1, 1, 4, 5, 5, 5, 5]
     [0, 1, 1, 4, 5, 6, 6, 9]
     [0, 1, 1, 4, 5, 7, 8, 9]
     * @param itemList
     * @param capacity
     * @return
     */
    public int optimumSubjectToCapacity(List<Item> itemList, int capacity) {
        int[][] value = new int[itemList.size() + 1][capacity + 1];

        for (int row = 0; row <= itemList.size(); row++) {
            for (int column = 0; column <= capacity; column++) {
                if (row == 0 || column == 0) {
                    value[row][column] = 0;
                } else {
                    if (column < itemList.get(row-1).weight) {
                        value[row][column] = value[row - 1][column];
                    } else {
                        int withoutItem = value[row - 1][column];
                        int remainingItemValue = column - itemList.get(row-1).weight;
                        int withItem = itemList.get(row-1).value + value[row - 1][remainingItemValue];
                        value[row][column] = Math.max(withoutItem, withItem);
                    }
                }
            }
        }

        List<Item> pickedItemList = new ArrayList<>();

        return value[itemList.size() - 1][capacity];
    }

    private void printDPTable(int[][] dpTable) {
        for (int[] row : dpTable) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int optimumSubjectToCapacity2(List<Item> itemList, int capacity) {
        int[][] V = new int[itemList.size() + 1][capacity + 1];
        for (int availableItems = 0; availableItems <= itemList.size(); availableItems++) {
            for (int availableCapacity = 0; availableCapacity <= capacity; availableCapacity++) {
                if (availableItems == 0 || availableCapacity == 0) {
                    V[availableItems][availableCapacity] = 0;
                    continue;
                }
                if (availableCapacity - itemList.get(availableItems - 1).weight >= 0) {
                    int valueWithOutCurrentItem = V[availableItems - 1][availableCapacity];
                    int valueWithCurrentItem = V[availableItems - 1][availableCapacity - itemList.get(availableItems - 1).weight] + itemList.get(availableItems - 1).value;
                    V[availableItems][availableCapacity] = Math.max(valueWithCurrentItem, valueWithOutCurrentItem);
                } else {
                    V[availableItems][availableCapacity] = V[availableItems - 1][availableCapacity];
                }
            }
        }
        return V[itemList.size()][capacity];
    }

    //  public int optimumSubjectToItemAndCapacity(List<Integer> itemList, int capacity)
}
