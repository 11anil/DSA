package Basics.Sorting.Linear_Search;

import java.util.Arrays;

public class Searchin2darr {
    public static void main(String[] args) {
        int[][] arr = {
                      {1,3,4,6},
                      {13,4,26,17},
                      {3,36,37,4},
                      {33,16,7,8}
        };

           int target = 33; 
           int[] ans =  search(arr,target);
           System.out.println(Arrays.toString(ans));       
        }
        static int[] search(int[][] arr, int target){
          for(int row=0; row<arr.length; row++){
          for(int col=0; col<arr[row].length; col++){
            if(arr[row][col]== target){
                return new int[]{row,col};
            }
          }
          
          }
          return new int[]{-1,-1};
        }
    }
