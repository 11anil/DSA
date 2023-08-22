package Basics.Sorting.Linear_Search;

public class FIndEvennumber {
    public static void main(String[] args) {
        int nums[] = { 12, 3, 452, 1234, 4 };
        System.out.println(FindEvennumber(nums));
        System.out.println(digits(-0));
    }

    static int FindEvennumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }

        }
        return count++;
    }

    // functn to check weither a number is contain even digits or not
    static boolean even(int num) {
        int numofDigits = digits(num);
        if (numofDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    // count num of digits in a number
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;

        }
        return count;
    }
}
