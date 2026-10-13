package Maths;

//LeetCode 2778: Sum of square of special elements
public class LeetCode_2778 {
    public static void main(String[] args){
        int[] nums = {2,7,1,19,18,3};
        System.out.println(sumOfSquares(nums));
    }
    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int  i=0; i<nums.length; i++){
            int n = nums.length;
            if(n % (i+ 1) == 0){
                sum = sum + (nums[i] * nums[i]);
            }
        }
        return sum;
    }
}
