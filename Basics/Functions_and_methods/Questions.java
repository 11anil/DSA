// 1 . Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


package Basics.Functions_and_methods;

import java.util.*;

public class Questions {

    static int maximum(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }

    static int minimum(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }

        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        System.out.println("Maximum of three numbers is : " + maximum(first, second, third));
        System.out.println("Minimum of three numbers is : " + minimum(first, second, third));

        sc.close();
    }

}
