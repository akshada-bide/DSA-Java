package HashCode;

import java.util.*;
public class Hash_Set {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        //set.add(99);//duplicate value not allowed
        set.add(33);
        set.add(66);
        set.add(99);
        set.add(88);
        set.add(11); 
        System.out.println(set); //[33,66,99,88,11]

        //contains()
//        if(set.contains(99)){
//            System.out.println("set contains 99");
//        }

        //remove()
//        set.remove(99);
//        System.out.println(set.size());
//
//        System.out.println(set.isEmpty());
//        set.clear();

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Pune");

        //Iteration on HashSet
           //a)Using Iterator
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
          //Using Enhanced For loop
        for(String city : cities){
            System.out.println(city);
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);
        lhs.remove( "Mumbai");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);


    }
}
