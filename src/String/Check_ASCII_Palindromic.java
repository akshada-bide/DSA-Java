package String;

//Leetcode Contest 516-1: Check ASCII Palindromic
public class Check_ASCII_Palindromic {
    public static void main(String[] args){
        String str = "fuhy";
        System.out.println(isPalindromic(str));
        
    }
    public static boolean isPalindromic(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        StringBuilder binary = new StringBuilder();

        // Convert every character to 8-bit binary
        for (char ch : s.toCharArray()) {
            String bin = Integer.toBinaryString((int) ch);

            // Add leading zeros to make it 8 bits
            while (bin.length() < 8) {
                bin = "0" + bin;
            }

            binary.append(bin);
        }

        // Check whether the binary string is a palindrome
        int left = 0;
        int right = binary.length() - 1;

        while (left < right) {
            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
