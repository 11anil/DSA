package Basics.Functions_and_methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String args[]){
        int[] arr = {0,1,3,55,4};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
  static void Change(int[] nums){
    nums[0] = 99; //if u make a change to the object  via this  ref varble , same object will be changed

  }
}
