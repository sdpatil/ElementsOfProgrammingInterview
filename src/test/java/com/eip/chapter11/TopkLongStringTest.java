package com.eip.chapter11;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class TopkLongStringTest {
    TopkLongString topkLongString;

    @Before
    public void setup(){
        topkLongString = new TopkLongString();
    }

    @Test
    public void simpleTest(){
        List<String> sortList = Arrays.asList("First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth");
        List<String> returnString = topkLongString.topK(3,sortList.iterator());
        System.out.println("Return String " + returnString);
    }
}
