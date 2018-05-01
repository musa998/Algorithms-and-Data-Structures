package com.java.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int[] n  = Arrays.stream(in.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        System.out.println(Sum(n,0));

    }
    public static int Sum(int[] arr, int index){

        int res;
        if (index == arr.length-1){
            res  = arr[index];
        }
        else {
            res = arr[index] + Sum(arr, index + 1);
        }
        return res;
    }
}
