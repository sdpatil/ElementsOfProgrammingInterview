package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/22/17.
 */
public class MissingIPAddressTest {
    MissingIPAddress missingIPAddress;

    @Before
    public void setup(){
        missingIPAddress = new MissingIPAddress();
    }

    @Test
    public void simpleTest(){
        List<Integer> ipList = Arrays.asList(1270000001);
        missingIPAddress.findMissingElement(ipList);
    }
}
