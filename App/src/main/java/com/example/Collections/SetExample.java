package main.java.com.example.Collections;
import java.util.*;

/**
 SET:
   - No duplicates
   - No index access
   - Common implementations: HashSet, TreeSet, LinkedHashSet
 */
public class SetExample {   
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, won't be added

        System.out.println("Set contains:");
        for(String x : set){
            System.out.println(x);
        }

        System.out.println("---");
        
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---");
        System.err.println("remove Banana: ");
        set.remove("Banana");
        
        // System.out.println("---");
        it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---");
        System.out.println("Set contains Apple? " + set.contains("Apple"));

    }

}
