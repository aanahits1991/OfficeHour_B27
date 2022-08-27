package day03_07_06_2022;

import java.util.Scanner;

public class EstimatedTime {
    public static void main(String[] args) {

        /*

        Assume that you have a plan to go from A to B point
        maxSpeed=80
        minSpeed=40

        - Ask the User
        - Car speed
        should be 40 - 80 mph
                -> if user enters smaller than minSpeed
                or
        bigger than maxSpeed
                -   assign for speed 60 as default
        -   otherwise assign for speed userInput(int)

                - startingpoint(string) and destination(string)
                - distance between this two points(double)

                According to this information calculate triptime;

        Formula of estimatedTime = distance/speed;

        Ex :

        Inputs :50,San Antonio,Dallas,300

        "The Estimated Time Of Arrival is 6.0 hours from San Antonio to Dallas "
*/
        int maxSpeed = 80;
        int minSpeed = 40;

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your speed");
        double speed = scanner.nextDouble();
        if (speed < minSpeed || speed > maxSpeed)
            speed = 60;  // if you have one statement only you don't have to use {}
/*
        if (speed < minSpeed || speed > maxSpeed) {
            speed = 60;

        }

 */
        System.out.println("please enter the distance");
        double distance = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("please enter the starting point");
        String startingPoint = scanner.nextLine(); //if you use nextLine() check before and put one more nextLine() in order to catch ENTER key

        System.out.println("please enter the ending point");
        String endingPoint = scanner.nextLine();

        double time = distance / speed;

        System.out.println("The Estimated Time Of Arrival is " + time + " hours from " + startingPoint + " to " + endingPoint);



    }
}
