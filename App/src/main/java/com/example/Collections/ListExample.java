package main.java.com.example.Collections;
import java.util.*;

/**
 LIST:
   - Ordered collection
   - Allows duplicates
   - Access by index
 */

public class ListExample {
    public static void main(String[] args) {
        // Create a list of strings
        java.util.List<String> fruits = new java.util.ArrayList<>();
        
        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Access elements by index
        System.out.println("First fruit: " + fruits.get(0));
        
        // Iterate through the list
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("-----");
        
        // Iterate through the list with index i
        for (int i=0;i<fruits.size();i++) {
            System.out.println( fruits.get(i) );
        }
        
        System.out.println("-----");
        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate with Iterator
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println("Iterating: " + it.next());
        }
        
        // Check if the list contains an element
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        
        // Get the size of the list
        System.out.println("Number of fruits: " + fruits.size());
    }
}
