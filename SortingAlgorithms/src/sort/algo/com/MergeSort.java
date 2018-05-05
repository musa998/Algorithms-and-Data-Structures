package sort.algo.com;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    static int[] arr2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {8, 1, 3, 6, 2};

        MergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void Merge(int[] arr, int l, int m, int r) {
        int i = 0, j = 0, k = l;
        int[] leftArray = new int[m - l + 1];
        int[] rightArray = new int[r - m];

        for (int x = 0; x < leftArray.length; x++) {
            leftArray[x] = arr[l + x];
        }

        for (int z = 0; z < rightArray.length; z++) {
            rightArray[z] = arr[z + m + 1];
        }

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void MergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);
            Merge(arr, l, m, r);
        }
    }
}