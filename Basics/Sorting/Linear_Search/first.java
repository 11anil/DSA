package Basics.Sorting.Linear_Search;

public class first {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 78 };
        int Target = 78;
        int ans = LinearSearch(nums, Target);
        System.out.println(ans);
    }

    // Search in the array : return the index if item found
    // otherwise if the item not found return -1
    static int LinearSearch(int[] arr, int Target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == Target) {
                return index;
            }
        }
        return -1;
    }
}
