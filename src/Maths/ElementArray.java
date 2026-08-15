package Maths;

//LeetCode 1464: Max Product of two element in an array
public class ElementArray {
    public static void main(String[] args){
        int[] nums = {2,3,4,5};
        System.out.println(maxProduct(nums));

    }
    static int maxProduct(int[] nums){
        int max = nums[0];
        int max2 = nums[0];

        for(int i=0; i<nums.length;i++){
            if(nums[i] > max){
                max2 = max;
                max = nums[i];
            }
             else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        //(nums[i]-1)*(nums[j]-1)
        return (max-1)*(max2-1);

    }
}
