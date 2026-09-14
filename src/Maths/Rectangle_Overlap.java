package Maths;

//Leetcode 836 : Rectangle Overlap
public class Rectangle_Overlap {
    public static void main(String[] args){
        int[] rec1 = {0,0,2,2};
        int[] rec2 = {1,1,3,3};
        System.out.println(isRectangleOverlap(rec1, rec2));
    }
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] ||
                rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
            // the line cannot have positive overlap
            return false;
        }

        return !(rec1[2] <= rec2[0] ||   // left
                rec1[3] <= rec2[1] ||   // bottom
                rec1[0] >= rec2[2] ||   // right
                rec1[1] >= rec2[3]);    // top
    }
}
