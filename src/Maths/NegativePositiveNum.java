package Maths;

public class NegativePositiveNum {
    public static void main(String[] args){
        int[] arr = {-2,3,2,4,-4};
        System.out.println(check(arr));
    }
    static int check(int[] arr){
        int single =0;
        for(int n : arr){
            single += n;
        }
        return single;
    }
}
