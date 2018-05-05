package sort.algo.com;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,8,3,6,4,1,5};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
  public static void SelectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int k = i; k < arr.length; k++)
            {
                if (arr[i] > arr[k])
                {
                    int tmp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
}
