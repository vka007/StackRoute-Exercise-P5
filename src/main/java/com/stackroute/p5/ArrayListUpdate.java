package com.stackroute.p5;

import java.util.ArrayList;

public class ArrayListUpdate {

    public static ArrayList<String> replaceListElement(ArrayList inputArr, String find, String replace)     //method body
    {
        int index = inputArr.indexOf(find);            //find the index of the string to be found
        inputArr.set(index,replace);                    //replace that word

        ArrayList<String> Result = new ArrayList<>(inputArr);       //init a new list array

        inputArr.clear();              //clear the input array
        return Result;                  //return result
    }
}
