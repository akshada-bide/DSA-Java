package String;

//LeetCode 1832: Check if the sentence is Panagram
//Panagram: contain each lowercase alphabet at least once
import java.util.HashMap;

//Method 1 :  Using HashMap
public class LeetCode_1832_Panagram {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIsPanagram(sentence));
    }
    static boolean checkIsPanagram(String s){
        HashMap<Character, Boolean> map = new HashMap<>();
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put((s.charAt(i)), true);
                count++;
            }
        }
        if(map.size() == 26){
            return true;
        }
        return false;
    }
}

/*
//Method 2: Using Array
    static boolean checkIsPanagram(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }
        if(count == 26){
            return true;
        }

        return false;
    }
}
*/
