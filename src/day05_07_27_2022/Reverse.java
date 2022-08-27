package day05_07_27_2022;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        /*
        Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left”

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]

         */

        int[] x = {1,2,3};			 // = > [2,3,1]
        int[] y = {17,12,10,8};		 // = > [12,10,8,17]
        int[] a = {7,0,0};

        int[] reverse = new int[x.length];

        for(int i = x.length-1, j = 0; i >= 0; i--, j++){
            reverse[j] = x[i];
        }
        System.out.println(Arrays.toString(reverse));

    }
}
