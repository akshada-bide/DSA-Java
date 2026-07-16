package String;

import java.util.Arrays;

public class Method {
    public static void main(String[] args){
        String name = "Hello Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); //creating new object
        System.out.println(name); //original obj remains as it is
        System.out.println(name.indexOf('a'));
        System.out.println("  Kunal  ".strip()); //remove start  & end space
        System.out.println(Arrays.toString(name.split(" "))); //one space in the " ", therefore it will cut single space between letter
        System.out.println(name.lastIndexOf('h'));
        System.out.println(name.concat("ku"));

    }

}

