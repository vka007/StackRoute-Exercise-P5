/*Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list*/

package com.stackroute.p5;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheSet {

    public static ArrayList<String> sortTheSet(String set) {            //method body

        String[] myArray = set.split(" ");                    //split the string
        ArrayList<String> list = new ArrayList<String>();               //create a new array list

        for(String arr:myArray) {                           //a for each loop

            list.add(arr);

        }

        Collections.sort(list);             //sort the collection
        return list;                //return result

    }


}
