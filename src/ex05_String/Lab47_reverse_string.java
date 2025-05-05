package ex05_String;

public class Lab47_reverse_string {
    public static void main(String[] args) {

        String str = "Hello";
        String reversedstr = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed String:" + reversedstr);

    }
}
