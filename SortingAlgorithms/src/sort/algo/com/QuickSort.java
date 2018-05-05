package sort.algo.com;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {8, 4, 6, 2, 7};
        QuickSort(arr   ,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
    public static void  QuickSort(int[] array, int left, int right){
        int pivot = array[(left + right) / 2];
        int i = left;
        int j = right;

        while (i <= j)
        {
            while (array[i] < pivot)
            {
                i++;
            }

            while (array[j] > pivot)
            {
                j--;
            }

            if (i <= j)
            {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        if (i < right)
        {
            QuickSort(array, i, right);
        }

        if (left < j)
        {
            QuickSort(array, left, j);
        }
    }
}
