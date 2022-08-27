package day02_07_06_2022;

public class IFElseSmallTask {
    public static void main(String[] args) {
        /*
        Create  program to check whether a character is an alphabet or not
							An input character is an alphabet if it lies in between a-z or A-Z.

							INPUT : '.'			EXPECTED : Your letter is not in alphabet

 							INPUT : 'a'			EXPECTED : Your letter is in alphabet

         */

        char input = 'A';

if((input >= 'a' && input <='z') || (input >= 'A' && input <='Z')){

    System.out.println("is alphabet");
}else {
    System.out.println("not alphabet");
}







    }
}
