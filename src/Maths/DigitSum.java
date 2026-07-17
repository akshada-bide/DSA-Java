package Maths;

//LeetCode 2544: Alternating digit sum
public class DigitSum {
    public static void main(String[] args){
        int n = 521;
        System.out.println(alternateDigitSum(n));
    }
    static int alternateDigitSum(int n){
        String s = Integer.toString(n);
        int sum = 0;
        
        for(int i=0; i<s.length(); i++){
            int digit = s.charAt(i) - '0';

            if(i % 2 == 0){
                sum += digit;
            }else{
                sum -= digit;
            }
        }
        return sum;
    }
}
