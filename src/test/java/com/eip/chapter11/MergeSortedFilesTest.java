package com.eip.chapter11;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class MergeSortedFilesTest {
    MergeSortedFiles mergeSortedFiles;

    @Before
    public void setup(){
        mergeSortedFiles = new MergeSortedFiles();
    }

    @Test
    public void simpleTest(){
        List<List<Integer>> inputList = new ArrayList<List<Integer>>();
        inputList.add(Arrays.asList(3,5,7));
        inputList.add(Arrays.asList(0,6));
        inputList.add(Arrays.asList(0,6,28));

        List<Integer> returnList = mergeSortedFiles.mergeSortedArrays(inputList);
        System.out.println(returnList);

        assert returnList.size() == 8;
        assert returnList.get(0) == 0;
        assert returnList.get(5) == 6;

        assert returnList.get(6) == 7;

        assert returnList.get(7) == 28;

    }

    @Test
    public void simpleTest2(){
        List<List<Integer>> inputList = new ArrayList<List<Integer>>();
        inputList.add(Arrays.asList(1,2,3));
        inputList.add(Arrays.asList(4,5));
        inputList.add(Arrays.asList(6,7,8));

        List<Integer> returnList = mergeSortedFiles.mergeSortedArrays(inputList);
        System.out.println(returnList);

        assert returnList.size() == 8;

        assert returnList.get(7) == 8;

    }


}
