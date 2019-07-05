package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class FrequencyCountWordsTest {

    FrequencyCountWords ob;

    @Before
    public void setUp() throws Exception {
    ob = new FrequencyCountWords();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void conutWordsInMap()
    {
        String input = "one one -one___two,,three,one @three*one?two";
        String mySet= ob.freqCount(input);
        assertEquals("{one=5, two=2, three=2}",mySet);
    }

    @Test
    public void conutWordsInMapInputInvalid()
    {
        String input = "";
        String mySet= ob.freqCount(input);
        assertEquals("Invalid input. Null",mySet);
    }


}