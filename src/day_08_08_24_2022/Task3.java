package day_08_08_24_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3 : String numbers to sum

					Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.

					Ex:

					Input:
					“123”, “34”, “513”

					Output:
					[ 6, 7, 9 ]
         */
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("123", "34", "513"));

        ArrayList<Integer> results = new ArrayList<>();
        //get the string one by one
        for (String number : numbers) {
            //get the string value of integer
            Integer sum = getValue(number);
            //put the sum inside the Integer list
            results.add(sum);
        }
        System.out.println("results = " + results);


    }

    private static Integer getValue(String number) {
        //"123"
        int sum=0;
        for (int i = 0; i < number.length(); i++) {
            //need to get character one by one
            String c =""+ number.charAt(i);
            //convert to String to integer
            Integer integer = Integer.valueOf(c);
            //need to add this value inside the sum
            sum+=integer;
        }
        return sum;
    }
}