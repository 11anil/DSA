package Basics.Arrays;

import java.util.*;

public class Twod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }

        }

        // Output
        // for(int row =0; row<arr.length; row++){
        // for(int col=0; col<arr[row].length; col++){
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // Another way to do that

        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //note: Datatype of every single lement in a array is itself array

        //by enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
}
