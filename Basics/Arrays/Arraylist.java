package Basics.Arrays;
import java.util.ArrayList;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(5);
       Scanner in = new Scanner(System.in);

    //    list.add(45);
    //    list.add(6);
    //    list.add(8);

    //    list.add(45);
    //    list.add(6);
    //    list.add(8);
    //    list.add(45);
    //    list.add(6);
    //    list.add(8);
    //    list.add(45);
    //    list.add(6);
    //    list.add(8);

    //    System.out.println(list);
    //    System.out.println(list.contains(45));

    //input

    for(int i=0; i<=5; i++){
        list.add(in.nextInt());
    }

    // get item at any index

    for(int i=0; i<=5; i++){
        System.out.println(list.get(i));  //pass index here, list[index] syntax will not work here
    }
       System.out.println(list);
    }
    
}
