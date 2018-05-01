package com.java.basic;

import org.w3c.dom.ranges.Range;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TowerofHanoi {
    private static int steps = 0;
    private static Stack<Integer> source = new Stack<>();
    private static Stack<Integer> destination = new Stack<>();
    private static Stack<Integer> spare = new Stack<>();
    private static int stepsTaken = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
//
//        Stack<Integer> source = new Stack<>();
//        Stack<Integer> destonation = new Stack<>();
//        Stack<Integer> spare = new Stack<>();
        //Stack<Integer> source = new Stack<>();
        for (int i = n; i > 0; i--) {
            source.push(i);
        }
        PrintRods();
        MoveDisk(n, source, destination, spare);
    }

    static void MoveDisk(int bottomDisk, Stack<Integer> source, Stack<Integer> destination, Stack<Integer> spare) {

        if (bottomDisk == 1) {
            stepsTaken++;
            destination.push(source.pop());

            System.out.printf("\nStep #%d: Moved disk %d", stepsTaken, bottomDisk);
            PrintRods();
        } else {
            MoveDisk(bottomDisk - 1, source, spare, destination);
            stepsTaken++;

            System.out.printf("Step #%d: Moved disk %d", stepsTaken, bottomDisk);
            PrintRods();
            MoveDisk(bottomDisk - 1, spare, destination, source);
        }
    }

    public static void PrintRods() {

        if (stepsTaken != 0) {
            System.out.println();
        }
        System.out.print("Source: ");
        for (int i = 0; i <= source.size() - 1; i++) {
            if (i == source.size() - 1) {
                System.out.print(source.get(i));
                System.out.println();
                break;
            }
            System.out.print(source.get(i) + ", ");
        }
        /// For the destination

        System.out.print("Destination: ");
        for (int i = destination.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(destination.get(i));
                System.out.println();
                break;
            }
            System.out.print(destination.get(i) + ", ");
        }
        // For the Spare
        if (destination.size() == 0) {
            System.out.println();
        }
        System.out.print("Spare: ");
        for (int i = spare.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(spare.get(i));
                System.out.println();
                break;
            }
            System.out.println(spare.get(i) + ", ");
        }
        System.out.println();

    }

}

