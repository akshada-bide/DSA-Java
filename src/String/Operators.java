package String;

//operator overloading: it means giving more functionalities
//on string obj , + operator being overloaded

public class Operators {
    public static void main(String[] args){
        System.out.println('a' + 'b');  //add asci value
        System.out.println("a" + "b");  //ab
        System.out.println('a' + 3); //100
        System.out.println((char)('a' + 3)); //d 
        System.out.println("a" + 1);  //a1
        //integer will be converted to Integer that will call toString()
        System.out.println("a"+ 'b'); //ab :- if one of the datatype is string output will be string



    }
}
