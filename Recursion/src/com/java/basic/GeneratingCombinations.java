package com.java.basic;

import java.util.Arrays;
import java.util.Scanner;

public class GeneratingCombinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


            int n = in.nextInt();

            int[] vec = new int[n];

            print(arr, vec, 0,0 );
    }
    static void print(int[] arr, int[] vector, int index, int border){

        if (index > vector.length-1){
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = border; i < arr.length; i++) {
               vector[index] = arr[i];
               print(arr, vector, index+1,i+1);
            }
        }
    }
}




























