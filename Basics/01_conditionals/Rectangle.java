import java.util.*;
public class Rectangle {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the Width of rectangle : ");
    int w = sc.nextInt();
    System.out.println("enter the length of rectangle : ");
    int l = sc.nextInt();
    int area = w*l;
    System.out.println("The Area of rectangle is : " + area);
    sc.close();
    }
}
