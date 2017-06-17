package com.eip.chapter6;

import java.util.*;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class SampleOnlineData {

    /**
     * We are getting stream of data and we have to select k elements out of them
     * randomly
     * @param sequence
     * @param k
     * @return
     */
    public List<Integer> onlineRandomSample(Iterator<Integer> sequence, int k) {
        List<Integer> result = new ArrayList<>();
        //First select first k element and add them to result
        for(int i = 0; i < k && sequence.hasNext() ;i++){
            result.add(sequence.next());
        }

        /*
            Now every time new packet arrives generate a new random number within range including
            new packet, if the random number is less than k replace the packet at that position
            with next packet
         */
        int packetCount = k;
        Random random = new Random();
        while (sequence.hasNext()){
            int nextPacket = sequence.next();
            packetCount = packetCount+1;

            int packetToReplace = random.nextInt(packetCount);
            if(packetToReplace<k){
                result.set(packetToReplace,nextPacket);
            }
        }

        return result;
    }


        public List<Integer> onlineRandomSample2(Iterator<Integer> sequence, int k){
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
