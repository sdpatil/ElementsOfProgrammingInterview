package com.eip.chapter9;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class BuildingWithSunset {

    public static class BuildingWithHeight{
        Integer id;
        Integer height;

        public BuildingWithHeight(Integer id, Integer height) {
            this.id = id;
            this.height = height;
        }
    }

    public Deque<BuildingWithHeight> examineBuildingWithSunset(Iterator<Integer> sequence){
        int buildingIndx = 0;
        Deque<BuildingWithHeight> buildingWithSunSet = new LinkedList<BuildingWithHeight>();
        while(sequence.hasNext()){
            Integer buildingHeight = sequence.next();
            while(!buildingWithSunSet.isEmpty() && (Integer.compare(buildingHeight, buildingWithSunSet.getLast().height )>=0))
                buildingWithSunSet.removeLast();
            buildingWithSunSet.addLast(new BuildingWithHeight(buildingIndx++, buildingHeight));

        }
        return buildingWithSunSet;
    }
}
