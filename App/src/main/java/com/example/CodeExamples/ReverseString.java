package main.java.com.example.CodeExamples;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverse(String original) {
        StringBuilder reversed = new StringBuilder();
        for(int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }
        return reversed.toString();
    }
    
}
