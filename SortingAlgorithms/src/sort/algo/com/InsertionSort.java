package sort.algo.com;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int[] arr = {2,5,3,4,8,7,2,6,5,4,3,1};
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void  InsertionSort(int[] arr){

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
