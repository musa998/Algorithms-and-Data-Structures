package sort.algo.com;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7};
        int middle = arr.length/2;
        int key  = in.nextInt();
        System.out.println(IndexOf(arr, key, middle));
    }
    public static int IndexOf(int[] arr, int key, int mid) {

            if (arr[mid] == key){
                return mid;
            }
            else  if (arr[mid] < key){
                IndexOf(arr, key, mid+1);
            }
            else {
                IndexOf(arr, key, mid-1);
            }
            return 0;
    }
}
