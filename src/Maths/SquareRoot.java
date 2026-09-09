package Maths;

//find square root of perfect square
public class SquareRoot {
    public static void main(String[] args){
        int n = 36;
        System.out.println(square(n));
    }
    static int square(int n){
        int s =0;
        int e= n;

        for(int i=0; i<=n;i++){
            int mid = s+(e-s)/2;
            if(mid * mid >n){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;

    }
}
