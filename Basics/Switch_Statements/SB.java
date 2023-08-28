package Basics.Switch_Statements;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<=26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());  //here you dont need toString()  //this is mutable like array you can changed Stringbuilder also
    }

}
