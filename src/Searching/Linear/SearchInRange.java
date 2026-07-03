package Searching.Linear;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 6;
        int a=3;
        int b=7;
        System.out.println(Search(arr,target,a,b));
    }
    static int Search(int[] arr, int target,int a, int b){
        if(arr.length==0){
            return -1;
        }
        for(int i=a; i<=b;i++ ){
            int element= arr[i];
            if(element == target){
                return i ;
            }

        }
        return -1;
    }
}

