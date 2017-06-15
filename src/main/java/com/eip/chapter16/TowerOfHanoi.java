package com.eip.chapter16;

/**
 * Created by spatil30 on 2/10/2017.
 */
public class TowerOfHanoi {
    private static final String FIRST ="first";
    private static final String SECOND ="second";
    private static final String THIRD ="third";


    public void computeTowerOfHanoi(int numRings){
        computeTowerOfHanoi(numRings, FIRST,SECOND,THIRD);
    }

    public void computeTowerOfHanoi(int numRings, String from, String to, String spare){
        if( numRings ==1)
            printMove(from,to,numRings);
        else{
            computeTowerOfHanoi(numRings-1,from,spare,to);
            computeTowerOfHanoi(1, from, to, spare);
            computeTowerOfHanoi(numRings-1, spare,to,from);
        }
    }

    private void printMove(String from, String to, int n){
        System.out.printf("Move Disk - %d from %s to %s \n",n,from,to);

    }
}
