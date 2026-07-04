package Sorting;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3, 5, 6, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr,last);
            swap(arr, maxIndex,last);
        }
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    static int getMaxIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
