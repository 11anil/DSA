package Basics.Arrays;

public class Maxvalue {
    public static void main(String args[]){
        int[]arr = {1,3,23,4,45};
        System.out.println (maxrange(arr,2,4));
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

static int maxrange(int[] arr,int start ,int end){
 int maxrange = arr[3];
 for(int i=start; i<end; i++){
    if(maxrange<arr[i]){
        maxrange = arr[i];
    }
 }
 return maxrange;
}


}
