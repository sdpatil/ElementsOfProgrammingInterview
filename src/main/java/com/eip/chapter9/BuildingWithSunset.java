package com.eip.chapter9;

import java.util.*;

/**
 * Given a set of buildings
 */
public class BuildingWithSunset {

    public static class BuildingWithHeight {
        Integer id;
        Integer height;

        public BuildingWithHeight(Integer id, Integer height) {
            this.id = id;
            this.height = height;
        }
    }

    /*
    Problem: Given list of buildings from east to west calculate which all buildings will get sunset view
    Solution: Basic idea is if there is a taller building on west it will block sunset of building on east
    to implement this create a stack. Now start iterating from east to west, if the current building is
    shorter than the building on stack add it to stack, but if its taller then take out all the buildings
    on stack which are shorter than it
     */
    public List<BuildingWithHeight> examineBuildingWithSunset(Iterator<Integer> sequence) {
        int buildingIndx = 0;
        Stack<BuildingWithHeight> buildingWithSunSet = new Stack<>();
        while (sequence.hasNext()) {
            Integer buildingHeight = sequence.next();
            while (!buildingWithSunSet.isEmpty() &&
                    (Integer.compare(buildingHeight, buildingWithSunSet.peek().height) >= 0))
                buildingWithSunSet.pop();
            buildingWithSunSet.push(new BuildingWithHeight(buildingIndx++, buildingHeight));

        }
        return buildingWithSunSet;
    }

    public static void main(String[] argv) {
        BuildingWithSunset buildingWithSunset = new BuildingWithSunset();
        List<Integer> buildingHeights = Arrays.asList(4, 2, 3, 1);
        List<BuildingWithHeight> sunsetViewList = buildingWithSunset.examineBuildingWithSunset(buildingHeights.iterator());

        System.out.println(sunsetViewList);
    }
}
