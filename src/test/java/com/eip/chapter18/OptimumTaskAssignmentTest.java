package com.eip.chapter18;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/12/17.
 */
public class OptimumTaskAssignmentTest {
    OptimumTaskAssignment optimumTaskAssignment;

    @Before
    public void setup(){
        optimumTaskAssignment = new OptimumTaskAssignment();
    }

    @Test
    public void optimumTaskAssignmentEvenTest(){
        List<Integer> taskList = new ArrayList<Integer>();
        taskList.add(5);
        taskList.add(2);
        taskList.add(1);
        taskList.add(6);
        taskList.add(4);
        taskList.add(4);
        List<OptimumTaskAssignment.PairedTasks> assignmentList =  optimumTaskAssignment.optimumTaskAssignment(taskList);
        System.out.println(assignmentList);

      /*  List<OptimumTaskAssignment.PairedTasks> assignmentResultList = new ArrayList<OptimumTaskAssignment.PairedTasks>();
        assignmentResultList.add(new OptimumTaskAssignment.PairedTasks(1,6));
        assignmentResultList.add(new OptimumTaskAssignment.PairedTasks(2,5));
        assignmentResultList.add(new OptimumTaskAssignment.PairedTasks(4,4));


        System.out.println(assignmentResultList);
        assert Arrays.asList(new OptimumTaskAssignment.PairedTasks(6,1),
                new OptimumTaskAssignment.PairedTasks(5,2),
                new OptimumTaskAssignment.PairedTasks(4,4)).equals(assignmentList);
                */

    //  assert assignmentList.equals(assignmentResultList);
    }

    @Test
    public void optimumTaskAssignmentOddTest(){
        List<Integer> taskList = Arrays.asList(5,2,1,6,4);
        List<OptimumTaskAssignment.PairedTasks> assignmentList =  optimumTaskAssignment.optimumTaskAssignment(taskList);
        System.out.println(assignmentList);
    }
}
