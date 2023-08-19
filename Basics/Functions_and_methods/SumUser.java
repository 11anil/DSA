//Q- Write a program to print the sum of two numbers entered by user by defining your own method.

package Basics.Functions_and_methods;

import java.util.*;

public class SumUser {

    static void Sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int b = sc.nextInt();
        int Sum = a+b;
        System.out.println("The Sum Of Two Numbers is = : " + Sum);
        sc.close();
    }

    public static void main(String[] args) {
      Sum();
    }
}
