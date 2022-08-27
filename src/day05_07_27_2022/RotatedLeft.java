package day05_07_27_2022;

import java.util.Arrays;

public class RotatedLeft {
    public static void main(String[] args) {
          /*
        Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left”

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]

         */
        int[] x = {1, 2, 3, 4, 5, 6};

        int var = x[0]; // var =1

        //  x[0] = x[1];
        // x[1] = x[2];
        //.    .
        //.     .


        for (int i = 0; i < x.length - 1; i++) {
            //at the last i=x.length-2  i+1=x.length-1
            x[i] = x[i + 1];

        }

        x[x.length - 1] = var;

        System.out.println("Arrays.toString(x) = " + Arrays.toString(x));

        int[] y = {17, 12, 10, 8};
        int num = y[0];

        for (int i = 0; i < y.length - 1; i++) {
            y[i] = y[i+1];
        }

        y[y.length - 1] = num;
        System.out.println(Arrays.toString(y));




        int[] a = {7,0,0};

        int num2= a[0];


        for (int i = 0; i < a.length-1; i++) {
            a[i] = a[i+1];

        }
        a[a.length-1] =num2;
        System.out.println(Arrays.toString(a));



    }
}
