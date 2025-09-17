package main.java.com.example.CodeExamples;

import java.util.*;

public class findDuplicates {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 1};
        Set<Integer> duplicates = findDuplicates(numbers);
        System.out.println("Duplicates: " + duplicates);
    }
    public static HashSet<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int x : arr){

            if(seen.contains(x)){
                duplicates.add(x);
            }
            else {
                seen.add(x);
            }

        }
        return duplicates;
    }
    
}
