package com.java.basic;

import java.util.Arrays;
import java.util.Scanner;

public class NestedLoopsToRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] vector = new int[n];

            Print(n, vector, 0,1);

    }
    public static void Print(int n, int[] vector, int index ,int border){

        if (index == n){
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.println();
        }

        else {
            for (int i = border; i <= n; i++) {
                vector[index] = i;
                Print(n, vector, index + 1, border);
            }
        }

    }
}
