package Maths;

//LeetCode 3345 : Smallest Divisible Digit Product I

//What is the time complexity?
    //Ans --> digit() takes O(log n), and
// since it may be called multiple times while incrementing n,
// the overall complexity is O(k × log n),
// where k is the number of iterations until a valid number is found.
public class DigitProduct {
    public static void main(String[] args){
        int n = 15;
        int t = 3;
        System.out.println(SmallestNum(n, t));
    }
    static int SmallestNum(int n, int t){
        while(digit(n) % t != 0){
            n++;
        }
        return n;
    }
    static int digit(int n){
        if(n==0){
            return 0;
        }
        int product =1;
        while(n>0){
            int digit = n % 10;
            product = product * digit;
            n = n/10;
        }
        return product;
    }
}
