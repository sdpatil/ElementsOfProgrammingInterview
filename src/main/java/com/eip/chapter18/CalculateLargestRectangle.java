package com.eip.chapter18;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class CalculateLargestRectangle {
    public int calculateLargestRectangle(List<Integer> heights){
        Deque<Integer> pillarIndices = new LinkedList<>();
        int maxRectangleArea = 0;

        for(int i = 0; i < heights.size(); i++){
            if(!pillarIndices.isEmpty() && i < heights.size()
                    && heights.get(i).equals(heights.get(pillarIndices.peekFirst()))) {

                pillarIndices.removeFirst();
                pillarIndices.addFirst(i);
            }

            while (!pillarIndices.isEmpty() && isNewPillarOrReachEnd(heights,i,pillarIndices.peekFirst())){
                int height = heights.get(pillarIndices.removeFirst());
                int width = pillarIndices.isEmpty() ?i:i-pillarIndices.peekFirst()-1;
                maxRectangleArea = Math.max(maxRectangleArea, height*width);
            }
            pillarIndices.addFirst(i);
        }

        return maxRectangleArea;
    }

    private boolean isNewPillarOrReachEnd(List<Integer> heights, int currentIdx, int lastPillarInd){
        return currentIdx < heights.size() ?
                heights.get(currentIdx) < heights.get(lastPillarInd):
                true;

    }
}
