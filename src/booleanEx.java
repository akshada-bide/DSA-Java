public class booleanEx {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        boolean ans = LinearSearch(arr,target);
        System.out.println(ans);
    }
    static boolean LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element:arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
