// Ceiling of a Number leetcode  => //smallest num greator tha or = target num



package Basics.Sorting.Binary_Search;

public class CelingNumber {
    public static void main(String args[]) {
        int[]arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }
    static int Ceiling(int[] arr,int target){

        //but what if my target element is greator than the greatest element in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <=end){
            //find the middle element
            int mid = start + (end - start)/2;
            
            if(target < arr[mid]){
              end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return mid;
            }
        }
          return start;
    }
}
