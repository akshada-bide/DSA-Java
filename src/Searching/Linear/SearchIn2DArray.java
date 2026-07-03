package Searching.Linear;

import java.util.Arrays;

public class SearchIn2DArray {
        public static void main(String[] args){
            int[][] arr = {
                    {2 ,3 ,4 ,5 ,6},
                    {33 ,44 ,55 ,66},
                    {45 ,54}
            };
            int target = 55;
            int[] ans = Search(arr,target); //format of return value{row,col}
            System.out.println(Arrays.toString(ans));
            System.out.println(max(arr));
        }
        static int[] Search(int[][] arr, int target){
            for(int row =0; row<arr.length; row++){
                for(int col =0; col<arr.length; col++){
                    if(arr[row][col] == target){
                        return new int[]{row,col}; //initialized the array --> new int[]
                        //it is not declare anywhere(missing--> int[][] arr  part) ,so create object using 'new' keyword
                    }
                }
            }
            return new int[]{-1,-1};
        }
        static int max(int[][] arr){
            int max = Integer.MIN_VALUE;
            for(int row=0; row<arr.length;row++){
                for(int col=0; col<arr.length;col++){
                    if(arr[row][col] > max ){
                        max = arr[row][col];
                    }
                }
            }
            return max;

        }

    }


