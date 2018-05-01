package com.java.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CombinationswithRepetition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] vector = new int[k];

        print(vector, n, k, 0, 1);
    }

    public static void print(int[] vector, int n, int k, int index, int border) {


        if (index >= k) {
            for (int i = 0; i < k; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = border; i <= n; i++) {
                vector[index] = i;

                print(vector, n, k, index + 1, i);

            }
        }

    }


}

