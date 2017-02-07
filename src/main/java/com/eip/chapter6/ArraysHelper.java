package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sunilpatil on 2/5/17.
 */
public class ArraysHelper {
    public static void main(String[] argv){
        int[] a = new int[] {1,2,5,6,7};
        System.out.println(Arrays.binarySearch(a,6));
        ArrayList arrayList =new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);


        System.out.println(Arrays.asList(a));
    }
}
