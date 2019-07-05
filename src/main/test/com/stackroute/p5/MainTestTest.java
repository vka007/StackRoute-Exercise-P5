package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {

    MainTest ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new MainTest();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void testDisplaySortedArrayList() {

        Student stu1 = new Student(12, "abc", 20);
        Student stu2 = new Student(34, "def", 19);
        Student stu3 = new Student(56, "ghi", 21);
        Student stu4 = new Student(78, "jkl", 20);
        Student stu5 = new Student(90, "mno", 18);

        ArrayList<Student> output = new ArrayList<Student>();

        output.add(stu1);
        output.add(stu2);
        output.add(stu3);
        output.add(stu4);
        output.add(stu5);

        String res = ob.display(output);
        assertEquals("[Student{id=90, name='mno', age=18}, Student{id=34, name='def', age=19}, Student{id=12, name='abc', age=20}, Student{id=78, name='jkl', age=20}, Student{id=56, name='ghi', age=21}]", res);

    }
}