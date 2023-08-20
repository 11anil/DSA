package Basics.Functions_and_methods;

import java.util.*;

public class Sum {

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number");
        int num2 = sc.nextInt();
    
        int sum = num1 + num2;
        System.out.println("The sum of two num is : " + sum);

        sc.close();
    
        }
        
     
    public static void main(String args[]) {

        sum();

    } 
    
}
