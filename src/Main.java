//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i <arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}