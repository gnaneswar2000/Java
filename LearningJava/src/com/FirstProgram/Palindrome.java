package com.FirstProgram;

import java.util.Scanner;

public class Palindrome {
    
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        
        return str.equals(reverse.toString());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome!");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }
        
        scanner.close();
    }
}
