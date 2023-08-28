public class Example {
    public static void main(String[] args) {
        // int[] arr = { 2, 3, 5, 4, 19 };
        String name = "Anil Kumar";

        // here String is a datatype ,name is a reference variable," Anil kumar" is an

        // object

        // Stringpool is a separate memory structure inside the heap memory

        System.out.println(name);

        String a = new String("Anil");
        String b = new String("Anil");

        System.out.println(a == b);

        String c = "Anil";
        String d = "Anil";

        System.out.println(c == d);

        String name1 = new String ("Kumar");
        String name2 = new String ("Kumar");

        //for checking the equality of the objects

        System.out.println((name1).equals(name2));

        //for checking the index of particular character
        System.out.println(name1.charAt(0));
    }
}