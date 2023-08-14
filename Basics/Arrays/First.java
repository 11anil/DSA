package Basics.Arrays;
import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) { // Change "i <= arr.length" to "i < arr.length"
            arr[i] = sc.nextInt();
        }
        
        // for (int i = 0; i < arr.length; i++) { // Change "i <= arr.length" to "i < arr.length"
        //     System.out.print(arr[i] + " ");
        // }

    //   For each loop in java

    // syntax looks like this

    // (datatype ref variable : typr_of_data){
    //     System.out.print(ref variable);
    // }

        for(int num : arr){
            System.out.print(num + " "); // here num represents element of the array
        }
        
        sc.close();
    }
}
