package Basics.Arrays.Solutions;
class Permutation {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
    
    public static void main(String[] args) {
        Permutation Permutation = new Permutation();
        
        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] result = Permutation.buildArray(nums);
        
        System.out.println("Generated array from permutation:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
