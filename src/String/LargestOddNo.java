package String;

public class LargestOddNo {
    public static void main(String[] args) {
        String s = "5347";
        System.out.println(largeOddNum(s));

    }

    //LeetCode 1903 :Largest Odd Number in String
    static String largeOddNum(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";

    }

}
//    //Striver  removes leading zeros
//    static String largeOddNum1(String s){
//        for(int i = s.length()-1; i>=0; i--){
//            char ch = s.charAt(i);
//            if((ch -'0') % 2 != 0){
//                String ans = s.substring(0,i+1);
//                int j =0;
//                while(j < ans.length() && ans.charAt(j) =='0'){
//                    j++;
//                }
//                return ans.substring(j);
//            }
//        }
//        return "";

//    }
//}
