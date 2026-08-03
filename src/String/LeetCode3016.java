package String;

import java.util.Arrays;

public class LeetCode3016 {
    public static void main(String[] args){
        String word = "xyzxyzyxzyxz";
        System.out.println(MinimumPushes(word));
    }
    static int MinimumPushes(String word){
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);
        int ans = 0;
        int idx = 0;

        for(int i = 25; i>=0; i--){
            if(freq[i] == 0) continue;
            ans += freq[i] * ((idx/8) + 1);
            idx++;
        }
        return ans;
    }

}
