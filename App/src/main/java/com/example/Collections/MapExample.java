package main.java.com.example.Collections;

import java.util.*;
/**
 * MAP:
   - Key → Value pairs
   - Keys are unique, values can duplicate
   - Common implementations: HashMap, TreeMap, LinkedHashMap
 */
public class MapExample {
    public static void main(String[] args){
        Map<Integer, String> employeesMap = new HashMap<>();

         // Add entries
        employeesMap.put(101, "Alice");
        employeesMap.put(102, "Bob");
        employeesMap.put(103, "Charlie");
        employeesMap.put(101, "Alex"); // overwrites value for key 101

        // Access by key
        System.out.println("Employee 102: " + employeesMap.get(102));

        // Iterate keys
        for (Integer id : employeesMap.keySet()) {
            System.out.println("ID: " + id);
        }

        // Iterate values
        for (String name : employeesMap.values()) {
            System.out.println("Name: " + name);
        }

        // Iterate entries
        for (Map.Entry<Integer, String> entry : employeesMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Iterator example
        Iterator<Map.Entry<Integer, String>> it = employeesMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> e = it.next();
            System.out.println("Iterating -> " + e.getKey() + ": " + e.getValue());
        }
    }
    
}
