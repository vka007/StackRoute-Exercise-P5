package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTheSetTest {

    SortTheSet ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new SortTheSet();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void testSortTheArrayReturnResult() {

        String result= SortTheSet.sortTheSet("Harry Olive Alice Bluto Eugene").toString();
        assertEquals("[Alice, Bluto, Eugene, Harry, Olive]",result);

    }
}