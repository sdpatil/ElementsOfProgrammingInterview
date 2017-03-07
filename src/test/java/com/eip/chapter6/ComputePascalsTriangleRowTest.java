package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/6/17.
 */
public class ComputePascalsTriangleRowTest {
    ComputePascalsTriangleRow computePascalsTriangleRow;

    @Before
    public void setup(){
        computePascalsTriangleRow = new ComputePascalsTriangleRow();
    }

    @Test
    public void simpleTest(){
        List<Integer> fifthRow = computePascalsTriangleRow.generatePascalsTriangle(5);
        assert fifthRow.size() ==5;
        assert fifthRow.get(0) == 1;
        assert fifthRow.get(1) == 4;
        assert fifthRow.get(2) == 6;
        assert fifthRow.get(3) == 4;
        assert fifthRow.get(4) == 1;
    }
}
