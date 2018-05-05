package sort.algo.com;

public class ShellSort {
    public static void main(String[] args) {

        int[] arr = {7,14,3,15,88,2,5,22,8,6,4,9,3,44,56};
        ShellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void ShellSort(int[] arr){
        int h=1;
        while(h<= arr.length/3){
            h = 3*h + 1;
        }
        while(h>0){

            for(int i=0; i<arr.length; i++){

                int temp = arr[i];
                int j;

                for(j=i; j>h-1 && arr[j-h] >= temp; j=j-h){
                    arr[j] = arr[j-h];
                }
                arr[j] = temp;
            }
            h = (h-1)/3;
        }
    }
}
