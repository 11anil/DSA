package Basics.Arrays;

public class Maxvalue {
    public static void main(String args[]){
        int[]arr = {1,3,23,4,45};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
       int maxval = arr[0];
       for(int i=1; i<arr.length; i++){
        if(maxval<arr[i]){
            maxval = arr[i];
        }
    }
    return maxval;
}
}
