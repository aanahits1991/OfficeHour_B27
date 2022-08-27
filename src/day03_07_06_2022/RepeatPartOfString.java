package day03_07_06_2022;

public class RepeatPartOfString {
    public static void main(String[] args) {
        /*
        Create a method return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

						Input: "Hello" → "lololo"
						Input: "ab"    → "ababab"
						Input:  "Hi"   → "HiHiHi"
						
         */
        String word = "Hello";


        //if you want ot get one character you can use charAt()
        char l = word.charAt(2);

        //if you want to get length of string length()

        int length = word.length();
        if (length < 2)
            System.out.println(word + " length can not be smaller than 2");

        char lastCh = word.charAt(length - 1);
        char secondLastCh = word.charAt(length - 2);

        //01234
        //Hello
        //if you want to get some part of your string you can use substring()
        String el = word.substring(1, 3); //el
        String lo = word.substring(3, 5); //lo
        String lo2 = word.substring(3); //lo   //length-2
        String lo3 = word.substring(length - 2);


        System.out.println(lo3 + lo3 + lo3);
        System.out.println(lo3.repeat(3));


    }
}
