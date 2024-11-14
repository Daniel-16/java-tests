package com.example;

public class Main {
    public static void main(String[] args) {
        // Test prime numbers
        int[] numbersToTest = {2, 3, 4, 17, 100};
        for (int num : numbersToTest) {
            System.out.println(num + " is prime: " + NumberStringUtils.isPrime(num));
        }

        // Test isPalindrome
        String[] stringsToTest = {
            "radar",
            "A man a plan a canal Panama",
            "hello",
            null
        };
        
        for (String str : stringsToTest) {
            System.out.println("\"" + str + "\" is palindrome: " + NumberStringUtils.isPalindrome(str));
        }
    }
}