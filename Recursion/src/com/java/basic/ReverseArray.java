package com.java.basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int index  = arr.length-1;

            Reverse(arr, index);
    }
    public static void  Reverse(int[] arr, int index) {

        if (index == 0) {
            System.out.println(arr[0]);
            return;
        } else {
            System.out.print(arr[index] + " ");
            Reverse(arr, index - 1);
        }
    }
}
