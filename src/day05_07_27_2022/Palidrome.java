package day05_07_27_2022;

import java.util.Arrays;

public class Palidrome {
    public static void main(String[] args) {

        /*Task 4 :  For Each - Nested For

        Longest Palindrome

        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome*/


        String[] str = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};


        String longestPali = "";
        for (String each : str) {
            String reverse = "";
            String pali = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

            }
            if (reverse.equals(each)) {
                pali += each;
            }

            if (pali.length() > longestPali.length()) {
                longestPali = pali;
            }


        }

        if (longestPali.length() == 0) {
            System.out.print("No palindrome");
        }else {
            System.out.println("Longest Palindrome: " + longestPali);
        }


    }
}

