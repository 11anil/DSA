import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // System.out.println('a' + 'b');
        // System.out.println("a" + "b");
        // System.out.println((char)('a' + 3));

        // System.out.println("a" + 1);
        //this is same as after a few steps "a" + "1"
        //Integer will be converted to integer that will be called tostring().
        
        // System.out.println("anil" + new ArrayList<>());
        System.out.println("Anil " + new ArrayList<>());
        System.out.println("Anil" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    } 



}
