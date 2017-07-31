package com.eip.chapter6;

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
        flags.add(Color.BLUE);
        flags.add(Color.WHITE);
        flags.add(Color.RED);
        flags.add(Color.BLUE);
        flags.add(Color.WHITE);
        flags.add(Color.WHITE);
        System.out.println(flags);
        dutchFlagPartition(5, flags);
        System.out.println(flags);
    }

    /**
     * Given color
     * [RED, BLUE, WHITE, RED, BLUE, WHITE, WHITE] sort it to
     * [RED, RED, WHITE, WHITE, WHITE, BLUE, BLUE]
     * There are 3 buckets so split it like that
     */
    public static void dutchFlagPartition(int pivotIndex, List<Color> A) {
        Color partition = A.get(pivotIndex);
        int smaller = 0;
        int equal = 0 ;
        int larger = A.size()-1;
        while (equal <larger){
            if(A.get(equal).ordinal() < partition.ordinal()){
                //If current color is RED (smallest) put it in smallest bucket
                Collections.swap(A,smaller++,equal++);
            }else if(A.get(equal).ordinal() > partition.ordinal()){
                //If current color is BLUE (Largest) put it in largest bucket
                Collections.swap(A,larger--,equal++);
            }else{
                //If current color is white put it in white bucket
                equal++;
            }
        }
    }


}
