package String;
//LeetCode 58: Length of Last Word
public class LengthOfLastWord {
    public static void main(String[] args){
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }
    static int lengthOfLastWord(String s){
        int count =0;
        for(int i =s.length()-1; i>=0;i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    return count;
                }
            }
        }    return count;
    }
}
