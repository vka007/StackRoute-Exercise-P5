package com.stackroute.p5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyCountWords {

    public static String freqCount(String input)            //method body
    {
        if(input=="")                   //null vale check
        {
            return "Invalid input. Null";
        }

        String regex="[^a-zA-Z]";         //not letters

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        input=matcher.replaceAll(" ").trim();    // replaces non letters with space

        Map<String, Integer> myMap = new HashMap<String, Integer>();
        String[] strings=input.split("\\s+");

        for (String i :strings) {           //loop to check if string present and increase its count if it does
            Integer j = myMap.get(i);
            myMap.put(i,(j == null) ? 1 : j + 1);
        }
        return myMap.toString();            //return the map as string
    }
}
