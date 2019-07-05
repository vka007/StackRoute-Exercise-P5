package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayOfStringsTest {

    ArrayOfStrings ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new ArrayOfStrings();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkArrayOfStringsReturnMap() {

        Map<String, Boolean> newMap = new HashMap<>();
        String[] input = {"a", "b", "c", "d", "a", "c", "c"};
        Map res = ob.checkArrayOfStrings(input);
        newMap.put("a", true);
        newMap.put("b", false);
        newMap.put("c", true);
        newMap.put("d", false);
        assertEquals(newMap, res);

    }
}