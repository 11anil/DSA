package Basics.Switch_Statements;

import java.util.*;

public class Empl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int EmplId = sc.nextInt();
        String department = sc.next();
        switch (EmplId) {
            case 1:
                System.out.println("Anil Kumar");
                break;

            case 2:
                System.out.println("Vivek");
        }

        switch (department) {
            case "IT":
                System.out.println("IT department");
                break;

            case "management":
                System.out.println("management department");
                break;

            default:
                System.out.println("please enter a valid department");
        }
        sc.close();

    }
}
