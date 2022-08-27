package day02_07_06_2022;

public class IfSmallTasks {


    /*-Write an if statement that assigns 5 to x when y is equal to 20

     */

    public static void main(String[] args) {
        int x;
        int y = 20;

        if (y == 20) {
            x = 5;
            System.out.println(x);
        }
        System.out.println("------------------");

// Write an if statement that multiplies payrate by 1.5 if hours is greater than 40
        int hours = 50;
        double payrate = 2;

        if (hours > 40) {
            payrate *= 1.5;
            System.out.println(payrate);
        }

        System.out.println("---------------------");

//Write an if statement that sets the variable fees to 50 if the boolean variable max is true

        int fees = 50;
        boolean max = true;

        if(max){
            fees = 50;
            System.out.println(fees);
        }

        System.out.println("-------------------");

//Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater than 100

        int a = 0;
        int b = 50;
        int c = 101;

        if(b == 50 && c >100){
            a=20;
            System.out.println(a);
        }








    }
}
