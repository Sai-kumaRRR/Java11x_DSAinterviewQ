package ex05_String;

public class Lab43_Immutable_String02 {
    public static void main(String[] args) {
        String str = "Hello";
        // Attempt to change to string
        str.concat(", world");
        //original string remains unchanged
        System.out.println(str);
    }
}
