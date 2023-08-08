import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Pi = 3.14, area;
        int r = 0;
        System.out.println("Enter the radius of circle : ");
        r = sc.nextInt();
        area = Pi * r * r;
        System.out.println("Area of circle is : " + area);
        sc.close();
    }
}
