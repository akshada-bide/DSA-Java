package Maths;

//Leetcode 3870: Count Commas in Range
public class LeetCode_3870 {
    public static void main(String[] args){
        int n = 1002;
        System.out.println(countCommas(n));
    }
    static int countCommas(int n){
        int count =0;
        for(int i=1; i<=n; ++i){
            if(i>999){
                count++;
            }
        }
        return count;
    }
}
