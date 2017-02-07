package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class DutchNationalFlagTest {
    DutchNationalFlag dutchNationalFlag;

    @Before
    public void setup(){
        dutchNationalFlag = new DutchNationalFlag();
    }

    @Test
    public void testSimple(){
        List<Color> flags = new ArrayList();
        flags.add(Color.RED);
        flags.add(Color.WHITE);
        flags.add(Color.BLUE);
        flags.add(Color.RED);
        flags.add(Color.BLUE);
        flags.add(Color.WHITE);
        flags.add(Color.WHITE);

        dutchNationalFlag.dutchFlagPartition4(Color.WHITE.ordinal(),flags);

        System.out.println("Partitioned flags " +flags);
        List<Color> partitioned = new ArrayList();
        partitioned.add(Color.RED);
        partitioned.add(Color.RED);
        partitioned.add(Color.WHITE);
        partitioned.add(Color.WHITE);
        partitioned.add(Color.WHITE);
        partitioned.add(Color.BLUE);
        partitioned.add(Color.BLUE);

        assert flags.equals(partitioned);
    }
}
