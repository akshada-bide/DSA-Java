import java.util.Arrays;

//Leetcode: 1480
public class runningSum {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sum(nums)));

    }

    static int[] sum(int[] nums){
        int sum =0;
        for(int i =0; i<nums.length; i++){
            sum = sum +nums[i];
            nums[i] = sum;

        }
        return nums;
    }

}
