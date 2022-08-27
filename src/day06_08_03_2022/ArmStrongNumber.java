package day06_08_03_2022;

public class ArmStrongNumber {
     /*
	Task 2 :   Write a method that can check if a number is Armstrong number

				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
				Armstrong numbers are     === 153 370 371 407 === for 3 digits
     */
    //153
    /*
    1*1*1=1
    5*5*5=125
    3*3*3=27
    125+27+1=153

     */

    public static void main(String[] args) {
        boolean isArmstrongNumber = isArmstrong(153);
        System.out.println("isArmstrongNumber = " + isArmstrongNumber);

    }

    public static boolean isArmstrong(int number) {
        //you can convert number to string and you can get the numbers with split and
        //you can use wrapper classes

        //last digit
        int lastDigit = number % 10; // 153%10=3

        //second digit
        int result = number / 10; //result=153/10=15
        int secondDigit = result % 10; //15%10=5

        //third digit
        int thirdDigit = number / 100; //153/100 = 1
/*
        int total = (lastDigit * lastDigit * lastDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit);

 */
        int total= (int) (Math.pow(lastDigit, 3)+Math.pow(secondDigit, 3)+Math.pow(thirdDigit, 3));




        if (total == number)
            return true;
        else
            return false;

    }

}
