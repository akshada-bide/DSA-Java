package Maths;

public class IsPrime {
    public static void main(String[] args){
//        System.out.println(prime(56));
        int n=20;
        for(int i=2; i<=n; i++) {
            System.out.println(i + " " + checkPrime(n));
        }  
    }
    /*
    static boolean prime(int n){
        for(int i=2; i<n; i++){
            if(n/i == 0) {
                return true;
            }
        }
        return false;
    }
     */
    static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        }
        int c=2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
