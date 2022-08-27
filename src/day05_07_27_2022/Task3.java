package day05_07_27_2022;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

				Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

				Output : 4

         */

        String[] array = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};
        int count = 0;
        for (String names : array) {

            String first = names.charAt(0) + "";

            String last = names.charAt(names.length()-1) + "";

            if (first.equalsIgnoreCase(last)) {
                count++;
            }

        }

        System.out.println(count);




       /* //I need to get words one by one
        int count=0;
        for (String name:array) {

            // I need to get first character
            String first = name.charAt(0)+""; //if we want to use string method we need change data type char to String

            //I need to get last character
            // it returns char          //if we add "" in order to make it String
            String last = name.charAt(name.length() - 1)+"";

            //if the characters are same count it
            if (first.equalsIgnoreCase(last)){  //if you want to compare Upper Case and Lower Case we need to string method which is  equalsIgnoreCase()
                count++;
                System.out.println("name = " + name);
            }


        }
        System.out.println("count = " + count);*/


    }
}
