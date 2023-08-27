package Basics.Arrays;
public class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Concatenation solution = new Concatenation();

        int[] nums1 = {1, 2, 1};
        int[] ans1 = solution.getConcatenation(nums1);
        for (int num : ans1) {
            System.out.print(num + " ");
        }
        // Output: 1 2 1 1 2 1
        System.out.println();

        int[] nums2 = {1, 3, 2, 1};
        int[] ans2 = solution.getConcatenation(nums2);
        for (int num : ans2) {
            System.out.print(num + " ");
        }
        // Output: 1 3 2 1 1 3 2 1
        System.out.println();
    }
}
