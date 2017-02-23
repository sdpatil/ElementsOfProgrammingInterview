package com.eip.chapter12;

import java.util.BitSet;
import java.util.Iterator;

/**
 * Created by sunilpatil on 2/22/17.
 */
public class MissingIPAddress {
    private static final int NUM_BUCKETS = 1 <<16;

    public int findMissingElement(Iterable<Integer> sequence){
        System.out.println(1<< 16);
        int[] counter = new int[NUM_BUCKETS];
        Iterator<Integer> s = sequence.iterator();
        while(s.hasNext()){
            int idx = s.next() >>> 16;
            ++counter[idx];
        }

        for(int i = 0; i < counter.length;i++){
            if(counter[i] < NUM_BUCKETS){
                BitSet bitVec = new BitSet(NUM_BUCKETS);
                s = sequence.iterator();
                while(s.hasNext()){
                    int x = s.next();
                    if(i == (x >>> 16)){
                        bitVec.set(((NUM_BUCKETS)-1) & x);
                    }
                }
                for(int j =0; j < NUM_BUCKETS; ++j){
                    if(!bitVec.get(j))
                        return (i<<16) |j;
                }
            }
        }
        return 0;
    }
}
