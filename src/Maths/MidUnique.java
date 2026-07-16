package Maths;

public class MidUnique {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(isMiddleElementUnique(nums));
    }
    static boolean isMiddleElementUnique(int[] nums){
        int count =0;
        int mid = nums.length/2;  //mid is an index , not an element
        int middleElement = nums[mid];

        for(int n:nums){

            if(n == middleElement){
                count++;
            }
        }
        return count == 1;
    }
}
