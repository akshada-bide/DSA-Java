public class StringEx {
    public static void main(String[] args){
        String name = "Akshada";
        char target ='s';
        System.out.println(Search(name, target));
        System.out.println(Search2(name, target));
    }
    static int Search(String str, char target){
        if(str.length() == 0){
            return -1;
        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    static boolean Search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()) {
            if(ch ==target){
                return true;
            }
        }
        return false;

    }
}
