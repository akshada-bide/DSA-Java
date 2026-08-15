package String;

//LeetCode 3014: Minimum Number Of Pushes to Type Word I
public class LeetCode3014 {
    public static void main(String[] args){
        String word ="abcde";
        System.out.println(minimumPushes(word));
    }
    static int minimumPushes(String word) {
        int ans=0;
        for(int i=0; i<word.length(); i++){
            ans += (i/8) + 1;
        }
        return ans;
    }
}
