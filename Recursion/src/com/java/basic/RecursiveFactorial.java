package com.java.basic;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n  = in.nextInt();
        System.out.println(Fact(n));
    }
    public static long Fact(int n){
        if (n < 2){
            return 1;
        }
        return n * Fact(n-1);
    }
}
