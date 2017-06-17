package com.eip.chapter19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class PaintABooleanMatrixTest {
    PaintABooleanMatrix problem = new PaintABooleanMatrix();

    @Test
    public void simpleTest() {
        List<List<Boolean>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(true, true, false, true));
        matrix.add(Arrays.asList(false,false,true,true));
        matrix.add(Arrays.asList(true,true,false,true));
        matrix.add(Arrays.asList(true,true,true,false));

        for(List<Boolean> row: matrix)
            System.out.println(row);
        problem.flipColors(matrix, 2,1);
        System.out.println("After transformation\n");
        for(List<Boolean> row: matrix)
            System.out.println(row);
    }
}
