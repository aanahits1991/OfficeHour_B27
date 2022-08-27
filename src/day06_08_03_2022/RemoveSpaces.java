package day06_08_03_2022;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {
        /*
        Task 3 :    Write a method that can remove  all extra space from String


                 Input: "  Hello world      I      love      Java    "
                 Output: Hello world I love Java
         */

        String str = "  Hello world      I      love      Java    ";
        String result = removeSpaces(str);
        System.out.println("result = " + result);


    }

    public static String removeSpaces(String str) {
        str = str.trim(); //Hello world      I      love      Java
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
        String result = "";


        for (String each : s) {
            if (!each.isEmpty())
                result += each.trim() + " ";
        }
        return result.trim();

    }
}

