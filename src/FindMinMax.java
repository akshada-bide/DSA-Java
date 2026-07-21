public class FindMinMax {
    public static void main(String[] args){
        int[] arr ={-2, -4, 5, 6, 7, 9, 67};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr){
        if(arr.length==0){
            return-1;
        }
        int ans = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    
    static int max(int[] arr){
        int ans =arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[1] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
