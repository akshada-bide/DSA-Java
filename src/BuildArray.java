import java.util.Arrays;

//leetcode : 1920
public class BuildArray {
    public static void main(String[] args){
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(build(nums)));
    }
    static int[] build(int[] nums){
        int[] ans = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;

    }
}
