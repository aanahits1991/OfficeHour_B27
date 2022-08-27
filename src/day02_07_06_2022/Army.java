package day02_07_06_2022;

public class Army {
    public static void main(String[] args) {

        /*
					        [Qualification For Army]

					        Given information: citizenship(boolean), resident (boolean), and has high school diploma (boolean),

					        and age(int). Determine if the person is qualified to join the army.

					        - The person must be a Citizen of the USA or a resident
					        -> If not print: You must be a U.S. citizen or a resident

					        - Their age must be between 18 and 35
					        -> If not print: Your age must be between 18 to 35 years old

					        - They must have a high school diploma
					        -> If not print: You must have a high school diploma

					        > If all the criteria is met print: You are qualified for the US Army

					     */

/*
        boolean citizenship = true;
        boolean resident = false;
        boolean hasDiploma = true;
        int age = 32;

        if ((age >= 18 && age <= 35) && (citizenship || resident) && (hasDiploma)) {
            System.out.println("You are qualified for the US Arm");

            if (age < 0 && age > 120) {
                System.out.println("Not valid age");
            }

        } else {
            System.out.println("You are too young");
        } else if (age > 35) {
            System.out.println("You are too old");
        }


        if (!hasDiploma) {
            System.out.println("You must have diploma");
        }

        if (!resident || !citizenship) {
            System.out.println("Must be a citizen or resident");*/


/*
 int age =20;
        boolean hasDiploma =true;
        boolean isCitizen = true;

        if((age >= 18 && age <=35) && hasDiploma && isCitizen){
            System.out.println("You qualify for the Army");
        }else {
            if (age<0 || age>120 ){
                System.out.println("Not a valid age");
            }else if (age <18){
                System.out.println("You are too young, need to be at least 18");
            } else if(age > 35){
                System.out.println("You are too old, limit is 35 years old");
            }

            // if to check about diploma

            if(!hasDiploma){ // if you don't have a diploma then:
                System.out.println("You need at least a high school diploma");
            }

            // if to check about citizenship
            if(!isCitizen){
                System.out.println("You need to be a citizen to apply");
            }



 */

        }
    }






