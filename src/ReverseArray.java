import java.util.Arrays;

//Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
//Input: n=5, arr = [1,2,3,4,5]   Output: [5,4,3,2,1]

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
//        for(int num: arr){
//            System.out.print(num+ " ");
//        }
    }
}
