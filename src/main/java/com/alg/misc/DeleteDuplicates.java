package com.alg.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by sunilpatil on 3/2/17.
 */
public class DeleteDuplicates {

    public static void main(String[] argv){
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{10, 20, 30, 40};

        System.out.println(deleteDuplicates.sumOfTwo(a,b,42));
    }

    boolean sumOfTwo(int[] a, int[] b, int v) {
        Arrays.sort(b);
        for (int i = 0; i < a.length ;i++){
            if(Arrays.binarySearch(b, v-a[i]) >= 0)
                return true;
        }
        return false;
    }


    private void test(int[] a){
        System.out.println("Before " + Arrays.toString(a));
        int[] result = findDistinctNumbers(a);
        System.out.println("after " + Arrays.toString(result));

    }

    int[] findDistinctNumbers2(int[] a) {
        if(a.length <2)
            return a;
        int copyCount = a.length-2;
        HashSet<Integer> currentNo = new HashSet<Integer>();
        currentNo.add(a[a.length-1]);
        for(int i = a.length-2; i >= 0; i--){
            if(!currentNo.contains(a[i])){
                a[copyCount]=  a[i];
                copyCount--;
                currentNo.add(a[i]);
            }
        }
        System.out.println("Copy count " + copyCount);
        int[] returnList = new int[a.length-(copyCount+1)];
        int counter = 0;
        for(int j = copyCount+1; j < a.length;j++){
            returnList[counter++] = a[j];
        }

        return returnList;
    }

    private int[] findDistinctNumbers(int[] n){
        if(n.length <2)
            return n;

        int copyCount =0;
        HashSet<Integer> duplicate = new HashSet<Integer>();

        for(int i = 0; i < n.length;i++){
            if(!duplicate.contains(n[i])){
                n[copyCount++] = n[i];
                duplicate.add(n[i]);
            }
        }
        return Arrays.copyOfRange(n,0,copyCount);
    }
}
