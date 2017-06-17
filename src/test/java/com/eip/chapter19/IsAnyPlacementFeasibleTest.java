package com.eip.chapter19;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class IsAnyPlacementFeasibleTest {
    IsAnyPlacementFeasible problem = new IsAnyPlacementFeasible();

    @Test
    public void simpleTest(){
        IsAnyPlacementFeasible.GraphVertex A = new IsAnyPlacementFeasible.GraphVertex("A");
        IsAnyPlacementFeasible.GraphVertex B = new IsAnyPlacementFeasible.GraphVertex("B");
        IsAnyPlacementFeasible.GraphVertex C = new IsAnyPlacementFeasible.GraphVertex("C");
        IsAnyPlacementFeasible.GraphVertex D = new IsAnyPlacementFeasible.GraphVertex("D");

        A.edges.add(B);
        A.edges.add(D);
        B.edges.add(C);
        C.edges.add(D);

        List<IsAnyPlacementFeasible.GraphVertex> graph = Arrays.asList(A,B,C,D);

        assert problem.isAnyPlacementFeasible(graph);
    }

    @Test
    public void simple2Test(){
        IsAnyPlacementFeasible.GraphVertex A = new IsAnyPlacementFeasible.GraphVertex("A");
        IsAnyPlacementFeasible.GraphVertex B = new IsAnyPlacementFeasible.GraphVertex("B");
        IsAnyPlacementFeasible.GraphVertex C = new IsAnyPlacementFeasible.GraphVertex("C");
        IsAnyPlacementFeasible.GraphVertex D = new IsAnyPlacementFeasible.GraphVertex("D");

        A.edges.add(B);
        A.edges.add(D);
        A.edges.add(C);
        B.edges.add(C);
        B.edges.add(D);

        List<IsAnyPlacementFeasible.GraphVertex> graph = Arrays.asList(A,B,C,D);

        assert !problem.isAnyPlacementFeasible(graph);
    }
}
