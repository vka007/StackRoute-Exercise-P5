package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class ModifyMapTest {

    ModifyMap ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new ModifyMap();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void testModifyMapReturnOutputMap() {

        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String, String> res = new HashMap<String, String>();
        res = ob.mapModification(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", "java");

        assertEquals(output, input);

    }
}