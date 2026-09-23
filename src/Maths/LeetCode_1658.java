package Maths;

public class LeetCode_1658 {
    public static void main(String[] args){
        int[] nums ={1,1,4,3,2};
        int x = 5;
        System.out.println(minOperations(nums, x));
    }
    public static int minOperations(int[] nums, int x){
        int totalSum = 0;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;

        // If target is negative, impossible
        if (target < 0) {
            return -1;
        }

        int left = 0;
        int sum = 0;
        int maxLength = -1;

        // Sliding window
        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            // Shrink window if sum becomes greater than target
            while (sum > target && left <= right) {
                sum -= nums[left];
                left++;
            }

            // Found a subarray with required sum
            if (sum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        // No valid subarray
        if (maxLength == -1) {
            return -1;
        }

        return nums.length - maxLength;
    }
}
