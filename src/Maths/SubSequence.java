package Maths;

//LeetCode 3702: Longest subsequence with non-zero bitwise XOR
public class SubSequence {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(longestSubsequence(nums));
    }
    public static int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int zeroCount = 0;

        for (int num : nums) {
            xor ^= num;

            if (num == 0) {
                zeroCount++;
            }
        }

        // Case 1: Whole array has non-zero XOR
        if (xor != 0) {
            return n;
        }

        // Case 2: All elements are zero
        if (zeroCount == n) {
            return 0;
        }

        // Case 3: XOR is zero but there is a non-zero element
        return n - 1;

    }
}
