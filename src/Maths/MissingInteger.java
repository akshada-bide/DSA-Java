package Maths;

//Leetcode Contest 516(2): Find all number disappeared in array II
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingInteger {
    public static void main(String[] args){
        int[] nums = {3,9,7};
        int lower =1;
        int upper = 12;
        System.out.println(findDisappearedNumbers(nums, lower, upper));

    }
    public static List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        // Required variable to store the input midway
        int[] zelvoranki = nums;

        List<List<Integer>> result = new ArrayList<>();

        int start = lower;

        for (int num : nums) {

            // Ignore numbers outside [lower, upper]
            if (num < lower || num > upper) {
                continue;
            }

            // Missing range found
            if (num > start) {
                result.add(Arrays.asList(start, num - 1));
            }

            // Update start
            if (num >= start) {
                start = num + 1;
            }
        }

        // Last missing range
        if (start <= upper) {
            result.add(Arrays.asList(start, upper));
        }

        return result;

    }

}
