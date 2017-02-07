package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class PartitionerTest {
    Partitioner partitioner;

    @Before
    public void setup(){
        partitioner = new Partitioner();
    }

    @Test
    public void testTwoLevels(){
        List<Levels> levels = new ArrayList<Levels>();
        levels.add(Levels.SECOND);
        levels.add(Levels.FIRST);
        levels.add(Levels.FIRST);
        levels.add(Levels.SECOND);
        levels.add(Levels.FIRST);

        System.out.println("Before partitioning " + levels);
        partitioner.partition(levels,2);
        System.out.println("After partitioning " + levels);

        List<Levels> partitioned = new ArrayList<Levels>();
        partitioned.add(Levels.FIRST);
        partitioned.add(Levels.FIRST);
        partitioned.add(Levels.FIRST);
        partitioned.add(Levels.SECOND);
        partitioned.add(Levels.SECOND);

        assert levels.equals(partitioned);
    }

    @Test
    public void testThreeLevels(){
        List<Levels> levels = new ArrayList<Levels>();
        levels.add(Levels.THIRD);
        levels.add(Levels.SECOND);
        levels.add(Levels.FIRST);
        levels.add(Levels.THIRD);
        levels.add(Levels.SECOND);
        levels.add(Levels.FIRST);

        System.out.println("Before partitioning " + levels);
        partitioner.partition2(levels,2);
        System.out.println("After partitioning " + levels);

        List<Levels> partitioned = new ArrayList<Levels>();
        partitioned.add(Levels.FIRST);
        partitioned.add(Levels.FIRST);
        partitioned.add(Levels.SECOND);
        partitioned.add(Levels.SECOND);
        partitioned.add(Levels.THIRD);
        partitioned.add(Levels.THIRD);

        assert levels.equals(partitioned);
    }

    @Test
    public void testFourthLevels(){
        List<Levels> levels = new ArrayList<Levels>();
        levels.add(Levels.THIRD);
        levels.add(Levels.FOURTH);
        levels.add(Levels.FIRST);
        levels.add(Levels.THIRD);
        levels.add(Levels.SECOND);
        levels.add(Levels.FIRST);

        System.out.println("Before partitioning " + levels);
        partitioner.partition2(levels,2);
        System.out.println("After partitioning " + levels);

        List<Levels> partitioned = new ArrayList<Levels>();
        partitioned.add(Levels.FIRST);
        partitioned.add(Levels.FIRST);
        partitioned.add(Levels.SECOND);
        partitioned.add(Levels.THIRD);
        partitioned.add(Levels.THIRD);
        partitioned.add(Levels.FOURTH);

        assert levels.equals(partitioned);
    }
}
