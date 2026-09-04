package Sorting;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        arr = MergeSortInPlace(arr, 0,1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] MergeSortInPlace(int[] arr, int s,int e){
        if(e - s == 1){
            return arr;
        }
        int mid = (s + e)/ 2;
        MergeSortInPlace(arr,s,mid);
        MergeSortInPlace(arr,mid,e);
        mergeInPlace(arr, s, mid, e);
        return arr;
    }

    private static void mergeInPlace(int[] arr, int s, int e, int m) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }


        for (int l = 0; l < mix.length; l++) {

        }
    }

}

