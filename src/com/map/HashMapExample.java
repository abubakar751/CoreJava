package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
       int a=10;
        // HashMap ka object create karna
       Map<Integer, String> studentMap = new HashMap<>();

        // Key-value pairs add karna
        studentMap.put(101, "Rahul");
        studentMap.put(102, "Anjali");
        studentMap.put(103, "Vikram");
for (Integer key:studentMap.keySet()){
    System.out.println(key +" "+studentMap.get(key));
}

    }
}
