package HashCode;

import java.util.HashSet;

public class FindUnionIntersection {
    public static void main(String[] args){
        int[] nums1 = { 7, 3, 9};
        int[] nums2 = {6,3,9,2,1,4};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }
        //print set
        System.out.println("Union : "+ set.size());
        System.out.println(set);

        set.clear();
        //Intersection : Unique Element
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }
        int count=0;
        for(int i=0; i< nums1.length; i++){
            if(set.contains(nums1[i])){
                count++;
                set.remove(nums1[i]);

            }
        }
        System.out.println("Intersection : "+count);
        System.out.println(set);

    }
}
