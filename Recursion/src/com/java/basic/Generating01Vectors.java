package com.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Generating01Vectors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        Generate(arr,0);


    }
    public static void Generate(int[] vector, int index){

        if (index > vector.length-1){
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.println();

        }
        else {
            for (int i = 0; i <= 1; i++) {
                vector[index] = i;
                Generate(vector, index + 1);
            }
        }

    }
}
