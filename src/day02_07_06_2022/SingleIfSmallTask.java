package day02_07_06_2022;

import java.util.Scanner;

public class SingleIfSmallTask {

    public static void main(String[] args) {
        /*
        Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temp.");
        int temp = scanner.nextInt();

        if (temp >= 70 && temp <= 80) {
            System.out.println("Ideal time");
        }else {
            System.out.println(" Not ideal temp");
        }


    }
}
