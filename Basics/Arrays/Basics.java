package Basics.Arrays;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Syntax
        // datatype[] variable_name = new dataype[size];

        // int[] rnos = new int[6];

        // or directly

        // int[] rnos2 = {23 , 4 ,5};

        // int[] ros; // decleration of array. ros is getting defined in the stack
        // ros = new int[5]; //initialisation: actually here object is being created in
        // the heap

        // System.out.println(ros[1]);
        // String[] arr = new String[4];
        // System.out.println(arr[0]);

        // you cannot assign a null (it is a literal ) to any premitive datatype u just
        // assigned it to a non primitive datatype.

        // example
        // String str = null;(right)
        //  int num = null;(Wrong)

        // any ref variable that u have bydefault its going to be of null

 
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
           str[i] = sc.next();
        }
       System.out.println(Arrays.toString(str));
       sc.close();
    }
}
