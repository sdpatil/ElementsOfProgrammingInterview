package com.eip.chapter25;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class DrawTheSkyline29Test {
    DrawTheSkyline29 problem = new DrawTheSkyline29();

    @Test
    public void simpleTest(){
        List<DrawTheSkyline29.Rectangle> inputList = new ArrayList<>();
        inputList.add(new DrawTheSkyline29.Rectangle(0,3,1));
        inputList.add(new DrawTheSkyline29.Rectangle(1,6,3));
        inputList.add(new DrawTheSkyline29.Rectangle(4,8,4));
        inputList.add(new DrawTheSkyline29.Rectangle(5,9,2));
        inputList.add(new DrawTheSkyline29.Rectangle(11,17,1));
        inputList.add(new DrawTheSkyline29.Rectangle(10,12,6));
        inputList.add(new DrawTheSkyline29.Rectangle(7,14,3));
        inputList.add(new DrawTheSkyline29.Rectangle(13,16,2));

        List<DrawTheSkyline29.Rectangle> skyLineList= problem.drawingSkylines(inputList);

    }
}
