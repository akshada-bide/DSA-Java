package WeeklyBiWeekly_Contets;

//LeetCode 4088: Difference between peak and valleys
public class Contest4 {
    public static void main(String[] args){
        int[] nums = {1,5,2,4,1,3,0};
        System.out.println(peakValleyDifference(nums));
    }
    public static int peakValleyDifference(int[] nums){
        int peak =0;
        int valley =0;
        for(int i=1; i< nums.length-1; i++){

                if(nums[i] > nums[i - 1] && nums[i] > nums[i+1]){
                    peak += nums[i];
                }else if(nums[i] < nums[i - 1] && nums[i] < nums[i+1]){
                    valley += nums[i];
                }

        }
        int diff = peak - valley;
        return diff;
    }

}

