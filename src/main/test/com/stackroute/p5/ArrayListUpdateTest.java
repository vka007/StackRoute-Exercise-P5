package com.stackroute.p5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {

    ArrayListUpdate ob;

    @org.junit.Before
    public void setUp() throws Exception {
    ob = new ArrayListUpdate();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void arrayListStringUpdate()
    {
        ArrayList<String> input = new ArrayList<>();

        input.add("Apple");
        input.add("Orange");
        input.add("Banana");
        input.add("Guava");
        input.add("Mangoes");

        ArrayList<String> Result = ob.replaceListElement(input,"Orange","Kiwi");

        ArrayList<String> compare = new ArrayList<>();
        compare.add("Apple");
        compare.add("Kiwi");
        compare.add("Banana");
        compare.add("Guava");
        compare.add("Mangoes");

        assertEquals(compare,Result);
    }
}