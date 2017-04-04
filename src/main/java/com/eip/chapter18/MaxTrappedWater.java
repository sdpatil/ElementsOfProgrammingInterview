package com.eip.chapter18;

import java.util.List;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class MaxTrappedWater {
    public int getMaxTrappedWater(List<Integer> heights){
        int start = 0;
        int end = heights.size()-1;
        int maxTrappedWater = 0;
        while(start < end){
            int width = end - start;
            int height = Math.min(heights.get(start), heights.get(end));
            int capturedWater = width *height;
            maxTrappedWater = Math.max(capturedWater,maxTrappedWater);

            if(heights.get(start) < heights.get(end)){
                start++;
            }else if (heights.get(end) < heights.get(start)){
                end--;
            }else{
                start++;
                end--;
            }
        }
        return maxTrappedWater;
    }
}
