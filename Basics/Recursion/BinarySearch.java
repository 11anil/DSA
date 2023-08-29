package Basics.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 4; // Added the missing data type declaration 'int'
        System.out.println(Search(arr, target, 0, arr.length - 1));
    }

    static int Search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        } else if (target < arr[m]) {
            return Search(arr, target, s, m - 1);
        } else {
            return Search(arr, target, m + 1, e);
        }
    }
}
