package com.eip.chapter18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/12/17.
 */
public class OptimumTaskAssignment {
    public static class PairedTasks {
        public Integer task1;
        public Integer task2;

        public PairedTasks(Integer task1, Integer task2) {
            this.task1 = task1;
            this.task2 = task2;
        }

        @Override
        public String toString() {
            return "PairedTasks{" +
                    "task1=" + task1 +
                    ", task2=" + task2 +
                    '}';
        }
    }

    public List<PairedTasks> optimumTaskAssignment(List<Integer> taskDurations) {
        List<PairedTasks> taskAssignment = new ArrayList<PairedTasks>();

        Collections.sort(taskDurations);
        int start = 0;
        int end = taskDurations.size() - 1;
        while (start <= end) {
            taskAssignment.add(new PairedTasks(taskDurations.get(start), taskDurations.get(end)));
            start++;
            end--;
        }

        return taskAssignment;
    }

}
