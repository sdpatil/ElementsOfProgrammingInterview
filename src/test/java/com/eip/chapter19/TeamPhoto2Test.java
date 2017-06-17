package com.eip.chapter19;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class TeamPhoto2Test {
    TeamPhoto2 problem = new TeamPhoto2();

    @Test
    public void simpleTest(){
        TeamPhoto2.GraphVertex A = new TeamPhoto2.GraphVertex("A");
        TeamPhoto2.GraphVertex B = new TeamPhoto2.GraphVertex("B");
        TeamPhoto2.GraphVertex C = new TeamPhoto2.GraphVertex("C");
        TeamPhoto2.GraphVertex D = new TeamPhoto2.GraphVertex("D");
        TeamPhoto2.GraphVertex E = new TeamPhoto2.GraphVertex("E");
        TeamPhoto2.GraphVertex F = new TeamPhoto2.GraphVertex("F");
        List<TeamPhoto2.GraphVertex> teamList = Arrays.asList(A,B,C,D,E,F);

        A.edgeList.add(B);
        A.edgeList.add(F);
        B.edgeList.add(C);
        B.edgeList.add(D);
        C.edgeList.add(E);
        D.edgeList.add(E);

        int result = problem.findLargestNumberOfTeams(teamList);
        System.out.println("Result " + result);
    }

}
