package Maths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingElement {
    public static void main(String[] args){
        int[] nums = {1,4,2,5};
        System.out.println(findMissingElements(nums));

    }
    static List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = min + 1; i<max; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;

    }
}
