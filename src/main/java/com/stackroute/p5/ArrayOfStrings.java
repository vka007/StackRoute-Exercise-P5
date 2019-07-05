/*Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array*/

package com.stackroute.p5;

import java.util.HashMap;
import java.util.Map;

public class ArrayOfStrings {

    public Map checkArrayOfStrings(String[] input) {            //method body

        Map<String, Boolean> output = new HashMap<>();      //create a map
        int count;

        for(int i=0; i<input.length; i++) {             //loop to calculate occurance count
            count = 0;
            for(int j=0; j<input.length; j++) {

                if(input[i].equals(input[j]))
                    count++;
            }

            if(count >=2)               //loop to check tif count greater than 2 or not
                output.put(input[i], true);
            else
                output.put(input[i], false);

        }

        return output;          //return result

    }

}
