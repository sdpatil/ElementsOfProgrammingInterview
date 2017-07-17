package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/20/17.
 */
public class SearchFirstOfKTest {
    SearchFirstOfK searchFirstOfK;

    @Before
    public void setup(){
        searchFirstOfK = new SearchFirstOfK();
    }

    @Test
    public void simpleTest(){
        List<Integer> a = Arrays.asList(-14,-10,2,108,108,243,285,285,285,401);
        assert searchFirstOfK.searchForFirstK(a,-10) ==1;
        assert searchFirstOfK.searchForFirstK(a,108) ==3;
        assert searchFirstOfK.searchForFirstK(a,285) ==6;
    }
    @Test
    public void notFoundTest(){
        List<Integer> a = Arrays.asList(-14,-10,2,108,108,243,285,285,285,401);
        assert searchFirstOfK.searchForFirstK(a,0) ==-1;

    }
}
