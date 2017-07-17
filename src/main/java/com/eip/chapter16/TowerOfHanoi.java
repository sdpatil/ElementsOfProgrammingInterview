package com.eip.chapter16;

/**
 * Problem: How do you move n disks from one stack to another without putting larger disk on top of smaller disk
 *
 * Solution: - Basic idea is simple you solve this problem using recursion,
 * Base case is if you have only 1 disk you can simply move it from source to target
 *
 * If its more than 1 then you follow 3 steps
 * 1) Move all the disks except the last one from source to spare
 * 2) Then move last disk from source to target
 * 3) Move all the disks moved in the first step back from spare to first tower
 */
public class TowerOfHanoi {
    private static final String FIRST ="first";
    private static final String SECOND ="second";
    private static final String THIRD ="third";


    public void computeTowerOfHanoi(int numRings){
        computeTowerOfHanoi(numRings, FIRST,SECOND,THIRD);
    }

    public void computeTowerOfHanoi(int numRings, String from, String to, String spare){
        // base case if there is only one ring we can simply move it from source to target
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
