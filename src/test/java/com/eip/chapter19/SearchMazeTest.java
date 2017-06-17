package com.eip.chapter19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.eip.chapter19.SearchMaze.Color.*;
/**
 * Created by sunilpatil on 6/13/17.
 */
public class SearchMazeTest {
    SearchMaze searchMaze = new SearchMaze();

    @Test
    public void simpleTest(){

        List<List<SearchMaze.Color>> colorList = new ArrayList<>();
        colorList.add(Arrays.asList(BLACK,WHITE,BLACK,WHITE));
        colorList.add(Arrays.asList(BLACK,BLACK,WHITE,WHITE));
        colorList.add(Arrays.asList(BLACK,BLACK,WHITE,BLACK));
        colorList.add(Arrays.asList(WHITE,WHITE,WHITE,BLACK));

        List<SearchMaze.Coordinate> path= searchMaze.searchMaze(colorList,new SearchMaze.Coordinate(3,0), new SearchMaze.Coordinate(0,3));
        System.out.println(path);
    }
}
