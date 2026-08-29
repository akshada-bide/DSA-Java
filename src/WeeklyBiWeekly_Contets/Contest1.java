package WeeklyBiWeekly_Contets;

//LeetCode 4010: Maximum Pair Strength using GCD
public class Contest1 {
    public static void main(String[] args){
        int[] nums = {2,3,5};
        System.out.println(maxPairStrength(nums));

    }
    static long maxPairStrength(int[] nums) {
        long ans=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int g = gcd(nums[i], nums[j]);

                long strength = (1L * nums[i] * nums[j])/(1L *g *g);

                ans = Math.max(ans, strength);
            }
        }
        return ans;
    }
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
