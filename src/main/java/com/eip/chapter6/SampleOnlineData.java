package com.eip.chapter6;

import java.util.*;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class SampleOnlineData {

    public List<Integer> onlineRandomSample(Iterator<Integer> sequence, int k){
        List<Integer> returnList  = new ArrayList<Integer>(k);

        for(int i = 0 ; i < k && sequence.hasNext();i++)
            returnList.add(sequence.next());

        int packetCount = k;
        Random random = new Random();
        while(sequence.hasNext()){
            int nextPacket = sequence.next();
            packetCount = packetCount+1;

            int packetToRepleace = random.nextInt(packetCount);
            if(packetToRepleace < k){
                returnList.set(packetToRepleace,nextPacket);
            }
        }
        return returnList;
    }
}
