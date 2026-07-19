package String;

public class Comparator {
    public static void main(String[] args){
        String a = "kunal";
        String b = "Kunal";
        System.out.println(a == b);

        String a1 = new String("Kunal");
        String b1 = new String("Kunal");

        System.out.println(a == b); //comparator to compare object
        System.out.println(a1.charAt(2)); // n
        System.out.println(a1.equals(b1)); //method to compare value

    }
}
