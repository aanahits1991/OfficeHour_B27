package day06_08_03_2022;

public class IsPrime {
    /*Task 1 :   Write a method that can check if a number is prime or not

    Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1

            */
    //7
    public static void main(String[] args) {
        int num=5;
        boolean isPrimeNumber=isPrime(num);

        for (int i = 1; i <=100 ; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }

        }
    }

    public static boolean isPrime(int num) {
        //we need to check number greater than 1
        if (num<2){
            return false;
        }

        //we need to check the numbers from 2 to itself it will not divide any number
        for (int i = 2; i < num; i++) {
            if (num%i==0)
                return false;
        }
        return true;


    }

}