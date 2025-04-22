package com.practice.wissen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        // Step 1: Create and populate the HashMap
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Lovey", 25);
        mp.put("techie", 23);
        mp.put("java", 21);

        // Step 2: Convert map to a list of entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());

        // Step 3: Sort the list based on values (ascending)
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        // Step 4: Create a LinkedHashMap to maintain the sorted order
        Map<String, Integer> sortedMp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMp.put(entry.getKey(), entry.getValue());
        }

        // Step 5: Print the sorted map
        System.out.println("Sorted Map (by values):");
        System.out.println(sortedMp);
    }
}

