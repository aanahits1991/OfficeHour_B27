package day04_07_20_2022;

public class CountChars {
    public static void main(String[] args) {
        /*
        Count upper, lower, and numbers


					        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.

					        Input: 2juMp41EEkd4s4

					        Output:
					        3 uppercase letters   result : MEE
					        6 lowercase letters   result : jupkds
					        5 numbers             result : 24144

         */
        String str = "2juMp41EEkd4s4";
        int countLower = 0;
        int countUpper = 0;
        int countNumber = 0;

        String resultForUpper = "";
        String resultForLower = "";
        String resultForNumber = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                countLower++;
                resultForLower+=ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                countUpper++;
                resultForUpper+=ch;
            } else if (ch >= '0' && ch <= '9') {
                countNumber++;
                resultForNumber+=ch;
            }

        }

        System.out.println("countNumber = " + countNumber);
        System.out.println("countUpper = " + countUpper);
        System.out.println("countLower = " + countLower);

        System.out.println("resultForNumber = " + resultForNumber);
        System.out.println("resultForUpper = " + resultForUpper);
        System.out.println("resultForLower = " + resultForLower);



    }
}
