package com.eip.chapter16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class GenerateThePowerSet {
    public List<List<Integer>> generatePowerSet(List<Integer> inputList){
        List<List<Integer>> powerSetList = new ArrayList<>();
        directedPowerSet(inputList,0,new ArrayList<Integer>(),powerSetList);
        return powerSetList;

    }

    public void directedPowerSet( List<Integer> inputList, int toBeSelected, List<Integer> selectedSoFar,
                          List<List<Integer>> powerSetList){
        if(toBeSelected == inputList.size()){
            powerSetList.add(new ArrayList<>(selectedSoFar));
            return;
        }
        selectedSoFar.add(inputList.get(toBeSelected));
        directedPowerSet(inputList,toBeSelected+1,selectedSoFar,powerSetList);

        selectedSoFar.remove(selectedSoFar.size()-1);
        directedPowerSet(inputList,toBeSelected+1,selectedSoFar,powerSetList);


    }
}
