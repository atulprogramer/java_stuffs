package com.adanave.programs.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PS3_FindMaxCountOfRepeatWordsInString {
    public static void main(String[] args) {
        String str = "My name is Atul name is atul name is";
        String[] strarray = str.split("\\s");
        
        // get unique strings in array
        HashSet<String> uniqueArray= new HashSet<String>(Arrays.asList(strarray));        
        List<String> uniqueList= new ArrayList<String>(uniqueArray);
        
        HashMap<String,Integer> hashmap= new HashMap<String,Integer>();
        int count = 0;
        for (int i = 0; i < uniqueList.size(); i++) {
            for (int j = 0; j < strarray.length; j++) {
                if (uniqueList.get(i).equals(strarray[j])){
                    count++;
                }
            }
            hashmap.put(uniqueList.get(i), count);
            count = 0;
        }
         //Get the key which has higher value
        int maxValueInMap= Collections.max(hashmap.values());
        
        for(Map.Entry<String,Integer> entry:hashmap.entrySet()) {
        	if(entry.getValue()==maxValueInMap) {
        		System.out.println(entry.getKey());
        	}
        }
        
    }

}