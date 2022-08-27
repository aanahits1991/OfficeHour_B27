package day02_07_06_2022;

public class TernaryTask {
    public static void main(String[] args) {


        int a = 10;
        int b = 5;

        /*
        ? -> if
        : -> else
         */
       String result = a>b? // if(a>b)
       "bigger"  // if correct
       :        //else
       "less";

short result2 = (short) (a>b?a:b);

       // short result2 = (short) (a>b?a:b)
    }
}
