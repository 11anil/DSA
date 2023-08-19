//Q- Define a method that returns the product of two numbers entered by use

package Basics.Functions_and_methods;
import java.util.*;
public class Productuser {
    static void Product(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = in.nextInt();
        System.out.println("Enter the Second number : ");
        int b = in.nextInt();
        int Product = a * b;
        System.out.println("The Product of two num is : " + Product);
        in.close();
    }
    public static void main(String[] args) {
        Product();
    }
}
