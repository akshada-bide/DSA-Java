package String;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args){
        String s = "Hello World";
        isReverse(s);
//      System.out.println((s));

    }
    //to reverse the word
    static String isReverse(String s) {
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        return "";
    }

}
