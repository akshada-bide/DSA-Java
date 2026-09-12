package Maths;

//LeetCode 3871: count commas in range II
public class LeetCode_3871 {
    public static void main(String[] args){
        int n = 1002;
        System.out.println(countCommas(n));
    }
    public static long countCommas(long n) {
        long p = 1000, res = 0;
        while (p <= n) {
            res += n - p + 1;
            p *= 1000;
        }
        return res;
    }
}
