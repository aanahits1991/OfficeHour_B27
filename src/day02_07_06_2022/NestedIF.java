package day02_07_06_2022;

public class NestedIF {
    public static void main(String[] args) {
/*    ( Scanner Class can be used )


					        Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"

      				   */

        int age = 18;
        int weight = 60;


        if (age>=18){

            if (weight >= 50){
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");

            }


        }else {
            System.out.println("Age must be greater than 18");
        }

















    }


    public static class TypeCasting {

        public static void main(String[] args) {

            /*
        Type Casting:

        1- Implicit Casting:
           * Done By Compiler
           * Smaller to Bigger
           * No Loss Data

        2- Explicit Casting:
           * Done By Developer
           * Bigger to Smaller
           * we can loss data but not always

    **** for numeric data types default int
    ****
        byte<short<int<long<float<double

         */

            byte b = 20;
            short s = b; // implicit

            byte b1 = (byte) s;
            int i = 45;
            short s2 = (short)i;

        }
    }
}
