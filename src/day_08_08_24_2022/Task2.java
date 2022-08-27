package day_08_08_24_2022;




import java.util.ArrayList;
import java.util.Arrays;

    public class Task2 {
        public static void main(String[] args) {
        /*
        Task 2 : Hide Passwords

			        Given an arraylist of passwords (String). Hide each password as a star (*) and show the hidden password

					Ex:

					Input:
					{"one", "hi", "hold"}

					Output:
					[ ***, **, **** ]
         */

            ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
            ArrayList<String> hiddenPasswords = new ArrayList<>();
            //get the password one by one
            for (String password : passwords) {
                //hide the password with *
                String hiddenPassword = hidePassword(password, '*');

                //put the hidden password in other list

                hiddenPasswords.add(hiddenPassword);


            }
            System.out.println("hiddenPasswords = " + hiddenPasswords);


        }

        private static String hidePassword(String password, char c) {
            String hiddenPassword="";

            for (int i = 0; i < password.length(); i++) {
                hiddenPassword+=c;
            }
            return hiddenPassword;


        }
    }


