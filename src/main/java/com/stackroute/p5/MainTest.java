/*Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array*/

package com.stackroute.p5;

import java.util.*;

public class MainTest {

    public String display(ArrayList<Student> students) {

        Comparator<Student> studentComparator = new StudentSorter();        //create object of comparator
        Collections.sort(students, studentComparator);          //sort the list
        return students.toString();

    }





}


