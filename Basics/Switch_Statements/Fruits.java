package Basics.Switch_Statements;
import java.util.*;

public class Fruits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fruits = sc.next();

        switch (fruits) {
            case "mango" :
            System.out.println("King of fruits");
            break;

            case "Apple" :
            System.out.println("A sweet red food");
            break;

            case "Orange" :
            System.out.println("tasty and healthy");
            break;

            default:
            System.out.println("please enter a valid food name");

        }
        sc.close();
    }
    }

