package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class ComputeValidIPAddressTest {

    ComputeValidIPAddress computeValidIPAddress;

    @Before
    public void setup(){
        computeValidIPAddress = new ComputeValidIPAddress();
    }

    @Test
    public void simpleTest(){
        List<String> ips = computeValidIPAddress.getValidIPAddress("19216811");
        for(String ip: ips)
            System.out.println(ip);
    }
}
