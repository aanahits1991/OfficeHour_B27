package day02_07_06_2022;

public class MultiIf {
    public static void main(String[] args) {

      int number = 10;


      /*
      number smaller 0 ----invalid----
      number between 1 and 3 ----good -----
      number between 4 and 8 --- better---
      number than 8 --------best---
       */


        if (number >= 8){
            System.out.println("best");
        } else if ( number<=4){
            System.out.println( "better");
        } else if (number >= 1){
            System.out.println("good");
        }else {
            System.out.println("invalid");
        }






    }
}
