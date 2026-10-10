package String;

//Leetcode 1662: Check if two string arrays are equivalent
public class LeetCode_1662 {
    public static void main(String[] args){
        String[] word1 = {"a", "bc"};
        String[] word2 = {"ab" ,"c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String s1 = "";
        String s2 = "";
        for(int i =0; i< word1.length; i++){
            s1 = s1 + word1[i];
        }
        for(int i=0; i<word2.length; i++){
            s2 = s2 +word2[i];
        }
        if(s1.equals(s2)){
            return true;
        }

        return false;
    }
}
