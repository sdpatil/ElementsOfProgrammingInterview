package com.eip.chapter19;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class CloneAGraphTest {
    CloneAGraph problem = new CloneAGraph();

    @Test
    public void simpleTest(){
        CloneAGraph.GraphVertex one = new CloneAGraph.GraphVertex(1);
        CloneAGraph.GraphVertex two = new CloneAGraph.GraphVertex(2);
        CloneAGraph.GraphVertex three = new CloneAGraph.GraphVertex(3);
        CloneAGraph.GraphVertex four = new CloneAGraph.GraphVertex(4);

        one.edges.add(two);
        one.edges.add(three);
        two.edges.add(four);
        three.edges.add(four);

        CloneAGraph.GraphVertex clonedGraph = problem.cloneGraph(one);
        System.out.println(clonedGraph);
    }
}
