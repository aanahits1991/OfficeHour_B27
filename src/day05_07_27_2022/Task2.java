package day05_07_27_2022;

public class Task2 {
    public static void main(String[] args) {

        /*
        Task 2 :	Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
        		 trash can
         		 dish washer
         */


        String sentence="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        //split the sentence
        //get element one by one
        //if the element contains "  " it means multiple word

        String[] arr = sentence.split(", ");

        for (String element : arr) {
            if(element.contains(" ")){
                System.out.println(element);
            }
        }











       /* //split the sentence
        String[] words = sentence.split(", ");

        //get element one by one
        for (String element: words) {
            //if the element contains "  " it means multiple word
            if (element.contains(" "))
                System.out.println(element);

        }*/



    }
}
