package com.eip.chapter18;

import java.util.Iterator;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class MajoritySearch {

    public String majoritySearch(Iterator<String> sequence){
        String candidate = "";
        int candidateCount = 0;
        String nextString = null;
        while(sequence.hasNext()){
            nextString = sequence.next();
            if(candidate.equals(nextString))
                candidateCount ++;
            else if(candidateCount == 0){
                System.out.println("Switching candidate " + nextString);
                candidate = nextString;
                candidateCount =1;
            }else{
                candidateCount--;
            }
        }
        return candidate;
    }
}
