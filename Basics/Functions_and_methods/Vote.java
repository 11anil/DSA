package Basics.Functions_and_methods;
import java.util.*;
public class Vote {
    static void Eligible(){
        System.out.print("Enter Your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
        System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible");
        }
        sc.close();
    }
    public static void main(String[] args) {
        Eligible();
    }
}
