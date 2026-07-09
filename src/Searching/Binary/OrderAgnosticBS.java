package Searching.Binary;

public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr = { -23,-12,-6,2, 4, 5 ,6, 8, 9};
        int target = 8;
        System.out.println(OrderBS(arr,target));
    }
    static int OrderBS(int[] arr, int target){
        int start =0;
        int end =arr.length-1;

        boolean isAsc =arr[start] < arr[end];

        while(start <= end){
            int mid =start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid -1;
                }
                else{
                    start= mid+1;
                }
            }
        }
        return -1;
    }
}
