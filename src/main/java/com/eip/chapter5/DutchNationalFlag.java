package com.eip.chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/5/17.
 */
public class DutchNationalFlag {


    public static void main(String[] argv) {
        List<Color> flags = new ArrayList();
        flags.add(Color.RED);
        flags.add(Color.WHITE);
        flags.add(Color.BLUE);
        flags.add(Color.RED);
        flags.add(Color.BLUE);
        flags.add(Color.WHITE);
        flags.add(Color.WHITE);
        System.out.println(flags);
        dutchFlagPartition(1, flags);
        System.out.println(flags);
    }

    public static void dutchFlagPartition4(int pivotIndex, List<Color> A) {
        Color partition = A.get(pivotIndex);
        int smaller = 0;
        int equal = 0;
        int larger = A.size()-1;
        while(equal < larger){
            if(A.get(equal).ordinal() < partition.ordinal()){
                Collections.swap(A,equal++,smaller++);
            }else if (A.get(equal).ordinal() == partition.ordinal()){
                equal++;
            }else{
                Collections.swap(A,equal++,larger--);
            }
        }

    }

    public static void dutchFlagPartition3(int pivotIndex, List<Color> A) {
        Color partition = A.get(pivotIndex);
        int smaller = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).ordinal() < partition.ordinal()) {
                Collections.swap(A, i, smaller++);
            }
        }

        int larger = A.size() - 1;
        for (int i = A.size() - 1; i >= smaller; i--) {
            if (A.get(i).ordinal() > partition.ordinal()) {
                Collections.swap(A, i, larger--);
            }
        }
    }

    public static void dutchFlagPartition(int pivotIndex, List<Color> A) {

        Color partition = A.get(pivotIndex);
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(j).ordinal() < partition.ordinal()) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }

        for (int i = A.size() - 1; i >= 0 && A.get(i).ordinal() >= partition.ordinal(); i--) {
            for (int j = i - 1; j >= 0 && A.get(i).ordinal() >= partition.ordinal(); j--) {
                if (A.get(j).ordinal() > partition.ordinal()) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }
    }

    public static void dutchFlagPartition2(int pivotIndex, List<Color> A) {
        Color partition = A.get(pivotIndex);

        for (int i = 0; i < A.size(); ++i) {
            for (int j = i + 1; j < A.size(); ++j) {
                if (A.get(j).ordinal() < partition.ordinal())
                    Collections.swap(A, i, j);
            }
        }

        for (int i = A.size() - 1; i > 0; --i) {
            for (int j = i - 1; j > 0; --j) {
                if (A.get(j).ordinal() > partition.ordinal())
                    Collections.swap(A, i, j);
            }
        }


    }

    protected void swap(List<Color> A, int first, int second) {
        Collections.swap(A, first, second);
    }
}
