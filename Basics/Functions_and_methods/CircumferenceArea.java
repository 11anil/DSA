//Que : Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

package Basics.Functions_and_methods;
import java.util.*;
public class CircumferenceArea {
    static void CircumferencAreaofacircle(){
      double pi = 3.14;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius : ");
      int r = sc.nextInt();
      double area = pi * r * r;
      System.out.println("Area of a circle is : " + area);

    
      double circumference = 2 * pi * r;
      System.out.println("Circumference of a circle is : " + circumference);
      sc.close();
    }
    public static void main(String[] args) {
        CircumferencAreaofacircle();
    }
}
