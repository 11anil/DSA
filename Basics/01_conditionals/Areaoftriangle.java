import java.util.*;
public class Areaoftriangle {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
    //  int b,h = 0;
     System.out.println("enter the height of the triangle: ");
     double h = sc.nextDouble();
     System.out.println("enter the base of traingle: ");
     double b = sc.nextDouble();

     double area = h*b/2;
     System.out.println("area of a triangle is : " + area);
     sc.close();
    }
}
