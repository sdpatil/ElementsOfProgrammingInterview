package com.eip.chapter9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class NormalizePathNamesTest {
    NormalizePathNames normalizePathNames;

    @Before
    public void setup(){
        normalizePathNames = new NormalizePathNames();
    }

    @Test
    public void simpleTest(){
        //String normalizedPath = normalizePathNames.shortestEquivalentPath("sc//./../tc/awk/././");
        System.out.println("/usr/bin/gcc -> " + normalizePathNames.shortestEquivalentPath("/usr/bin/gcc"));
        System.out.println("/usr/lib/../bin/gcc -> " + normalizePathNames.shortestEquivalentPath("/usr/lib/../bin/gcc"));
        System.out.println("//./../scripts/awkscripts/././ -> " + normalizePathNames.shortestEquivalentPath("//./../scripts/awkscripts/././"));

    }

    @Test
    public void complexTest(){
        String normalizedPath = normalizePathNames.shortestEquivalentPath("sc//./../tc/awk/././");
        System.out.println("Normalize path " + normalizedPath);
    }
}
