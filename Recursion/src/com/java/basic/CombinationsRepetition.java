package com.java.basic;

import java.util.Scanner;

public class CombinationsRepetition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n  = in.nextInt();
        int m = in.nextInt();

        int[] arr  = new int[m];
        print(arr, n, m, 0, 1);
    }
    public static void print(int[] arr,int n,int m, int index, int border){

        if (index == m){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = border; i <= n; i++) {
                arr[index] = i;
                print(arr, n, m, index+1,i+1);
            }
        }
    }
}
