package com.java.basic;

import java.util.Scanner;

public class RecursiveDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Draw(n);
    }
    public static void Draw(int n){
        if (n < 1){
            return;
        }
        String str = new String(new char[n]).replace("\0", "*");
        System.out.println(str);
        Draw(n-1);

        String str2 = new String(new char[n]).replace("\0", "#");
        System.out.println(str2);





    }
}
